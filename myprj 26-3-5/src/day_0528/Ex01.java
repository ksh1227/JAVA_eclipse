package day_0528;

import javax.swing.JOptionPane;

public class Ex01 {

	public static void main(String[] args) {
		Student[] students = new Student[100];
		
		students[0] = new Student("홍길동");
		students[1] = new Student("김길동",78,88,90);
		students[2] = new Student("박길동",66,89,90);
		students[3] = new Student("최길동",91,74,90);
		students[4] = new Student("신길동",83,88,90);
		
		for(int i = 0; i < students.length; i++) {
		   if(students[i] != null) students[i].print();
		}
		System.out.println("-----------------검색-------------------");
		String name =JOptionPane.showInputDialog("검색할 이름을 입력하시오. ");
		
		for(Student data : students) {
			// (학생이름) 서치 출력
			if(data != null && data.getName().equals(name)) 
		        data.print();
		}
		

	}
	
	

}
