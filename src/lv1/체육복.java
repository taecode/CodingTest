package lv1;

import java.util.Arrays;

public class 체육복 {

	public static void main(String[] args) {

		Solution6 s = new Solution6();
		int n = 5;
		// int lost[]= {2,4};
		// int reserve[]= {1,3,5};

		int lost[] = { 2, 4 };
		int reserve[] = { 3 };
		int answer = s.solution(n, lost, reserve);
		System.out.println(answer);

	}

}

//전체 학생 수:2<=n<=30
//체육복 도난당한 학생 번호 1<=lost<=n
//여벌 체육복 가져온 학생 번혼 1<=reserve<=n, 여벌 가져온 사람도 도난 당할 수 있음, 그러면 못빌려줌
//answer=체육 수업 들을 수 있는 최댓값

class Solution6 {
	public int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;
		int lostlen = lost.length;
		int reservelen = reserve.length;
		Arrays.sort(lost);
		Arrays.sort(reserve);

		for (int i = 0; i < lostlen; i++) {
			for (int j = 0; j < reservelen; j++) {
				if (lost[i] == reserve[j]) {
					lost[i] = -1;
					reserve[j] = -1;
				}
			}
		}

		for (int i = 0; i < lostlen; i++) {
			for (int j = 0; j < reservelen; j++) {
				if (lost[i] - 1 == reserve[j]) {
					reserve[j] = -1;
					lost[i] = -1;
				} else if (lost[i] + 1 == reserve[j]) {
					reserve[j] = -1;
					lost[i] = -1;
				}

			}
		}
		int count = 0;
		for (int i = 0; i < lostlen; i++) {
			if (lost[i] != -1)
				count++;
		}
		answer = n - count;

		return answer;
	}
}
