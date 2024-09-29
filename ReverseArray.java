// 2.Reverse a given Array and print.

package Java_Assignment3;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Reverse array is: ");
		for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
			arr[i] = arr[j];
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}
}