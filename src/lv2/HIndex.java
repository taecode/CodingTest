package lv2;

import java.util.Arrays;

public class HIndex {

	public static void main(String[] args) {

		int[] citations = {0,1,7,7,7,7,7,7,7,7,7,7,3,3,3,3};
		System.out.println(solution(citations));

	}

	public static int solution(int[] citations) {
		int answer = 0;
		int n = citations.length; // 논문 n편

		Arrays.sort(citations);
		// System.out.println(Arrays.toString(citations));
		
		for(int i=0;i<n;i++) {
			int h=n-i;
			
			if(citations[i]>=h) {
				answer=h;
				break;
			}
		}
		return answer;
	}

}
