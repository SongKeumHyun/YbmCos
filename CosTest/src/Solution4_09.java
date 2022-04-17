// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution4_09 {
    public String solution(int hour, int minute) {
        // 여기에 코드를 작성해주세요.
        String answer = "";
        double h = (double)hour*30.0 + (double)minute * 0.5; 
        double m = (double)minute * 6.0;
        
        double degree = Math.abs(h - m);
        
        
        return answer+degree;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. 
    public static void main(String[] args) {
    	Solution4_09 sol = new Solution4_09();
        int hour = 2;
        int minute = 25;
        String ret = sol.solution(hour, minute);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}