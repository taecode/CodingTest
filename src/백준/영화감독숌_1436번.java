package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 영화감독숌_1436번 {

	public static void main(String[] args) throws NumberFormatException, IOException {


		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		int n=666;
		int count=1;
		
		while(count!=N) {
			n++;
			/*
			int mcount=0;
			String m=Integer.toString(n);
			for(int i=0;i<m.length();i++) {
				if(m.charAt(i)=='6')mcount++;
				else {
					if(mcount==0)mcount=0;
					else mcount--;
				}
				
			}
			if(mcount>=3)count++;
			
		}
		*/
			if(String.valueOf(n).contains("666"))
			{
				count++;
			}
		}
		System.out.println(n);
	}//main

}//class
