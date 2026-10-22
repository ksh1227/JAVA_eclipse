//package Ex1008;
//
//class Person {
//	String name;
//	String id;
//	public Person(String name) {
//		this.name = name;
//	}
//}
//class Student extends Person {
//	String grade;
//	String department;
//	public Student(String name) {
//		super(name);
//	}
//}
//public class UpcastingEx {
//	public static void main(String[] args) {
//		Person s = new Student("홍길동");
//		
//		Student a = (Student) s;
//		
//		((Student)s).department = "000";
//	}
//}