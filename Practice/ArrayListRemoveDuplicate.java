package javapractice;
import java.util.*;
public class ArrayListRemoveDuplicate {
	public static void main(String[] args) {
		int arr[] = {1,2,2,3,9,9,5,6,7,7,8,14,9,7,6};
		List<Integer> arrList = new ArrayList<>();
		for(int i=0; i<arr.length; i++) {
			arrList.add(arr[i]);
		}
		for(int i=0; i<arrList.size(); i++) {
			for(int j=0; j<arrList.size(); j++) {
				if(arrList.get(i) == arrList.get(j) && i!=j) {
					arrList.remove(j);
				}
			}
		}
		for(int i : arrList) {
			System.out.print(i +" ");
		}
	}

}
