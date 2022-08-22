package lv1;

public class 약수의개수와덧셈 {

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		int left = 13;
		int right = 17;
		System.out.println(s.solution(left, right));
	}

}

// 1<=left<=right<=1000
// 제곱수 
class Solution2 {
	public int solution(int left, int right) {
		int answer = 0;

		for (int i = left; i <= right; i++) {

			// 제곱수면 -
			answer += i * (Math.sqrt(i) % 1 == 0 ? -1 : 1);
		}
		 

		return answer;

	}
}
