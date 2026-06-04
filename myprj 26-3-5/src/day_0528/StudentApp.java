package day_0528;

import javax.swing.JOptionPane;

public class StudentApp {
	public static void main(String[] args) {
		StudentMgr app = new StudentMgr();
		System.out.println("----------  목록 보기  -----------");
		Student[] list = app.getStudentList();
		
		for(Student data :list) {
			data.print();
		}
		
		System.out.println("----------  검색  -----------");
		String name = JOptionPane.showInputDialog("검색할 이름");
		app.searchName(name);
	}
}




