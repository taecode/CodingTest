package lv1;

public class 최소직사각형 {

	public static void main(String[] args) {

		Solution7 s = new Solution7();
		int[][] size = { { 60, 50 }, { 30, 70 }, { 60, 30 }, { 80, 40 } };
		int answer = s.solution(size);
		System.out.println(answer);

	}

}

class Solution7 {
	public int solution(int[][] sizes) {
		int answer = 0;
		int sizeslen = sizes.length;

		// 가로길이 최대, 세로 길이 최대 뽑고
		// 세로길이 최대가 가로길이 최대보다 작고,

		int maxwidth = -1;
		int maxheight = -1;
		int maxwidthindex = 0;
		int maxheightindex = 0;
		for (int w = 0; w < sizeslen; w++) {
			if (maxwidth < sizes[w][0]) {
				maxwidth =  sizes[w][0]; // max 가로길이
				maxwidthindex = w;
			}
			if (maxheight < sizes[w][1]) {
				maxheight = sizes[w][1];// max 세로길이
				maxheightindex = w;
			}
		}

		
		if (maxwidth > maxheight) {

			while (true) {
				maxwidth = -1;
				maxheight = -1;
				for (int w = 0; w < sizeslen; w++) {
					if (maxheight <sizes[w][1]) {
						maxheight = sizes[w][1];// max 세로길이
						maxheightindex = w;
					}
				}
				int bin = 0;
				if (sizes[maxheightindex][0] < sizes[maxheightindex][1]) {
					bin = sizes[maxheightindex][0];
					sizes[maxheightindex][0] = sizes[maxheightindex][1];
					sizes[maxheightindex][1] = bin;
				} else
					break;

			}
			answer=maxwidth*maxheight;
			return answer;
		}

		else {
			
			while (true) {
				maxwidth = -1;
				maxheight = -1;
				for (int w = 0; w < sizeslen; w++) {
					if (maxwidth < sizes[w][0]) {
						maxwidth = sizes[w][1]; // max 가로길이
						maxwidthindex = w;
					}
				}
				int bin = 0;
				if (sizes[maxwidthindex][0] < sizes[maxwidthindex][1]) {
					bin = sizes[maxwidthindex][0];
					sizes[maxwidthindex][0] = sizes[maxwidthindex][1];
					sizes[maxwidthindex][1] = bin;
				} else
					break;

			}
			answer=maxwidth*maxheight;
			return answer;

		}
		
		

	}
}
