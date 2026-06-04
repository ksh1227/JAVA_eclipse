package day_0507;

public class Ex03 {

	public static void main(String[] args) {
		Student s1 = new Student();  //객체 생성했다.
		s1.print();
		System.out.println(s1.avg());
		
		Student s2 = new Student();
		s2.name = "홍길동";
		s2.ko = 90;
		s2.eng = 99;
		s2.math = 100;
		
		s2.print();
		System.out.println(s2.avg());
		
		Student s3 = s2;
		s3.print();
		

	}

}	
	
	class Student{
		//데이터 + 기능
		String name;
		int ko;
		int eng;
		int math;
		
		public void print() {
			System.out.printf("학생이름: %s [%d,%d,%d]%n",name, ko, eng, math);
		}
		public double avg() {
			return (ko+eng+math)/3.0;
		}
	}
