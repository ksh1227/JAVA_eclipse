package day_0409;

public class NestedLoop {
	public static void main(String[] args) {
//		for(int i=1; i<10; i++) { // 1단에서 9단
//			for(int j=1; j<10; j++) { // 각 단의 구구셈 출력
//				System.out.print(i + "*" + j + "=" + i*j); // 구구셈 출력
//				System.out.print('\t'); // 하나씩 탭으로 띄기
//			}
//			System.out.println("-------------------------------"); // 한 단이 끝나면 다음 줄로 커서 이동
		
	System.out.println("----------------------------------------------"); 
		for(int i=1; i<10; i++) {
			for(int j=2; j<10; j++) {
//				if(j==5)continue;      //구구단에서 5단 제외
				if(j==5)break;		//5단 이후 제외
				System.out.printf(" %d*%d= %d |",j,i,i*j);
				
			}
			System.out.println();
		}
	}
}
