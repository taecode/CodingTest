package lv1;

import java.util.Arrays;

public class 예산 {

	public static void main(String[] args) {

		Solution8 s = new Solution8();
		int d[] = { 1, 3, 2, 5, 4 };
		int answer = s.solution(d, 9);
		System.out.println(answer);

	}

}

class Solution8 {
	public int solution(int[] d, int budget) {
		int answer = 0;
		int dlen = d.length;
		int hap = 0; // 신청 예산 합
		Arrays.sort(d);// 작은거 부터 채우는게 많은 부서 지원하는거라 생각
		System.out.println(Arrays.toString(d));

		for (int i = 0; i < dlen; i++) {
			hap += d[i];
			if (hap > budget) { // 합이 예산을 초과하면
				answer = i; // 0부터 시작이니까 -1 필요없이 i개의 부서
				break;
			}

		}
		if (hap <= budget)
			answer = dlen; // 합이 예산보다 작거나, 같은 경우 부서 배열 수만큼 리턴
		return answer;
	}
}