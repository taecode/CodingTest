package 백준;

import java.util.Scanner;


public class 소수 {

	public static void main(String[] args) {
		
	int M;
		int N;
		Scanner sc=new Scanner(System.in);
		M=sc.nextInt();
		N=sc.nextInt();
		
		int hap=0;
		int min=99999999;
		
		for(int i=M;i<=N;i++) {
			
			boolean t=true;
			if(i==1)continue;
			for(int j=2;j<=Math.sqrt(i);j++) {
				if(i%j==0) {
					t=false;
					break;
				}
				
			}
			
			if(t) {
				if(min>i)min=i;
				hap+=i;
			}
			
		}

		if(hap==0)System.out.println(-1);
		else {
			System.out.println(hap);
			System.out.println(min);
		}
	}
	//?뭐지as
	

}