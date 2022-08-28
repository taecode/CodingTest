package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 골드바흐의추측 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			int n = Integer.parseInt(br.readLine());

			int div, rem; // 가장 차이가 작은 것 부터라 절반 나눈값으로 시작
			div = n / 2;
			rem = n - div;

			while (true) {
				if (isPrime(div) && isPrime(rem)) { // 둘다 소수면 while문 종료
					break;
				} else {
					div--;
					rem++;
				}

			}
			System.out.println(div + " " + rem);
		}

	}

	static boolean isPrime(int n) { // 소수인지 아닌지 체크
		boolean check = true;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				check = false; // 소수가 아니면 false
		}
		return check;
	}

}
