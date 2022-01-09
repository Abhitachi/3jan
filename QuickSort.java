package javatap;

public class QuickSort {
	
	public static int partition(int arr[], int low, int high) {
		int pivot = arr[high];
	    int i = (low - 1); 
	    for (int j = low; j <= high - 1; j++) { 
	        if (arr[j] >= pivot) { 
	            i++;
	            int temp =  arr[j];
	            arr[j] = arr[i];
	            arr[i] = temp;
	        } 
	    } 

	    int temp =  arr[high];
        arr[high] = arr[i+1];
        arr[i+1] = temp;
	    return (i + 1); 
	}
	public static int partition_r(int arr[], int low, int high) 
	{ 
	    int random = (int) (low + Math.random() % (high - low)); 
	    int temp =  arr[high];
        arr[high] = arr[random];
        arr[random] = temp;
	    return partition(arr, low, high); 
	} 

	public static void quickSort(int arr[], int low, int high) 
	{ 
	    if (low < high) { 
	        int pi = partition_r(arr, low, high); 
	        quickSort(arr, low, pi - 1); 
	        quickSort(arr, pi + 1, high); 
	    } 
	}

	public static void printArray(int arr[], int size) 
	{ 
	    int i; 
	    for (i = 0; i < size; i++) 
	        System.out.print(arr[i] + " "); 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 7, 8, 9, 1, 5,9,4 }; 
	    int n =  arr.length;
	    quickSort(arr, 0, n - 1); 
	    printArray(arr, n); 


	}

}
