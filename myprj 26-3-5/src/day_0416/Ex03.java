package day_0416;

public class Ex03 {

	public static void main(String[] args) {
		
		int[] tenArray = new int[10];
		
		for(int i=0; i<tenArray.length; i++)
		tenArray[i] = (int)(Math.random()*45+1);
		
		for(int data :tenArray) System.out.printf("%d, ",data);
		System.out.println();
			
//		System.out.println((int) Math.random()*100));
		
	}

}
