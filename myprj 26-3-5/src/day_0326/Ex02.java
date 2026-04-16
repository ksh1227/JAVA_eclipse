package day_0326;

public class Ex02 {

	public static void main(String[] args) {
		int a = 99, b = 78;
		int r = (a > b) ? a-b : b-a ;
		System.out.println(a+","+b+"의 값차이 "+r);
		
		int eng = 99;
		/*
		String msg = (eng >= 80)? "합격" : "불합격" ;
		System.out.println(eng+" : "+ msg);
		*/
		System.out.println(eng+" : "+((eng >= 80)? "합격" : "불합격"));
	}

}
