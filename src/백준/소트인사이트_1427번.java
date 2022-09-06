package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class 소트인사이트_1427번 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String N=br.readLine();
		
		StringBuilder sb=new StringBuilder();
		ArrayList<Integer>list=new ArrayList<Integer>();
		for(int i=0;i<N.length();i++) {
			list.add(N.charAt(i)-'0');
		}
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
		for(int i=0;i<list.size();i++) {
			sb.append(list.get(i));
			
		}
		System.out.println(sb);
	}//main

}//class
