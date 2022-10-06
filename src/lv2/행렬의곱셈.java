package lv2;

import java.util.Arrays;

public class 행렬의곱셈 {

	public static void main(String[] args) {
		int[][] arr1 = { { 1, 4 }, { 3, 2 }, { 4, 1 } };
		int[][] arr2 = { { 3, 3 }, { 3, 3 } };
		int[][] answer = solution(arr1, arr2);
		System.out.println(Arrays.deepToString(answer));

	}

	public static int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = new int[arr1.length][arr2[0].length];
		System.out.println(arr1.length);
		System.out.println(arr2.length);
		System.out.println(arr1[0].length);
		
		for (int i = 0; i < arr1.length; i++) { // 행
			for (int j = 0; j < arr2.length; j++) { // 열
				for (int k = 0; k < arr2[0].length; k++) {
					answer[i][k] += arr1[i][j] * arr2[j][k];
				}

			}
		}
		

		return answer;
	}

}
