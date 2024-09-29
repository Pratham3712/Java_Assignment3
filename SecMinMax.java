// 3.Find the second maximum and second minimum Elements of an array.

package Java_Assignment3;

import java.util.Scanner;

public class SecMinMax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int temp = 0;
				if (arr[j] < arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Second Min Number " + arr[1]);
		System.out.println("Second Max Number " + arr[arr.length - 2]);
	}
}