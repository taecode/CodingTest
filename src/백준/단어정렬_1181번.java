package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;



public class 단어정렬_1181번 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		String[]arr=new String[N];
		for(int i=0;i<N;i++) {
			arr[i]=br.readLine();
		}
		
		Arrays.sort(arr, new Comparator<String>() {		 //1이면 자리 바꾸기, 0,-1은 그대로
			@Override
			public int compare(String e1, String e2) {
				if(e1.length() == e2.length()) {		
					return e1.compareTo(e2); //e1 e2 같으면 0, e1이 크면 1 ,e2가 크면 -1
					
				}
				else {
					return e1.length() - e2.length(); 
				}
			}
		});
		
		StringBuilder sb=new StringBuilder();
		sb.append(arr[0]).append('\n');
		for(int i=1;i<N;i++) {
			if(!arr[i].equals(arr[i-1]))
			sb.append(arr[i]).append('\n');
		}
		System.out.println(sb);
		
		
		
	}//main

}//class
