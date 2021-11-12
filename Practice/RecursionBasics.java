package javapractice;

public class RecursionBasics {
	public static void main(String[] args) {
		fwd(5);
		
	}
	public static int fwd(int n) {
		if(n == 0) {
			return n;
		}
		fwd(n-1);
		System.out.print(n+" ");
		
		return -1;
	}
	
}
