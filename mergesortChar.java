package javatap;

public class mergesortChar {
	
	public static void merge(char[] left_arr,char[] right_arr, char[] arr,int left_size, int right_size){

		int i=0,l=0,r = 0;
		while(l<left_size && r<right_size){
			
			if((int)left_arr[l]>(int)right_arr[r]){
				arr[i++] = left_arr[l++];
			}
			else{
				arr[i++] = right_arr[r++];
			}
		}
		while(l<left_size){
			arr[i++] = left_arr[l++];
		}
		while(r<right_size){
			arr[i++] = right_arr[r++];
		}
	}
	
	public static void mergeSort(char[] arr, int len){
	      if (len < 2){return;}
	      int mid = len / 2;
	      char [] left_arr = new char[mid];
	      char [] right_arr = new char[len-mid];
	      int k = 0;
	      for(int i = 0;i<len;++i){
	          if(i<mid){
	              left_arr[i] = arr[i];
	          }
	          else{
	              right_arr[k] = arr[i];
	              k = k+1;
	          }
	      }
	      mergeSort(left_arr,mid);
	      mergeSort(right_arr,len-mid);
	      merge(left_arr,right_arr,arr,mid,len-mid);
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char [] array = {'a','x','y','b','A','T','t'};
        mergeSort(array,array.length);
        for(int i =0; i< array.length;++i){
            System.out.print(array[i]+ " ");
        }
	}

}
