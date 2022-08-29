package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ACM호텔10250번 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int H = Integer.parseInt(st.nextToken()); // H층
			int W = Integer.parseInt(st.nextToken()); // 방 개수
			int N = Integer.parseInt(st.nextToken()); // N번째 손님


			int ho = 0;

			if (N % H == 0) {

				ho = H * 100 + N / H; //나머지가 0인경우 몫이 호, H가 층수 
			} else {

				ho = (N % H) * 100 + N / H + 1; //나머지가 0이 아니면 몫+1값이 호, 나머지값이 층수 
			}

			System.out.println(ho);

		}

	}

}
