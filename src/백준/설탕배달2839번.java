package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 설탕배달2839번 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		// 3kg 5kg

		if (N % 5 == 0)System.out.println(N / 5);

		else if (N % 5 != 0) 
		{
			
			for (int i = N / 5; i >= 0; i--) {
				
				if (((N - (5 * i)) % 3) == 0) 
				{
					
					System.out.println(i + (N - (5 * i)) / 3);
					return;
				}

			}
			
			System.out.println(-1);

		}

		/* 규칙 찾아서 ...
		 
		  if (N == 4 || N == 7) {
			System.out.println(-1);
		}
		else if (N % 5 == 0) {
			System.out.println(N / 5);
		}
		else if (N % 5 == 1 || N % 5 == 3) {
			System.out.println((N / 5) + 1);
		}
		else if (N % 5 == 2 || N % 5 == 4) {
			System.out.println((N / 5) + 2);
		}
		
		 */
		}//main

}//class
