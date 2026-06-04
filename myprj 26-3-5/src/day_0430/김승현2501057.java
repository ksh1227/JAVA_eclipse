package day_0430;

import java.util.Scanner;

public class 김승현2501057 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String course[] = {"C", "C++", "Python", "Java", "HTML5"};
        String grade[] = {"A", "B+", "B", "A+", "D"};
        
        while(true) {
            System.out.print("과목: "); 
            String coursename = sc.nextLine();
            
            if(coursename.equals("그만")) {
                break;
            }
            
            boolean found = false; 
            
            for(int i = 0; i < course.length; i++) {
                if(course[i].equalsIgnoreCase(coursename)) {
                    System.out.println(course[i] + " 학점은 " + grade[i]);
                    found = true;
                    break;
                }
            }
            

            if(!found) {
                System.out.println(coursename + "는 없는 과목입니다.");
            }
        }
        
        sc.close(); 
    }
}
