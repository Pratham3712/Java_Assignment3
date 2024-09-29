// 5.Find the Fibonacci Series.

package Java_Assignment3;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int f0 = 0, f1 = 1, fn;
		for (int i = 0; i < n; i++) {
			if (i <= 1) {
				System.out.print(i + " ");
			} else {
				fn = f0 + f1;
				f0 = f1;
				f1 = fn;
				System.out.print(fn + " ");
			}
		}
		sc.close();
	}

}
