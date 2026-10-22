package Ex1015;

class Shape {
	String name = "....";
	public void paint() {
		this.draw();
	}
	public void draw() {
		System.out.println(name);
	}
}


public class Circle extends Shape {
	String name = "동그라미";
	
	@Override
	public void draw() {
		this.name = "Circle";
		super.name = "Shape";
		super.draw();
		System.out.println(name);
	}
	public static void main(String [] args) {
		Shape b = new Circle();
		b.paint();
//		System.out.println(((Circle)b).name);
//		System.out.println(b.name);
	}
}