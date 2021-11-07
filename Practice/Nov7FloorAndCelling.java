package javapractice;

public class Nov7FloorAndCelling {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,6,7,8};  
		int target = 5;
		int celling = floorCelling(arr, target);
		int floor = celling - 1;
		System.out.println("Floor : "+arr[floor]+" Celling : "+arr[celling]);
	}
    public static int floorCelling(int arr[], int t) {
    	int low = 0, high = arr.length - 1;
    	while(low <= high) {
    		int mid = low + (high - low)/2;
    		if(arr[mid] == t) {
    			return mid ;
    		}
    		if(t>arr[mid]) {
    			low = mid + 1;
    		}else {
    			high = mid - 1;
    		}
    	}
    	return low;
    }
}
