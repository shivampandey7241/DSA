package javapractice;

public class RecusionSumOfArray {
	public static void main(String[] args) {
		int arr[] = {1,2,5,5,10};
		System.out.print(sumOf(arr,arr.length));
	}
	static int sumOf(int[] num1, int len) {
		                                            
		if(len<=0) {
			return 0;
		}
		return (sumOf(num1 , len-1) + num1[len -1]);
		
	}

}
