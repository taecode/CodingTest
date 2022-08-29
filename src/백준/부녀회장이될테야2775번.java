package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class 부녀회장이될테야2775번 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		int[][] APT = new int[15][15];

		for (int y = 0; y < 15; y++) {
			APT[0][y] = y;
			APT[y][1] = 1;
		}
		for (int y = 1; y < 15; y++) {
			for (int x = 2; x < 15; x++) {
				APT[y][x] = APT[y - 1][x] + APT[y][x - 1];
			}
		}

		for (int i = 0; i < T; i++) {
			int K = Integer.parseInt(br.readLine()); // K층
			int n = Integer.parseInt(br.readLine()); // n호

			System.out.println(APT[K][n]);
		}

	}

}
