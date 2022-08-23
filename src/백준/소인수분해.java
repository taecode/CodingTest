package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 소인수분해 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int i=2;
		
		while(i<=N){
			if(N%i==0) {
				System.out.println(i);
				N/=i;
			}else {
				i++;
			}
		}

		br.close();
	}
}
