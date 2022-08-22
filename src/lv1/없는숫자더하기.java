package lv1;

public class 없는숫자더하기 {

	public static void main(String[] args) {
	
		Solution5 s=new Solution5();
		int numbers[]= {1,2,3,4,6,7,8,0};
		int n=s.solution(numbers);
		System.out.println(n);
	}

}

//1<=numbers<=9
//0<=원소값<=9
//중복x
class Solution5 {
    public int solution(int[] numbers) {
        int answer = 0;
        int check[]=new int[10];
        int numberslen=numbers.length;
        for(int i=0;i<numberslen;i++) {
        	check[numbers[i]]++;
        }
        
        for(int i=0;i<10;i++) {
        	if(check[i]==0)answer+=i;
        }
        
        return answer;
    }
}
