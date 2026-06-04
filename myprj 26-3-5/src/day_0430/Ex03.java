package day_0430;

public class Ex03 {

	public static void main(String[] args) {
		System.out.println(args.length);
		try {
//			System.out.println(args[0]);
			int num = Integer.parseInt("10");
			System.out.println(100/num);
			
		
		}catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("자원 반납 코드...");
		}
		
		System.out.println("...App end...");
	}

}
