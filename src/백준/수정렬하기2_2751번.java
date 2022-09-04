package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class 수정렬하기2_2751번 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		ArrayList<Integer>list=new ArrayList<Integer>();
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<N;i++) {
			list.add(Integer.parseInt(br.readLine()));
			
		}
		Collections.sort(list); //O(nlogn) 시간 복잡도 보장

		for(int i=0;i<N;i++) {
			sb.append(list.get(i)).append('\n');
		}
		System.out.println(sb);
	}//main

}//class
