package javapractice;

public class Nov3BinarySearchFirstAndLastOccurance {
	public static void main(String[] args) {
		int arr[] = {1,3,3,3,3,3,6,6,6,6,7,7,7,7};
		int target = 3;
		System.out.print("First occurance of "+target+" is : "+lowerBound(arr, target));
		System.out.println(" and Last occurance of "+target+" is : "+upperBound(arr, target));
	}
	static int lowerBound(int arr[], int target) {
		int low = 0, high = arr.length-1, result = -1;
		while(low<=high) {
			int mid = low + (high - low)/2;
			if(arr[mid] == target) {
				result = mid;
				high = mid - 1;
			}else if(arr[mid] > target) {
				high = mid - 1;
			}else {
				low = mid + 1;
			}
		}
		return result;
	}
	static int upperBound(int arr[], int target) {
		int low = 0, high = arr.length-1, result = -1;
		while(low<=high) {
			int mid = low + (high - low)/2;
			if(arr[mid] == target) {
				result = mid;
				low = mid + 1;
			}else if(arr[mid] > target) {
				high = mid - 1;
			}else {
				low = mid + 1;
			}
		}
		return result;
	}

}
