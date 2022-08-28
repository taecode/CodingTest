package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class 베르트랑공준 {

	public static void main(String[] args) throws IOException {

		
		 /*
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> list = new ArrayList<Integer>();
		int N = 1;

		while (N != 0) {
			
			N = Integer.parseInt(br.readLine());
			list.add(N);
		}
		list.remove(list.size() - 1);
		for (int i = 0; i < list.size(); i++) {
			int count = 0;
			for (int j = list.get(i) + 1; j <= list.get(i) * 2; j++) {
				boolean check = true;
				for (int k = 2; k < j; k++) {
					if (j % k == 0) {
						check = false;
						break;
					}
				}
				if (check)
					count++;
			}
			System.out.println(count);
		}
		*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//무한루프
				while(true) {
					int n = Integer.parseInt(br.readLine());
					int count = 0;
					//소수 판별 배열
					boolean[] arr = new boolean[(2 * n) + 1];
					
					//0입력 시 무한루프 종료
					if(n == 0) break;
					
					//0과 1은 소수가 아니다.
					arr[0] = arr[1] = true;
					
					//에라토스테네스의 체 적용 반복문
					for(int i = 2; i <= Math.sqrt(2 * n); i++) {
		                if(arr[i])continue;
						for(int j = i * i; j <= 2 * n; j += i) {
							arr[j] = true;
							
						}
					}
					
					//n초과 2n이하의 값들 중 소수라면 count에 +1
					for(int i = n + 1; i <= 2 * n; i++) {
						if(!arr[i]) count++;
					}
					System.out.println(count);
				}

	}// main

}// class
