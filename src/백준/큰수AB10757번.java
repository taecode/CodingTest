package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class 큰수AB10757번 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		String a=st.nextToken();
		String b=st.nextToken();
		
		BigInteger A=new BigInteger(a);
		BigInteger B=new BigInteger(b);
		
		System.out.println(A.add(B));
		
		
	}//main	

}//class
