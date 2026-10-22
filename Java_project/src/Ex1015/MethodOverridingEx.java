//package Ex1015;
//
//class Shape { // 슈퍼 클래스
//
//	public void draw() {
//		System.out.println("Shape");
//	}
//}
//
//class Line extends Shape {
//	@Override
//	public void draw() { // 메소드 오버라이딩
//		System.out.println("Line");
//	}
//}
//
//class Rect extends Shape {
//	public void draw() { // 메소드 오버라이딩
//		System.out.println("Rect");
//	}
//}
//
//class Circle extends Shape {
//	public void draw() { // 메소드 오버라이딩
//		System.out.println("Circle");
//	}
//}
//
//public class MethodOverridingEx {
//	static void paint(Shape p) { // Shape을 상속받은 모든 객체들이 매개변수 p로 넘어올 수 있음
////		if(p instanceof Line)((Line)p).draw(); // p가 가리키는 객체 내에 오버라이딩한 draw() 호출. 동적 바인딩
////		if(p instanceof Rect)((Rect)p).draw(); // p가 가리키는 객체 내에 오버라이딩한 draw() 호출. 동적 바인딩
////		if(p instanceof Circle)((Circle)p).draw(); // p가 가리키는 객체 내에 오버라이딩한 draw() 호출. 동적 바인딩
////		if(p instanceof Shape) {} //호출 안됨.
//		
//		p.draw(); // 오버라이딩 안해도 이걸로 다 호출됨
//	}
//	
//	public static void main(String[] args) {
//		Line line = new Line();
//
//		// 다음 호출들은 모두 paint() 메소드 내에서 Shape에 대한 레퍼런스 p로 업캐스팅됨
//		paint(line); // Line의 draw() 실행. "Line" 출력		
//		paint(new Shape()); // Shape의 draw() 실행. "Shape" 출력	
//		paint(new Line()); // Line에 오버라이딩한 draw() 실행, "Line" 출력
//		paint(new Rect()); // Rect에 오버라이딩한 draw() 실행, "Rect" 출력
//		paint(new Circle()); // Circle에 오버라이딩한 draw() 실행, "Circle" 출력
//	}
//}