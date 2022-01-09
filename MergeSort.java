package javatap;
import java.util.Arrays;

import java.util.Scanner;
public class MergeSort {

	// Merge sort in Java
	
	static void merge(int[] a,int l,int r) {
		
		
		int mid=l+(r-l)/2;
		int i=l;int j=mid+1;int k=l;
		
		int[] temp=new int[a.length];
		
		while (i<=mid && j<=r) {
			if(a[i]<a[j]) {
				temp[k++]=a[i++];
			}else {
				temp[k++]=a[j++];
			}
		}
		while(i<=mid) {
			temp[k++]=a[i++];
		} 
		while(j<=r) {
			temp[k++]=a[j++];
		}
//		
		for(int e=l;e<=r;e++) {
			a[e]=temp[e];
//			System.out.println(temp[e]);
		}
		
	}
	
		static void mergeSort(int[] a,int l,int r) {
			if(l<r) {
				int mid=l+(r-l)/2;
				mergeSort(a,l,mid);
				mergeSort(a,mid+1,r);
				merge(a,l,r);
			}
		}
	
		public static void main(String args[]) {
			
			// created an unsorted array
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			
			int[] a=new int[n];
			for(int i=0;i<a.length;i++) {
				a[i]=sc.nextInt();
			}
			
			// call the method mergeSort()
			// pass argument: array, first index and last index
			mergeSort(a, 0, n-1);
			
			
			for(int i=0;i<a.length;i++) {
				System.out.print(a[i]+" ");
			}		
	 }
}
