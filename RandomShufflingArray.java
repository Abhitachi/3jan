package jan4;

import java.util.Random;

public class RandomShufflingArray {

	static void shuffleArray(int[] a) {
		Random r=new Random();
		
		for(int i=a.length-1;i>=0;i--) {
			int j=r.nextInt(i+1);
			
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,5,9,6,3,2};
		shuffleArray(a);
	
	}
}
