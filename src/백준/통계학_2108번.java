package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class 통계학_2108번 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		int []arr=new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		//산술평균
		double sum=0;
		for(int i=0;i<N;i++) {
			sum+=arr[i];
		}
		System.out.println(Math.round(sum/N));
		
		//중앙값
		Arrays.sort(arr);
		System.out.println(arr[(0+N)/2]);
		
		//최빈값
		int []count=new int[8001];
		for(int i=0;i<N;i++) {
			count[arr[i]+4000]++;  //-4000~4000
		}
		int max=0;
		for(int i=0;i<8001;i++) {
			if(max<count[i]) {
				max=count[i];
			}
		}
		int cnt=0;
		int []brr=new int[N];
		for(int i=0;i<8001;i++) {
			if(count[i]==max) {
				brr[cnt]=i;
				cnt++;
			}
			
		}
		if(cnt>1) {
			int bcount=0;
			Arrays.sort(brr);
			System.out.println(Arrays.toString(brr));
			for(int i=0;i<N;i++) {
				if(bcount==1) {
					System.out.println(brr[i]-4000);
					break;
				}
				if(brr[i]>0)bcount++;
			}
		}else{
			
			System.out.println(brr[0]-4000);
		}
		
		
		//범위
		
		System.out.println(arr[N-1]-arr[0]);
		

	}//main

}//class
