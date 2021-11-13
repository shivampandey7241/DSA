package javapractice;

public class Nov09EvenOnLeftSide {
	public static void main(String[] args) {
		int arr[] = { 13, 12, 9, 45, 2, 99, 10, 45 };
		int j = -1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 2 == 0) {
				j++;
				int temp=0;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		for(int i : arr) System.out.print(i+" ");
	}

}
