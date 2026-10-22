package Ex1022;

public class test04 {

	public static void main(String[] args) {
//		Shape s = new Shape(); << 이게 추상 클래스 에러(상속받지 않은 것은 객체 생성x)
		Shape s = new Circle();
		System.out.println(s.getAree());
	}

}

abstract class Shape{
	abstract double getAree();
}

class Circle extends Shape{
	int r=1;
	// 원의 면적을 만드는 메소드 구현..

	@Override
	double getAree() {
		return Math.PI*r*r;
	}
	
}