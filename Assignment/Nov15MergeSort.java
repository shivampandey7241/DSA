package javapractice;

public class Nov15MergeSort {
	public static void main(String[] args) {
		int arr[] = { 4,6,2,5,7,9,1,3};
		  
	       sort(arr, 0, arr.length - 1);
	        
	        for(Integer val: arr) {
	        	System.out.print(val +" ");
	        }
		
	}
	
	public static void sort(int arr[], int start, int end)
    {
        if (start < end) {
            int mid = start + (end-start)/2;
  
            sort(arr, start, mid);
            sort(arr, mid + 1, end);
  
            merge(arr, start, mid, end);
        }
    }
	
	public static void merge(int arr[], int start, int mid, int end)
    {
        int n1 = mid - start + 1;
        int n2 = end - mid;
  
        int L[] = new int[n1];
        int R[] = new int[n2];
  
        for (int i = 0; i < n1; i++) {
        	L[i] = arr[start + i];
        }
            
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }
  
        int i = 0, j = 0;
  
        int k = start;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
  
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
  
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

}
