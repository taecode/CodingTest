package 백준;

import java.io.IOException;
import java.util.Scanner;

public class 손익분기점1712번 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
	 	int  A = Integer.parseInt(st.nextToken());// 고정비용
		int  B = Integer.parseInt(st.nextToken());// 가변비용
		int  C = Integer.parseInt(st.nextToken());// 노트북가격(수입)
		*/
		
		Scanner sc = new Scanner(System.in);
        long A = sc.nextLong(); // 고정비용
        long B = sc.nextLong(); // 가변비용
        long C = sc.nextLong(); // 노트북가격(수입)

		long sales = 0;// 판매댓수
		
		if(C<=B) {
			System.out.println(-1);
			return;
		}
		while (A>=sales*C) {
			A+=B;
			sales++;
			
		}
		System.out.println(sales);
		
		/*
		if(B>=C) {
			
			System.out.println("-1");
		}
		
		else {
			System.out.println(A/(C-B)+1);  //sales*C=A+sales*B  --> sales=A/(C-B)
		}
		*/
		
		
	}// main

}// class
