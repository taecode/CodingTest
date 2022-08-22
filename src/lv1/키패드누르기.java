package lv1;

import java.util.Arrays;

public class 키패드누르기 {

	public static void main(String[] args) {

		Solution10 s = new Solution10();
		int numbers[] = { 1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5 };
		String hand = "right";
		StringBuilder answer = s.solution(numbers, hand);
		System.out.println(answer);

	}

}

class Solution10 {
	public StringBuilder solution(int[] numbers, String hand) {
		String answer = "";
		StringBuilder sb = new StringBuilder();
		int numberslen = numbers.length;
		int lrow = 3;
		int lcol = 0;
		int rrow = 3;
		int rcol = 2;

		for (int i = 0; i < numberslen; i++) {

			if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
				sb.append("L");
				lrow = numbers[i] / 3;
				lcol = 0;

			} else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
				sb.append("R");
				rrow = numbers[i] / 3 - 1;
				rcol = 2;
			} else if (numbers[i] == 0) {

				if (Math.abs(lrow - 3) + Math.abs(lcol - 1) < Math.abs(rrow - 3) + Math.abs(rcol - 1)) {
					sb.append("L");
					lrow = 3;
					lcol = 1;
				} else if (Math.abs(lrow - 3) + Math.abs(lcol - 1) > Math.abs(rrow - 3) + Math.abs(rcol - 1)) {
					sb.append("R");
					rrow = 3;
					rcol = 1;
				} else {
					if (hand.equals("left")) {
						sb.append("L");
						lrow = 3;
						lcol = 1;
					} else {
						sb.append("R");
						rrow = 3;
						rcol = 1;
					}
				}
			} else {
				if (Math.abs(lrow - numbers[i] / 3) + Math.abs(lcol - 1) < Math.abs(rrow - numbers[i] / 3)+ Math.abs(rcol - 1)) {
					sb.append("L");
					lrow = numbers[i] / 3;
					lcol = 1;
				} else if (Math.abs(lrow - numbers[i] / 3) + Math.abs(lcol - 1) > Math.abs(rrow - numbers[i] / 3)
						+ Math.abs(rcol - 1)) {
					sb.append("R");
					rrow = numbers[i] / 3;
					rcol = 1;
				} else {
					if (hand.equals("left")) {
						sb.append("L");
						lrow = numbers[i] / 3;
						lcol = 1;
					} else {
						sb.append("R");
						rrow = numbers[i] / 3;
						rcol = 1;
					}

				}

			}

		}

		return sb;
	}
}
