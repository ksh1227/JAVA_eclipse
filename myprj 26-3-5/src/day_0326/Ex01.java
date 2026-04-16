package day_0326;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		System.out.println("키보드로 데이터를 입력하시오.");
//		System.in
		Scanner scanner  = new Scanner(System.in);
//		홍길동 서울 22 59.5 false
		
		String name = scanner.next();
		String city = scanner.next();
		int age = scanner.nextInt();
		double weigh = scanner.nextDouble();
		boolean single = scanner.nextBoolean();
		
		System.out.println("이 름: "+name); // print+ln <-- 다음줄 줄바꿈 출력
		System.out.print("도 시: "+city+"\n"); // "\n" <-- 다음줄 줄바꿈 출력
		System.out.println("나 이: "+age);
		System.out.println("몸무게: "+weigh);
		System.out.println("결혼?: "+single);
		
		scanner.close();  //스캐너는 무조건 close로 닫아야함
		scanner = null;
	}

}
