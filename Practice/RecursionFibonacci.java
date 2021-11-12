package javapractice;

public class RecursionFibonacci {
	static int a=0,b=1,c=0;
	public static void main(String[] args) {
		fib(10);
	}
	static void fib(int count) {
//		int a=0,b=1,c=0;
		if(count>0) {
		c = a+b;
		a=b;
		b=c;
		System.out.print(" "+c);
		fib(count-1);
		}
//		return -1;
	}

}
