package day0312;

public class Hello {
	//클래스의 구성 요소 = 데이터(멤버 변수) 와 메소드(멤버 메소드)
	
	static String name = "김승현";
	
	public static int sum(int n, int m){
		return n + m ;
	}
	
	public static void main(String[] args) {
		int i = 20;
		int s;
		char a;
		
		s = sum(i,10);
		a = '?';
		
		System.out.println(a);
		System.out.println("Hello");
		System.out.println(s);
		System.out.println(name);
		//복붙 컨트롤+알트+방향기 - 이동 알트+방향키
	}

}
