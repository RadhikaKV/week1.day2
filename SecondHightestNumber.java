package week1.day2;

import java.util.Arrays;

public class SecondHightestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {10, 89, 55, 73, 56};
		Arrays.sort(data);
		System.out.println("The second highest number in given data is : " +data[data.length-2]);
	}

}
