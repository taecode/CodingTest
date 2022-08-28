package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 벌집2292번 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		int count=1; //시작
		int min=2; //범위의 최소 값
		
		if(N==1) {
			System.out.println(1);
		}
		else {
			while(min<=N) {
				min=min+(6*count);
				count++;
			}
			System.out.println(count);
		}
		

	}//main

}//class
