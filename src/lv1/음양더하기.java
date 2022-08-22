package lv1;

public class 음양더하기 {

	public static void main(String[] args) {
		
		Solution s=new Solution();
		
		int []absolutes= {4,7,12};
		boolean[]signs= {true,false,true};
		int answer=s.solution(absolutes,signs);
		System.out.println(answer);
	}
	
}

class Solution 
{
		//absoultes 숫자 signs 부호 true == + ,false== -
	    public int solution(int[] absolutes, boolean[] signs) {
	        int answer = 0;
	        
	        /*
	        for(int i=0;i<absolutes.length;i++) {
	        	if(signs[i]==true)answer+=absolutes[i];
	        	else answer-=absolutes[i];
	        }+
	        */
	        
	        //삼항연산자
	        for(int i=0;i<absolutes.length;i++) {
	        	answer+=absolutes[i]*(signs[i]? 1:-1);
	        }
	        
	        
	        return answer;
	    }
	}


