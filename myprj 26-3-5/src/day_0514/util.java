package day_0514;

public class util {
	//메소드 오버로딩
	//같은 이름의 메소드 여려 개의 기능
	//단 매개 변수의 타입, 개수가 같아야 한다.
	public static char grade(double jumsu){
		char grade = 'F';
		
		switch ((int)jumsu/10) {
			case 10:
			case 9:
				grade = 'A';	
				break;
			case 8:
				grade = 'B';	
				break;
			case 7:
				grade = 'C';	
				break;
			case 6:
				grade = 'D';	
	
		}	
	    	
	    return grade;
	}
	
	public static char grade(int jumsu){
		char grade = 'F';
		
		switch (jumsu/10) {
			case 10:
			case 9:
				grade = 'A';	
				break;
			case 8:
				grade = 'B';	
				break;
			case 7:
				grade = 'C';	
				break;
			case 6:
				grade = 'D';	
	
		}	
	    	
	    return grade;
	}
}
