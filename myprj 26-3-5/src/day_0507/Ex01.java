package day_0507;

public class Ex01 {

	public static void main(String[] args) {
		String msg = " 홍 길동 / 90/99 /100  ";
//		System.out.println(msg);
		f1(msg);

	}

	public static void f1(String msg) {
		String[] data = msg.split("/");

		int sum = 0;
		for (int i = 1; i < data.length; i++) {
			sum += Integer.parseInt(data[i].trim());

		}
		System.out.printf("이름:%s, 총점:%d, 평균:%.2f %n", data[0], sum, sum / 3.0);
	}
}
