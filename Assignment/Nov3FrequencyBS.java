package javapractice;

public class Nov3FrequencyBS {
	static int lowerBound(int arr[], int target) {
		int low =0, high = arr.length-1;
		while(low<high) {
			int mid = low +(high-low)/2;
			if(target<=arr[mid]) {
				high = mid;
			}else {
				low = mid+1;
			}
		}
		return low;
	}
    static int upperBound(int arr[], int target) {
    	int low =0, high = arr.length-1;
		while(low<high) {
			int mid = low +(high-low)/2;
			if(target>=arr[mid]) {
				low = mid+1;
			}else {
				high = mid;
			}
		}
		return low;
	}
	public static void main(String[] args) {
		int arr[] = {1, 1, 2, 2, 2, 2, 3};
		int target = 2;
		int result =  upperBound(arr, target) - lowerBound(arr, target);
		System.out.println(result);
	}

}
