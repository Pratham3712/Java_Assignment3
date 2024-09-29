/* 9. Java program for rotation of elements of array- left and right. 
An array is said to be right rotated if all the selected elements 
were moved towards right by one position.*/

package Java_Assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class RotateLeftRight {

	public static void rightRotate(int[] array) {
		if (array == null || array.length == 0) {
			return;
		}

		int lastElement = array[array.length - 1];
		for (int i = array.length - 1; i > 0; i--) {
			array[i] = array[i - 1];
		}

		array[0] = lastElement;
	}

	public static void leftRotate(int[] array) {
		if (array == null || array.length == 0) {
			return;
		}

		int firstElement = array[0];
		for (int i = 0; i < array.length - 1; i++) {
			array[i] = array[i + 1];
		}

		array[array.length - 1] = firstElement;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[5];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Original array: " + Arrays.toString(array));
		rightRotate(array);
		System.out.println("Array after right rotation: " + Arrays.toString(array));
		leftRotate(array);
		System.out.println("Array after left rotation: " + Arrays.toString(array));
	}
}
