package day_0528;

import java.io.File;
import java.util.Scanner;

public class StudentMgr {
	private Student[] students = new Student[100];
	int cnt = 0;
	
	StudentMgr(){
        Scanner file = null;
		try {
			file = new Scanner(new File("data.txt"));
			
			while(file.hasNextLine()) {
				String readData = file.nextLine();
				String[] data = readData.split("/");
				students[cnt++] = new Student(data[0], data[1], data[2], data[3]);
				if(cnt == students.length) {
				    Student[] temp = new Student[students.length * 2];
				    System.arraycopy(students, 0, temp, 0, cnt); //중요
				    students = temp;
				    //break;
				}
			}
			} catch (Exception e) {
			e.printStackTrace();
		} finally {
		    if(file != null) file.close();
		}
	}
	
	//목록
	public Student[] getStudentList() {
		Student[] list = new Student[cnt];
		// student 0 ==> list 0 cnt
		System.arraycopy(students, 0, list, 0, cnt);
		return list;
	}
	//검색
	public void searchName(String name) {
		System.out.println("검색 결과");
		for(int i=0; i < cnt; i ++) {
			if(students[1].getName().equals(name)) {
				students[i].print();
			}
		}
	}
}

