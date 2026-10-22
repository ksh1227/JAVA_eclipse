package Ex0910;

import java.util.Scanner;

//

public class BookArray {
	public static void main(String[] args) {
		Book [] books = new Book[2]; // Book 배열 선언
		
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<books.length; i++) { // book.length = 2
			System.out.print("제목>>");
			String title = scanner.nextLine();
			System.out.print("저자>>");
			String author = scanner.nextLine();
			books[i] = new Book(title, author); // 배열 원소 객체 생성
		}
		
		for(int i=0; i<books.length; i++)
			System.out.print("(" + books[i].title + ", " + books[i].author + ")");

		scanner.close();
	}
}