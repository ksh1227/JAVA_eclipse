package day_0319;

public class Ex01 {

	public static void main(String[] args) {
		//"홍길동" , 100 , 'A' , 95.7 , 88 
		
		int kor = 100;
		char g = 'A';
		double avg = 95.7;
		int eng = 88;
		boolean pass = eng >= 80;
		System.out.println(pass);
		
		byte b = 127;
		float f = (float)3.14; //3.14f;
		int f1 = (int)avg;  //데이터 타입이 일치해야만 컴파일이 됨.
		
		int g1 = 'A';  //65 출력
		System.out.println(g1); //65
		System.out.println((int)'A'); //65
		System.out.println((int)'a'); //97
		
		int f3 = 999999999;
		
		String name = "홍길동";
		System.out.println(name.charAt(0)+"**");
		name = null;
	}
	
}
