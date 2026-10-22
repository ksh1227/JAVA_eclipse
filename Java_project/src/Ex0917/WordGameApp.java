package Ex0917;

import java.util.ArrayList; // 참가자 이름 중복 체크 기능용 임포트
import java.util.Scanner;

public class WordGameApp {
	private Scanner scanner; // 키보드 입력
	private String startWord; // 사용자가 시작 단어를 직접 지정할 수 있도록 수정함
	private Player[] players; // 게임 참가자들
	String[] wordList = new String[100]; 

    private int wordCount = 0; // wordList에 저장된 단어 개수를 카운트하기 위해 추가함

	public WordGameApp() {
		scanner = new Scanner(System.in);	
	}

	// 게임 참가자 수를 입력받고 Player []을 생성하는 메소드
	private void createPlayers() {
		System.out.print("게임에 참가하는 인원은 몇명입니까>>");
		int nPlayers = scanner.nextInt();
		players = new Player[nPlayers]; // Player [] 레퍼런스 배열 생성
		
		ArrayList<String> playerNames = new ArrayList<>(); // 참가자 이름 중복 체크용 리스트 추가함
		
		// 각 참여자의 이름을 입력받아 Player 객체 생성
		for(int i=0; i<nPlayers; i++) {
			System.out.print("참가자의 이름을 입력하세요>>");
			String name = scanner.next();
			
			// 참가자 이름 중복 방지 기능 추가함
			if (playerNames.contains(name)) {
				System.out.println("[오류] 이미 존재하는 이름입니다. 다른 이름을 입력해주세요.");
				i--; // 인덱스 감소시켜 재입력 유도함
				continue;
			}
			
			playerNames.add(name);
			players[i] = new Player(name);
		}		
	}
	
	// 사용자에게 직접 시작 단어를 입력받는 기능 추가함
	private void inputStartWord() {
		while (true) {
			System.out.print("시작할 단어를 입력하세요>>");
			String word = scanner.next();
			
			// 글자 수 제한 기능 추가함 (2자10자)
			if (word.length() < 2 || word.length() > 10) {
				System.out.println("[오류] 시작 단어는 2글자 이상, 10글자 이하로 입력해 주세요.");
				continue;
			}
			
			// 한글 단너 검사 기능 추가함 (없는 단어 창조 방지)
			if (!word.matches("^[가-힣]+$")) {
				System.out.println("[오류] 올바른 한글 단어가 아닙니다.");
				continue;
			}
			
			startWord = word;
			break;
		}
	}
	
	// lastWord와 참가자가 입력한 newWord를 비교하여 끝말잇기가 잘되었는지 판단
	// 성공하였으면 true 리턴, 아니면 false 리턴
	// **** 한글자 처리 기능 추가하세요 ..  ****
	public boolean checkSuccess(String lastWord, String newWord) {
		// 한글자 입력 차단 기능 추가함
		if (newWord.length() < 2) {
			System.out.println("[실패] 한 글자 단어는 사용할 수 없습니다.");
			return false;
		}
		
		// 단어 길이 제한 기능 추가함 (최대 10자)
		if (newWord.length() > 10) {
			System.out.println("[실패] 10글자가 넘는 단어는 사용할 수 없습니다.");
			return false;
		}
		
		// 한글 외 문자 차단 기능 추가함
		if (!newWord.matches("^[가-힣]+$")) {
			System.out.println("[실패] 올바른 한글 단어가 아닙니다.");
			return false;
		}
		
		// 중복 단어 입력 방지 기능 추가함 (isDuplicated 사용)
		if (isDuplicated(newWord)) {
			System.out.println("[실패] 이미 사용된 단어입니다.");
			return false;
		}
		
		int lastIndex = lastWord.length()-1; // 최종 단어의 맨 마지막 문자의 인덱스
		
		// 최종 단어의 맨 마지막 문자와 참가자가 말한 단어의 첫 문자가 같은지 비교
		if(lastWord.charAt(lastIndex) == newWord.charAt(0)) {
			// 입력받은 단어를 wordList에 저장하는 코드 추가함
			if (wordCount < wordList.length) {
				wordList[wordCount] = newWord;
				wordCount++;
			}
			return true;
		}
		else
			return false;
	}

	// 중복 검사 코드를 완성하고 활용하세요
    // 코드 설명 추가해주세요
    // 학번 :2501057          이름:김승현
	// 게임 참여자 중복 막음,시작되는 단어 직접 쓸수있게 함,'최대한'(다는못함)없는 단어 창조 방지함,단어 길이 제한함, 한글자와 중복되는 단어 금지함.
	
    private boolean isDuplicated(String word){
	     // wordList 배열에 동일한 단어가 저장되어 있는지 확인하는 순차 탐색 기능 구현함
    	for (int i = 0; i < wordCount; i++) {
    		if (wordList[i].equals(word)) {
    			return true; // 중복 존재함
    		}
    	}
    	return false; // 중복 없음
    }

	
	// 게임을 진행하는 메소드
	public void run() {
		System.out.println("끝말잇기 게임을 시작합니다...");
		createPlayers(); // 참가자를 위한 Player []을 생성한다.
		
		inputStartWord(); // 시작 단어 직접 지정 기능 추가함
		String lastWord = startWord; // startWord에서 부터 시작한다.
		
		// 시작 단어도 중복 방지 처리를 위해 wordList에 저장함
		wordList[wordCount] = startWord;
		wordCount++;

		System.out.println("시작하는 단어는 "+lastWord+ "입니다");
		int next =  0; // 참가자들의 순서대로 증가
		
		// 게임이 끝날 때까지 루프
		while(true) {
			String newWord = players[next].getWordFromUser(); // next 참가자가 단어를 말하도록 한다.
			if(checkSuccess(lastWord, newWord) == false) { // next 참가자가 성공하지 못했다면
				System.out.print(players[next].getName() + "이 졌습니다.");
				break; // 게임을 종료한다.
			}
			next++; // 다음 참가자
			next %= players.length; // next가 참가자의 개수보다 많게 증가하는 것을 막는다.
			lastWord = newWord;
		}
	}
	
	public static void main(String[] args) {
		WordGameApp game = new WordGameApp();
		game.run();
	}
}


// 한 사람의 참가자를 표현하는 클래스
class Player {
	private Scanner scanner; // 키보드 입력
	private String name; // 게임 참가자의 이름
	private String word; // 참가자가 말한 단어
	
	public Player(String name) {
		this.name = name;
		scanner = new Scanner(System.in);	
	}
	
	public String getName() {return name;}
	
	public String getWordFromUser() {
		System.out.print(name+">>");
		word = scanner.next();
		return word;
	}
	
}
