package javapractice;

public class InClassCircularSortedArray {
	public static void main (String[]args)
	  {
	    int arr[] = { 15, 17, 18, 2, 3, 9, 10 };
	    int result = circularSortedArray (arr);
	    int count = 0;
	    for (int i = 0; i < arr.length; i++)
	      {
		if (result == arr[i])
		  {
		    break;
		  }
		count++;
	      }
	    System.out.print ("Piviot point = " + result);
	    System.out.print (" , Times rotated = " + count);
	  }
	  public static int circularSortedArray (int arr[])
	  {
	    int low = 0, high = arr.length - 1, result = -1;
	    while (low <= high)
	      {
		int mid = low + (high - low) / 2;
		if (arr[mid] > arr[mid + 1])
		  {
		    return arr[mid + 1];
		  }
		if (arr[mid - 1] > arr[mid])
		  {
		    return arr[mid];
		  }
		if (arr[mid] > arr[0])
		  {
		    low = mid + 1;
		  }
		else
		  {
		    high = mid - 1;
		  }
	      }
	    return result;
	  }

}
