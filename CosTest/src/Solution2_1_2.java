// You may use import as below.
import java.util.*;

class Solution2_1_2 {
//    public int solution(int price, String grade) {
//        // Write code here.
//    	int answer = 0;
//    	
//    	if(grade.equals("S"))
//    		answer = price - (int)(price*0.05); 
//    	else if(grade.equals("G"))
//    		answer = price - (int)(price*0.10); 
//    	else if(grade.equals("V"))
//    		answer = price - (int)(price*0.15);    		
//		
//		return answer;
//    } 
    
	// if문으로 작성된 코드를 위의 코드와 같이 if~else if... 문으로 변경해서도 연습하세요.
    public int solution(int price, String grade) {
        // Write code here.
    	int answer = 0;
    	
    	if(grade.equals("S"))    		
    		answer = (int)(price*0.95);
    	
    	if(grade.equals("G"))    		
    		answer = (int)(price*0.90);
    	
    	if(grade.equals("V"))    		
    		answer = (int)(price*0.85);
		
		return answer;
    }

    // The following is main method to output testcase.
    public static void main(String[] args) {
    	Solution2_1_2 sol = new Solution2_1_2();
        int price1 = 2500;
        String grade1 = new String("V");
        int ret1 = sol.solution(price1, grade1);
        
        // Press Run button to receive output.
        System.out.println("Solution: return value of the method is " + ret1 + " .");
        
        int price2 = 96900;
        String grade2 = new String("S");
        int ret2 = sol.solution(price2, grade2);
        
        // Press Run button to receive output.
        System.out.println("Solution: return value of the method is " + ret2 + " .");
    }
}