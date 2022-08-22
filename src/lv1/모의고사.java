package lv1;

import java.util.ArrayList;
import java.util.Arrays;

public class 모의고사 {

	public static void main(String[] args) {
		
		Solution4 s=new Solution4();
		int nums[]= {1,2,3,4,5};
		int answer[]=s.solution(nums);
		System.out.println("slave");
		System.out.println(Arrays.toString(answer));
	}

}

class Solution4 {
    public int[] solution(int[] answers) {
        int[] answer= {};
        
        int answerslen=answers.length;
        int point[]=new int[4]; //1,2,3번
        int a[]= {1,2,3,4,5};
        int b[]= {2,1,2,3,2,4,2,5};
        int c[]= {3,3,1,1,2,2,4,4,5,5};
        
        //각 배열 수로 나눈 나머지가 인덱스값으로 반복된다.
        for(int i=0;i<answerslen;i++) {
        	if(a[i%5]==answers[i])point[1]++;
        	if(b[i%8]==answers[i])point[2]++;
        	if(c[i%10]==answers[i])point[3]++;
        }
        
        int max=-1;
        for(int i=1;i<4;i++)
        {
        	if(max<point[i])
        	{
        		max=point[i];
        	}
        }
        ArrayList<Integer>list=new ArrayList<Integer>();
        
        for(int i=1;i<4;i++) {
        	if(point[i]==max)
        	{
        		list.add(i);
        	}
        }
        answer=new int[list.size()];
        
        for(int i=0;i<answer.length;i++) {
        	answer[i]=list.get(i);
        }
        
        
        return answer;
    }
}
