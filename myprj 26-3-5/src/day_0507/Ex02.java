package day_0507;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		System.out.println("== 성적처리 ==");
		Scanner file = null;
		try {
			file = new Scanner(new File("data.txt"));
			while (file.hasNextLine()) {
				String msg = file.nextLine();
//				System.out.println(msg);
				Ex01.f1(msg);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (file != null) file.close();
			file = null;
		}

		System.out.println("=== 완료 ===");

	}
}
