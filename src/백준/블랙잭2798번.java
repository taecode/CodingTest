package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 블랙잭2798번 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());// 카드개수
		int M = Integer.parseInt(st.nextToken());// 숫자

		st = new StringTokenizer(br.readLine(), " ");
		int[] card = new int[N];

		for (int i = 0; i < N; i++) {
			card[i] = Integer.parseInt(st.nextToken());
		}

		// 3장 고르기
		int max = Integer.MIN_VALUE;
		int hap = 0;
		int result = 0;
		
		for (int i = 0; i < N - 2; i++) {
			if(card[i]>M)continue;
			
			for (int j = i + 1; j < N - 1; j++) {
				if(card[i]+card[j]>M)continue;
				
				for (int k = j + 1; k < N; k++) {  //i+2에서 j+1로 수정
					
					hap = card[i] + card[j] + card[k];
					
					if (hap <= M && hap > max) {
						max = hap;
						result = hap;
					}
				}
			}
		}
		System.out.println(result);

	}// main

}// class
