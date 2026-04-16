package day_0402;

public class Ex02 {

	public static void main(String[] args) {
		
		int n;
		int sum = 0;
		
		for(n = 0 ; n <= 10 ; n++) {
			sum =+ n;
			if(n < 10)
				System.out.println(n+"+");
			else
				System.out.println(n+"=");
		}
		System.out.println(sum);
		
		int cnt = 0;
		while(cnt < 5) {
			System.out.println("Hello java ");
			cnt++;
		}
		
		// 루프 밖에서 값 초기화
		sum = 0;
		n = 0;
		boolean flag = false;
		while(!flag) {
			n++;
			sum += n;
			if(sum > 1000) flag = !flag;
		}
		System.out.println(n+":"+sum);
		
		
	}
}
