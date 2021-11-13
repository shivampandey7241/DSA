package javapractice;

public class Nov09Sort0_1and2InLinearTC {
	public static void main(String[] args) {
		int a[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
		int lo = 0, mid = 0, hi = a.length-1, temp = 0;
		while (mid <= hi) {
			switch (a[mid]) {
			case 0: {
				temp = a[lo];
				a[lo] = a[mid];
				a[mid] = temp;
				lo++;
				mid++;
				break;
			}
			case 1:
				mid++;
				break;
			case 2: {
				temp = a[mid];
				a[mid] = a[hi];
				a[hi] = temp;
				hi--;
				break;
			}
		}
		
	}for(int i : a) System.out.print(i+" ");
	}
}
	
