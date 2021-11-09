package javapractice;
import java.util.*;
public class ArrayListBasic {
	public static void main(String[] args) {
		List<String> arr = new ArrayList<>();
		
		arr.add("Shivam");
		arr.add("Window");
		arr.add("Geekster");
		arr.add("Google");
		arr.add(2,"Hello");
		
		System.out.println(arr.size());
		arr.remove("Shivam");
		for(String i : arr) {
			System.out.println(i);
		}
	}

}
