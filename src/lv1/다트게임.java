package lv1;

public class 다트게임 {

	public static void main(String[] args) {

		String dartResult = "1S2D*3T";
		System.out.println(solution(dartResult));

	}

	public static int solution(String dartResult) {
		int answer = 0;

		// 3번 기회
		// dartResult = 점수/보너스/옵션 순(옵션은 없어도 가능)
		// 0~10/ S,D,T /* #

		int score[] = new int[3];
		String numstr = "";
		int idx = 0; // score에 index

		for (int i = 0; i < dartResult.length(); i++) {
			char c = dartResult.charAt(i);

			// 숫자인 경우
			if (c >= '0' && c <= '9') {
				numstr += String.valueOf(c);  //10인 경우도 있어서 String에 넣음

			} else if (c == 'S' || c == 'D' || c == 'T') {
				int n = Integer.parseInt(numstr); 
				if (c == 'S') {
					score[idx++] = (int) Math.pow(n, 1);
				} else if (c == 'D') {
					score[idx++] = (int) Math.pow(n, 2);
				} else {
					score[idx++] = (int) Math.pow(n, 3);
				}
				numstr = "";
			} else {
				if (c == '*') {
					score[idx - 1] *= 2;
					if (idx - 2 >= 0)
						score[idx - 2] *= 2;
				} else {
					score[idx - 1] *= (-1);
				}
			}

		}

		answer = score[0] + score[1] + score[2];

		return answer;
	}

}
