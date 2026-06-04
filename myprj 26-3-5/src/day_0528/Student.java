package day_0528;

import day_0514.util;

public class Student {
		// 데이터(변수) + 기능(메소드) 괄호()가 없으면 변수, 있으면 함수
		public String name;
		int ko;
		private int eng;
	    private int math;
	    	    		
	    public Student() {    	
//	    	System.out.println("Student() call...");
	    }
	    public Student(String name) {
	    	//데이터 초기화 작업
	    	this(name,60,60,60);
//	    	this.setName(name);
//	    	ko = 60;
//	    	eng = 60;
//	    	math = 60;
	    }

	    public Student(String name, int ko, int eng, int math) {
			//데이터 초기화 작업
			this.name = name;
			this.setKo(ko);
			this.setEng(eng);
			this.math = math;
		}
			public Student(String name, String ko, String eng, String math) {
			//데이터 초기화 작업
			this(name.trim(),
					Integer.parseInt(ko.trim()),
					Integer.parseInt(eng.trim()),
					Integer.parseInt(math.trim()));
//			this.name = name;
//			this.setKo(Integer.parseInt(ko));
//			this.setEng(Integer.parseInt(eng));
//			this.math = Integer.parseInt(math);
		}

			
			
		public int getMath() {
			return math;
		}
		public void setMath(int math) {
			this.math = math;
		}
		public void setEng(int eng) {
				this.eng = eng;
				return;		
		}
		public int getEng() {
			return eng;
		}
	    public void setName(String name) {
	    	if(name == null || name.length()==0) {
	    		System.err.println("name 정보 확인 필요...");
	    		return;	    		
	    	}
	    	this.name = name;
	    }
	    public String getName() {
	    	return name;
	    }
		
		public void setKo(int ko) {
			if(ko < 0) {
				System.err.println("ko 점수 확인 필요...");
				return;
			}
			this.ko = ko;
		}
		public int getKo() {
			return this.ko;
		}
		
		
		public void print() {
			double avg = (ko+eng+math)/3.0;
			
			System.out.printf("학생이름 : %s [%d,%d,%d] 평균 : %.2f %n",name,this.ko,this.eng,this.math, avg);
			
		}
		public void print1() {			
			double avg = (ko+eng+math)/3.0;
			System.out.printf("%s, 영어점수 %d점(%s) %n",name,eng, util.grade(eng));		
			System.out.printf("%s, 평균 %.2f점(%s) %n",name,avg, util.grade(avg));		
		}
	
	}
