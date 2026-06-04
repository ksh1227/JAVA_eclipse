package day_0521;

public class Ex02 {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.print();
		
		Student s2 = new Student("홍길동");
		s2.print();
		
		Student s3 = new Student("고길동",99,98,96);
		s3.print();
		
		Student s4 = new Student("박길동","99","99","99");
		s4.print();
	}

}
