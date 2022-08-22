package lv1;

import java.util.Arrays;

public class 비밀지도 {

	public static void main(String[] args) {

		Solution11 s = new Solution11();
		int arr1[] = { 9, 20, 28, 18, 11 };
		int arr2[] = { 30, 1, 21, 17, 28 };
		String[] answer = s.solution(5, arr1, arr2);
		System.out.println(Arrays.toString(answer));

	}

}

class Solution11 {
	public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		Arrays.fill(answer, "");
		int alen;
		int blen;
		for (int i = 0; i < n; i++) {
			int binaryarr1[] = new int[n];
			int binaryarr2[] = new int[n];
			int a1 = arr1[i];
			int a2 = arr2[i];
			alen = n;
			blen = n;

			do {
				binaryarr1[--alen] = a1 % 2;
				a1 = a1 / 2;
				if (a1 == 1)
					binaryarr1[--alen] = 1;

			} while (a1 > 1);
			
			do {
				binaryarr2[--blen] = a2 % 2;
				a2 = a2 / 2;
				if (a2 == 1)
					binaryarr2[--blen] = 1;

			} while (a2 > 1);

			for (int j = 0; j < n; j++) {

				if (binaryarr1[j] == 1 || binaryarr2[j] == 1) {
					answer[i] += "#";

				} else {
					answer[i] += " ";
				}
			}

		}

		return answer;
	}
}
