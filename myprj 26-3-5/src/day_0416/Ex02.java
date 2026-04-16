package day_0416;

import java.util.Scanner;

public class Ex02 {
	// 양수 5개를 입력받아 배열에 저장하고, 가장 큰 수를 출력하는 프로그램을 작성하라
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 
		 int[] num = new int[5];
		 int max = 0 , sum = 0;
		 
		 System.out.print(num.length+"개의 숫자를 입력하시오.");
		 for(int i = 0; i < num.length; i++) {
			 num[i] = scanner.nextInt();
			 sum += num[i];
			 if(max < num[i])max = num[i];
		 }
		 
		 for(int data : num) System.out.print(data+" ");
//----------------------------------------------------------------
		 System.out.println();
		 System.out.printf("최대값: %d , 평균: %.2f %n",max,(double)sum/num.length);
		 
		 
		 scanner.close();
		 scanner = null;
		
		 
		
	}

}
