package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 수정렬하기3_10989번 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		StringBuilder sb=new StringBuilder();
		
		int []cnt=new int[10001]; //카운트
		
		for(int i=0;i<N;i++) {
			cnt[Integer.parseInt(br.readLine())]++;  //O(n) 시간 복잡도
		}
		
		for(int i=1;i<10001;i++) {
			while(cnt[i]>0) {
				sb.append(i).append('\n');
				cnt[i]--;
			}
		}
		System.out.println(sb);
		
		//O(n)의 시간 복잡도
		

	}//main

}//class
