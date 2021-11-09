package javapractice;
import java.util.*;
public class ArrayListBinarySearchIntersection {
	public static void main(String[] args) {
		int arr1[] = {1,2,2,3};
		int arr2[] = {3,2,4,5,3,4};
		Arrays.sort(arr2);
//		for(int i : arr2) System.out.print(i+" ");
		List<Integer> arrList = new ArrayList<>();
		for(int i=0; i<arr1.length; i++) {
			if(binarySearch(arr2,arr1[i]) && !arrList.contains(arr1[i])) {
				arrList.add(arr1[i]);
			}
		}
		for(int i : arrList) System.out.print(i+" ");
	}
	public static boolean binarySearch(int arr[], int target) {
		int low = 0, high = arr.length - 1;
		while(low<=high) {
			int mid = low + (high - low)/2;
			if(arr[mid] == target) {
				return true;
			}
			if(arr[mid]>target) {
				high = mid - 1;
			}else {
				low = mid + 1;
			}
		}
		return false;
	}

}
