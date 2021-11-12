package javapractice;

public class RecursionReverseString {
	public static void main(String[] args) {
		String str = "Chirag";
		int len = str.length() - 1;
		 reverseString(str, len);
	}
	static void reverseString(String str, int len) {
		
		if(str == null || str.length() <=1) {
			System.out.println(str);
		}else {
		    if(len<0) {
			    return;
		    }System.out.print(str.charAt(len));
		     len--;
		     reverseString(str, len--);
	    }
	}

}
