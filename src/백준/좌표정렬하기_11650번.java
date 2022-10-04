package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class 좌표정렬하기_11650번 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		int [][]arr=new int[N][2];
		
		StringTokenizer st;
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(br.readLine());
			arr[i][0]=Integer.parseInt(st.nextToken()) ;
			arr[i][1]=Integer.parseInt(st.nextToken()) ;
		}
		
		//Comparaotr 매개변수 두개 객체를 비교하게 해준다. <객체 타입>
		Arrays.sort(arr, new Comparator<int[]>() {		//1이면 자리 바꾸기, 0,-1은 그대로
			@Override
			public int compare(int[] e1, int[] e2) {
				if(e1[0] == e2[0]) {		// 첫번째 원소가 같다면 두 번째 원소끼리 비교
					return e1[1] - e2[1];
				}
				else {
					return e1[0] - e2[0]; //첫번째 원소가 다르면 첫번째 원소끼리 비교
				}
			}
		});
		/* 람다식 방식
		Arrays.sort(arr, (e1, e2) -> {
			if(e1[0] == e2[0]) {
				return e1[1] - e2[1];
			} else {
				return e1[0] - e2[0];
			}
		});
		*/
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<N;i++) {
			sb.append(arr[i][0]+" "+arr[i][1]).append('\n');
		}
		System.out.println(sb);
		
	}//main

}//class
