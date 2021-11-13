package javapractice;

public class Nov09Move0ToOneEnd {
	public static void main(String[] args) {
//		move zeros to end in linear TC and single pass.
		int arr[] = {0,1,0,0,0,1,0,1};
		int p1 =0;
		int p2 = arr.length-1;
		while(p1<=p2) {
			if(arr[p1] == 1) {
				int temp = arr[p1];
				arr[p1] = arr[p2];
				arr[p2] = temp;
				p2--;
			}else {
				p1++;
			}
		}
		for(int i : arr) System.out.print(i+" ");
	}

}
