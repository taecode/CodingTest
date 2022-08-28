package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 달팽이는올라가고싶다2869번 {

	public static void main(String[] args) throws IOException {
		
		
		
		
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		int A=Integer.parseInt(st.nextToken()) ;//낮에 A미터 올라감
		int B=Integer.parseInt(st.nextToken()) ;//밤에 B미터 떨어짐
		int V=Integer.parseInt(st.nextToken()) ;//높이 V미터 나무 막대
		
	
		
		
		int count=(V-B)/(A-B); //최소 일수 
		
		if((V-B)%(A-B)!=0)count++; // 나머지가 있는 경우 다음날에 한번더 올라가야함 
		System.out.println(count);
			
	
			
			
			/*
			while(h<V) {
				if(h+A>=V) {
					count++;
					break;
				}
				h=h+A+(-B);
				count++;
			}
		
			System.out.println(count);
			*/
		
		

		
	}//main

}//class
