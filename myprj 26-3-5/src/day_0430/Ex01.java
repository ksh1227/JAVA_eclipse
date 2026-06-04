package day_0430;

public class Ex01 {

	public static void main(String[] args) {
		String a = "Hi";
		print("Hello");
		print(a);
		
		String msg = toUpper("java programming");
		System.out.println(msg);
	}
	
	public static void print(String msg) {
		System.out.println(msg+"~~~~");
		return   ;
	}
	public static String toUpper(String msg) {
		
		return msg.toUpperCase();
	}
	
}
