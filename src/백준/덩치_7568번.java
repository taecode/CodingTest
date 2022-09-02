package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class 덩치_7568번 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] human = new int[N][2];

		String[] str;

		for (int i = 0; i < N; i++) {
			str = br.readLine().split(" ");
			human[i][0] = Integer.parseInt(str[0]);
			human[i][1] = Integer.parseInt(str[1]);
		}

		int[] ranking = new int[N];
		// 큰사람, 작은사람, 나머지(비교불가,같은)
		for (int i = 0; i < N; i++) {
			int rank = 1;
			for (int j = 0; j < N; j++) {
				if (i == j)
					continue;
				if (human[i][0] < human[j][0] && human[i][1] < human[j][1]) 
					rank++;
				
			}
			ranking[i] = rank;
		}

		for(int i=0;i<N;i++) {
			System.out.print(ranking[i]);
			System.out.print(" ");
		}

	}// main

}// class
