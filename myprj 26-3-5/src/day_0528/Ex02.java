package day_0528;

import java.io.File;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Student[] students = new Student[100];
		int cnt = 0;
		
		Scanner file = null;
		try {
			file = new Scanner(new File("data.txt"));
			while (file.hasNextLine()) {
				String readData = file.nextLine();
				//홍 길동 / 90/99 /100
				// 데이터의 빈칸 처리
				String[] data = readData.split("/");
				students[cnt++] = new Student(data[0], data[1], data[2], data[3]);
				if(students.length == cnt) break;
				// 배열 수동 리사이징 작업 필요
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(file != null) file.close();
		}
		
		System.out.println("------------   학생목록   -------------  학생수:"+cnt);
		for(int i=0; i<cnt; i++) {
			students[i].print();
		}
	}

}
