package day_0514;

public class Student {
		// 데이터(변수) + 기능(메소드) 괄호()가 없으면 변수, 있으면 함수
		public String name;
		int ko;
		private int eng;
	    private int math;
	    	    		
	    
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
		private void print1() {			
			double avg = (ko+eng+math)/3.0;
			System.out.printf("%s, 영어점수 %d점(%s) %n",name,eng, util.grade(eng));		
			System.out.printf("%s, 평균 %.2f점(%s) %n",name,avg, util.grade(avg));		
		}
	
	}
