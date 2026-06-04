package day_0514;

public class Ex01 {

	public static void main(String[] args) {		
		Student s1 = new Student();
		s1.print();
		
		Student s2 = new Student();
		s2.setName("홍길동");
		s2.setKo(99);
		s2.setEng(55);
		s2.setMath(91);
		s2.print();
//		s2.print1();
	}

}
