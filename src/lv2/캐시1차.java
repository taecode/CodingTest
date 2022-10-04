package lv2;

import java.util.LinkedList;

public class 캐시1차 {

	public static void main(String[] args) {

		int cacheSize = 3;
		String[] cities = { "Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA" };
		System.out.println(solution(cacheSize, cities));
	}

	public static int solution(int cacheSize, String[] cities) {
		int answer = 0;

		if (cacheSize == 0) // 캐시 크기가 0이면
			return cities.length * 5;

		LinkedList<String> cache = new LinkedList<>(); // 데이터 추가/삭제 많은 경우 LinkedList사용
		for (int i = 0; i < cities.length; i++) {
			String s = cities[i].toLowerCase();
			if (cache.remove(s)) { // 값이 있으면 지우고 true, 없으면 false 반환
				answer += 1; // Hit
				cache.add(s);//맨뒤에 s add
			} else {
				answer += 5; // Miss
				if (cache.size() >= cacheSize) { // 캐시 사이즈보다 크면
					// System.out.println(cache.get(0));
					cache.remove(0); // 가장 첫번째 값 제거

				}
				cache.add(s);

			}
		}
		return answer;

	}

}
