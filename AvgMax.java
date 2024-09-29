// 1.Find the Maximum Element and Average of Elements in an Array.

package Java_Assignment3;

import java.util.Scanner;

public class AvgMax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		int sum = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			sum += arr[i];
		}
		System.out.println("Maximum number is " + max);
		System.out.println("Sum of Elements " + sum);
		sc.close();
	}
}
