package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 분해합_2231번 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		boolean check = false;

		for (int i = 0; i < N; i++) {
			int sum = 0;
			String n = Integer.toString(i);
			for (int j = 0; j < n.length(); j++) {
				sum = sum + (n.charAt(j) - '0');

			}
			if ((i + sum) == N) {
				System.out.println(i);
				check = true;
				break;
			}
		}
		if (!check)
			System.out.println(0);

	}// main

}// class
