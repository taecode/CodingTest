package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class 커트라인_25305번 {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		StringTokenizer sd=new StringTokenizer(br.readLine()," ");
		int N=Integer.parseInt( st.nextToken());
		int K=Integer.parseInt( st.nextToken());
		int []x=new int[N];
		ArrayList<Integer>list=new ArrayList<Integer>();
		for(int i=0;i<N;i++){
			list.add(Integer.parseInt(sd.nextToken()));
		}
		
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list.get(K-1));
		
		
		
		
		
		
	}//main

}//class
