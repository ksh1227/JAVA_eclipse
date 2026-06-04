package day_0430;

public class Ex02 {

	public static void main(String[] args) {
		int[] v = makeArray(4);
		printArray(v);
		
		
		}
	

	public static int[] makeArray(int size) {
		int[] temp = new int[size];
		for(int i=0;i<temp.length;i++) {
			temp[i] = i+1;
		}
		return temp;
//		return new int[4];
	}
	
	public static void printArray(int[] a) {
		
		for(int data :a) {
			System.out.print(data + " ");
		
		}
		return;
	}
}
	
