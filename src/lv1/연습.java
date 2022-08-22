package lv1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 연습 {

	public static void main(String[] args) {
			
		  Scanner sc=new Scanner(System.in);
	        String input=sc.nextLine();
	        String output="";

	        for(int i=0;i<input.length();i++){
	            if(input.charAt(i)>='A'&&input.charAt(i)<='Z')output+=input.charAt(i);
	        }
	        System.out.println(output);

	        
	        Queue<Integer>q=new LinkedList<Integer>();
	        q.offer(1);
	        q.offer(2);
	        
	        
	        q.poll();
	        System.out.println(q);
	}

}
