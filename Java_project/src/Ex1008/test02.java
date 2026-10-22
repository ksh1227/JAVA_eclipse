package Ex1008;

public class test02 {

	public static void main(String[] args) {
		Object obj = "hello java";
		Object obj2 = new Point(3,4);
		
		String s = null;
		if(obj instanceof String) { 
			s = (String) obj;
			System.out.println(obj);
			System.out.println(s.toUpperCase());
		}
		
		Point p = null;
		if(obj2 instanceof Point) {
			p = (Point) obj2;
			p.showPoint();
		}
		
				
		
	}

}
