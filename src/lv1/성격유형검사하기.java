package lv1;


public class 성격유형검사하기 {

	public static void main(String[] args) {
		

		String []survey= {"AN", "CF", "MJ", "RT", "NA"};
		int []choices= {5, 3, 2, 7, 5};
		System.out.println(solution(survey, choices));
		
		
	}
	 public static String solution(String[] survey, int[] choices) {
	        String answer = "";
	        int []count=new int[100];
	        
	        for(int i=0;i<survey.length;i++) {
	        	char a=survey[i].charAt(0);
	        	char b=survey[i].charAt(1);
	        	
	        	if(choices[i]>4)count[(int)b]+=choices[i]-4;
	        	else if(choices[i]<4)count[(int)a]+=4-choices[i];
	        	
	        	
	        	
	        }
	        if(count[(int)'R']<=count[(int)'T'])answer+="T";
	        else answer+="R";
	        
	        if(count[(int)'C']>=count[(int)'F'])answer+="C";
	        else answer+="F";
	        
	        if(count[(int)'J']>=count[(int)'M'])answer+="J";
	        else answer+="M";
	        
	        if(count[(int)'A']>=count[(int)'N'])answer+="A";
	        else answer+="N";
	        
	        
	        
	        return answer;
	    }

}
