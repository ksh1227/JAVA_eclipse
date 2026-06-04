package day_0604;

public class App {

	public static void main(String[] args) {
		System.out.println(" ######## 성적조회  App ######## ");
		
		StudentMgr app1 = StudentMgr.getInstance();
		Student[] list = app1.getStudentList();
		for(Student data : list) {
			data.print();
		}
		
		
		StudentMgr app2 = StudentMgr.getInstance();
		
		System.out.println(app1 == app2);
		
		
	}

}
