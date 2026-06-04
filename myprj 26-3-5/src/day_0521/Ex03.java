package day_0521;

public class Ex03 {

	public static void main(String[] args) {
		Student[] students = new Student[100];
		
		students[0] = new Student("홍길동");
		students[11] = new Student("김길동",78,88,90);
		students[22] = new Student("박길동",66,89,90);
		students[33] = new Student("최길동",91,74,90);
		students[44] = new Student("신길동",83,88,90);
		
		for(int i = 0; i < students.length; i++) {
		   if(students[i] != null) students[i].print();
		}
		System.out.println("------------------------------------");
		for(Student data : students) {
			// (학생이름) 서치 출력
			if(data != null && data.getName().equals("김길동")) 
		        data.print();
		}
		

	}
	
	

}
