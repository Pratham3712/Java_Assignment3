/* 7. Java Program for Sorting first half in Ascending order and 
   second half in Descending order.*/

package Java_Assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class SortMid {

	// Method to sort the first half in ascending and second half in descending
	// order
	public static void sortArray(int[] array) {
		int n = array.length;
		int mid = n / 2;

		// Sort the first half in ascending order
		Arrays.sort(array, 0, mid);
		Arrays.sort(array, mid, n);
		reverse(array, mid, n);
	}

	private static void reverse(int[] array, int start, int end) {
		end--;
		while (start < end) {
			int temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 90, 34, 89, 7, 9 };

		System.out.println("Original array: " + Arrays.toString(arr));

		sortArray(arr);

		System.out.println("Sorted array: " + Arrays.toString(arr));
	}
}
