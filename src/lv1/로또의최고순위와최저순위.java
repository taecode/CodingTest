package lv1;


import java.util.Arrays;


public class 로또의최고순위와최저순위 {

	public static void main(String[] args) {

		int[] lottos = { 44, 1, 0, 0, 31, 25 };
		int[] win_nums = { 31, 10, 45, 1, 6, 19 };
		System.out.println(Arrays.toString(solution(lottos, win_nums)));

	}

	public static int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = new int[2];

		// 최고순위
		// 최저순위

		// 1등:6개
		// 2등:5개
		// 3등:4개
		// 4등:3개
		// 5등:2개
		// 6등(낙첨):1개,0개

		// 오름차순 정렬
		Arrays.sort(lottos);
		Arrays.sort(win_nums);

		int[] rank = { 6, 6, 5, 4, 3, 2, 1 }; // 순위
		int zero = 0;

		for (int i = 0; i < lottos.length; i++) {
			if (lottos[i] == 0)
				zero++;
		}

		// 0의 개수
		// 0개
		// 수 비교해서 순위 최대 최소에 넣기
		if (zero == 0) {
			int count = 0;
			for (int i = 0; i < lottos.length; i++) {
				for (int j = 0; j < win_nums.length; j++) {
					if (lottos[i] == win_nums[j]) {
						count++;
						break;
					}
				}
			}
			answer[0] = rank[count];
			answer[1] = rank[count];
		}

		// 1개
		// 나머지 수 비교 최대:count수에+1, 최소:count
		// count 배열에서 int[count]값으로 등수 출력
		if (zero == 1) {
			int count=0;
			for (int i = 0; i < lottos.length; i++) {
				for (int j = 0; j < win_nums.length; j++) {
					if(lottos[i]==0)break;
					if (lottos[i] == win_nums[j]) {
						count++;
						break;
					}
				}
			}
			answer[0]=rank[count+1];
			answer[1]=rank[count];
			
		}

		// 2개
		if (zero == 2) {
			int count=0;
			for (int i = 0; i < lottos.length; i++) {
				for (int j = 0; j < win_nums.length; j++) {
					if(lottos[i]==0)break;
					if (lottos[i] == win_nums[j]) {
						count++;
						break;
					}
				}
			}
			answer[0]=rank[count+2];
			answer[1]=rank[count];
			
		}
		
		//3개
		if (zero == 3) {
			int count=0;
			for (int i = 0; i < lottos.length; i++) {
				for (int j = 0; j < win_nums.length; j++) {
					if(lottos[i]==0)break;
					if (lottos[i] == win_nums[j]) {
						count++;
						break;
					}
				}
			}
			answer[0]=rank[count+3];
			answer[1]=rank[count];
			
		}
		
		//4개
		if (zero == 4) {
			int count=0;
			for (int i = 0; i < lottos.length; i++) {
				for (int j = 0; j < win_nums.length; j++) {
					if(lottos[i]==0)break;
					if (lottos[i] == win_nums[j]) {
						count++;
						break;
					}
				}
			}
			answer[0]=rank[count+4];
			answer[1]=rank[count];
			
		}
		
		//5개
		if (zero == 5) {
			int count=0;
			for (int i = 0; i < lottos.length; i++) {
				for (int j = 0; j < win_nums.length; j++) {
					if(lottos[i]==0)break;
					if (lottos[i] == win_nums[j]) {
						count++;
						break;
					}
				}
			}
			answer[0]=rank[count+5];
			answer[1]=rank[count];
			
		}
		
		//6개
		if(zero==6) {
			answer[0]=rank[6];
			answer[1]=rank[0];
		}

		

		return answer;
	}

}
