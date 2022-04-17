// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution4_08 {
	
	public static ArrayList<Integer> numberlist = new ArrayList<Integer>();
	
	public static int countInt(String str, int c) {
		int count = 0;
		
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i) - '0' == c) {
				count++;
				
			}
		}
		return count;
		
	}
	
	public static void func(int level, int max_level, int num, int[] cur_count, int []number) {
		if(level == max_level) {
			numberlist.add(num);
			return;
		}
		
		for(int i=1; i<10; i++) {
			if(cur_count[i] < number[i]) {
				cur_count[i]++;
				func(level+1, max_level, num*10+i, cur_count, number);
				cur_count[i]--;
			}
		}
		
	}
	
	public int solution(int[] card, int n) {
        // 여기에 코드를 작성해주세요.
        int answer = 0;
        int number[] = new int[10];
        
        for(int i : card) {
        	number[i]++;
        }
        String tmp = ""+n;
        for(int i=1; i<10; i++) {
        	if(countInt(tmp, i) != number[i])
        		return -1;
        }
        	
        func(0, card.length, 0, new int[10], number);
        
        for(int i=0; i<numberlist.size();i++) {
        	if(numberlist.get(i) == n) {
        		answer = i+1;
        		break;
        	}
        }
        
        return answer;
    }
    
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
    	Solution4_08 sol = new Solution4_08();
        int card1[] = {1, 2, 1, 3};
        int n1 = 1312;
        int ret1 = sol.solution(card1, n1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다. 
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int card2[] = {1, 1, 1, 2};
        int n2 = 1122;
        int ret2 = sol.solution(card2, n2);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }    
}