package 백준;

import java.util.Scanner;

public class 소수찾기{

	public static void main(String[] args) {
		

		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int count=0;
		for(int i=0;i<N;i++) {
			
			int a=sc.nextInt();
			boolean t=true;
			
			if(a==1)continue;
			for(int j=2;j<a;j++) {
				if(a%j==0) {
					t=false;
					break;
				}
			}
			if(t)count++;
			
			
			
		}
		System.out.println(count);
	}

}
