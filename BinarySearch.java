package javapractice;

public class BinarySearch {
	
	public static int upperBound(int arr[] ,int target) {
		int lower = 0, upper = arr.length - 1;
	
		while(lower<upper) {
			int mid = lower + (upper - lower)/2;
			if(target>=arr[mid]) {
				lower = mid + 1;
			}else {
				upper = mid;
			}
		}
//		if(arr[lower]!=target)return -1;
		return lower;
	}
	public static void main(String[] args) {
		int arr[] = {1,1,1,2,2,3,4,4,5,5,5,5,9,9,13};
		int target = 1;
		System.out.println(upperBound(arr, target));
	}

}
