package day_0409;

import java.util.Scanner;

public class BreakExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("exit을 입력하면 종료합니다.");
		while(true) {
			System.out.print(">>");
			String text = scanner.nextLine();
//			if(text.equals("exit")) // "exit"이 입력되면 반복 종료,대소문자 구분함
//				break; // while 문을 벗어남

			if(text.equalsIgnoreCase("exit"))break; // .equalsIgnoreCase 대소문자 구별x

		}
		System.out.println("종료합니다...");

		scanner.close();
	}
}