package day_0402;

import java.util.Scanner;

public class Grading {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("점수를 입력하세요(0~100): ");
		int score = scanner.nextInt(); // 점수 읽기
		char grade = 'F';
		
		switch(score/10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			System.out.println("재수강 필요합니다.");
			grade = 'F';
			
			// case문은 실수 허용 안됨.
		
		}
		
//		if(score >= 90) // score가 90 이상
//			grade = 'A';
//		else if(score >= 80) // score가 80 이상 90 미만
//			grade = 'B';
//		else if(score >= 70) // score가 70 이상 80 미만
//			grade = 'C';
//		else if(score >= 60) // score가 60 이상 70 미만
//			grade = 'D';
//		else // score가 60 미만
//			grade = 'F';
		System.out.println("학점은 "+ grade + "입니다.");
		
		scanner.close();
	}
}