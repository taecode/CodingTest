package lv2;

import java.util.Stack;

public class 괄호회전하기 {

	public static void main(String[] args) {

		String s = "[](){}";
		System.out.println(solution(s));

	}

	public static int solution(String s) {

		// 왼쪽으로 한칸씩 이동
		// 여는거 있으면 닫는게 필요
		// 예외 제외
		// case 닫기 시작
		// case 열기 시작 닫기 찾을 때 까지 반복?

		// case 열기 뒤에 닫기 -> 다른 닫기
		// case 열기 뒤에 다른 열기. ... -> 가장 마지막 열기짝이랑 맞는 닫기...닫기가 순서대로 맞
		/*
		 * for (int i = 0; i < slen; i++) { // 회전
		 * 
		 * char tmp = strArray[0]; // 첫번째 값 임시 저장 for (int j = 1; j < slen; j++) { // 한
		 * 칸씩 앞으로 땡기기 strArray[j - 1] = strArray[j]; } strArray[slen - 1] = tmp; // 가장
		 * 마지막 칸에 첫번째 값 넣기
		 * 
		 * // for(int k=0;k<slen;k++) { // System.out.print(strArray[k]); // } if
		 * (strArray[0] == ')' || strArray[0] == '}' || strArray[0] == ']') continue;
		 * else {
		 * 
		 * }
		 * 
		 * }
		 */

		int answer = 0;
		int slen = s.length();
		Stack<Character> stack = new Stack<>();
		
		for (int i = 0; i < slen; i++) {
			stack.clear();
			stack.add(s.charAt(0));

			for (int j = 1; j < slen; j++) {
				if (stack.isEmpty()) {
					stack.add(s.charAt(j));
					continue;
				}
				if (stack.peek() == ')' || stack.peek() == '}' || stack.peek() == ']')
					break;
				else if (stack.peek() == '(' && s.charAt(j) == ')')
					stack.pop();
				else if (stack.peek() == '{' && s.charAt(j) == '}')
					stack.pop();
				else if (stack.peek() == '[' && s.charAt(j) == ']')
					stack.pop();
				else
					stack.add(s.charAt(j));
			}
			if (stack.size() == 0)
				answer++;

			char tmp = s.charAt(0); // 첫번째값 빼서 마지막에 붙히기
			s = s.substring(1);
			s += tmp;
		}

		return answer;
	}

}
