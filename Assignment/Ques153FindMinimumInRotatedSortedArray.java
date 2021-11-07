package leetcode;

public class Ques153FindMinimumInRotatedSortedArray {
	public static void main(String[] args) {
		int arr[] = {3,4,5,1,2};
		System.out.println(findMin(arr));
	}
	public static int findMin(int[] arr) {
        if(arr.length == 1){
            return arr[0];
        }
        int low = 0, high = arr.length - 1, result = -1;
        if(arr[high]>arr[0]){
            return arr[0];
        }
        while(low<=high){
            int mid = low + (high - low)/2;
            if(arr[mid]>arr[mid+1]){
                return arr[mid+1];
            }
            if(arr[mid-1]>arr[mid]){
                return arr[mid];
            }
            if(arr[mid]> arr[0]){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return result;
    }
}
