package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class 팩토리얼10872번 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		int sum=factory(N);
		System.out.println(sum);

	}//main
	static int factory(int N) {
		if(N<=1)return 1;
		return N*factory(N-1);
		
	}

}//class
