package lv1;

public class 부족한금액계산하기 {

	public static void main(String[] args) {

		Solution9 s = new Solution9();
		long answer = s.solution(3, 20, 4);
		System.out.println(answer);

	}

}

//부족한 금액 return , 부족하지 않으면 0리턴 
class Solution9 {
	public long solution(int price, int money, int count) {
		long answer = -1;
		long nprice = 0; // 총 이용료

		for (int i = 1; i <= count; i++) {
			nprice += price * i;
		}

		if (nprice <= money)
			return 0;

		answer = nprice - money;
		return answer;
	}
}
