package day_0416;

public class Ex01 {

	public static void main(String[] args) {
		int[] jumsu = new int[5];
		jumsu[0] = 90;
		jumsu[1] = 91;
		jumsu[2] = 99;
		jumsu[3] = 88;
		jumsu[4] = 79;
		
		String[] name = new String[jumsu.length];
		
		name[0] = "홍길동";
		name[1] = "고길동";
		name[2] = "이길동";
		name[3] = "김길동";
		name[4] = "박길동";
		
		for(int i=0; i < jumsu.length; i ++) {
//			System.out.println(jumsu[i]+" : "+name[i].charAt(0)+"**");
			System.out.printf("%s : %d 점%n",name[i],jumsu[i]);
		}
		
		int[] n = {1,2,3,4,5,6,7,8,9};
		char[] c = {'A','B','C','D'};
		String[] day = {"일","월","화","수","목","금","토"};
		
		String[] d = day;
		
		d[3] = "수요일";
		for(int i=0; i<day.length; i++){
			System.out.print(day[i]);
		}
		
		// 새로운 for루프
		System.out.println();
		for(String data :day) {
			System.out.print(data+' ');
		}
		System.out.println();
		for(char data :c){
			System.out.print(data+" ");
		}
		
		}
		
	}


