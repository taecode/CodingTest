package 백준;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class 약수_1037번 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);

		System.out.println(arr[0] * arr[N - 1]);

	}// main

}// class
