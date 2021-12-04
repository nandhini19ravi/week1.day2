package week1.day2;

import java.util.Arrays;

public class ArraySecondLargest {

	public static void main(String[] args) {
		int [] arr = {5,11,7,9,1,4};
		Arrays.sort(arr);//1,4,5,7,9,11
		int res = arr.length-2;
		System.out.println(arr[res]);

	}

}
