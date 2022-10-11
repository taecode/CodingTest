package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 배수와약수_5086번 {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		StringTokenizer st;
		
		//입력이 0 0 이면 입력 종료
		while(true)
		{
			st=new StringTokenizer(br.readLine()," ");
			
			int first=Integer.parseInt(st.nextToken());
			int second=Integer.parseInt(st.nextToken());
			
			if(first==0&&second==0)break;
			
			if(second%first==0)sb.append("factor\n");
			else if(first%second==0)sb.append("multiple\n");
			else sb.append("neither\n");
			
		}
		System.out.println(sb);
		

	}//main
	

}//class
