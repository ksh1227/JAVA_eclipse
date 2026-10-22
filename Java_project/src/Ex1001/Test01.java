package Ex1001;

public class Test01 {

	public static void main(String[] args) {
		Object p = new ColorPoint();
		((Point) p).showPoint();
		((ColorPoint) p).showPoint();
		((ColorPoint) p).showColorPoint();
		//p. 뭘 접근하는지 알아야함
	}

}
