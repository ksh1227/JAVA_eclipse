package day_0402;

import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("점수를 입력하시오. 2개");
		
		 int jumsu1 = scanner.nextInt();
		 int jumsu2 = scanner.nextInt();
		 
		 
		 //점수 계산
		 double avg = ((jumsu1+jumsu2)/2.0);
		 System.out.println("평균: "+avg);
		 
		 if(avg >= 80) {
			 String msg = "우수";
			 System.out.println(msg);			 
		 }else if(avg >= 60){
			 System.out.println("보통"); 
		 }else {
			 System.out.println("미흡"); 	 
		 }
		 
		 
		 scanner.close(); //스캐너는 클로즈 필수
		 scanner = null;
		 
	 }
}
