package day_0409;

public class Ex02 {

	public static void main(String[] args) {
		System.out.println("hello"+3+"java"+100);
		System.out.printf("%s(%s), %s(%s) %n","홍길동",83,"김길동",100);
		System.out.printf("%s(%s), %s(%s) %n","홍길동",83,"김길동",100);
		String name = "홍길동";
		int num = 25;
		double pi = 3.14159;
		System.out.printf("%s, %d, %f %n",name,num,pi);
		System.out.printf("%s, %d, %.3f %n",name,num,pi);
		
		
		//  ==   !=  ,   equals()  !(.equals())
		
		System.out.println(num == 25);
		System.out.println(num != 25);
		System.out.println(name.equals("김길동"));
		System.out.println(!(name.equals("홍길동")));
		
	}

}
