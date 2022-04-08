import java.util.Arrays;

class Solution461 {      //10        3
    public int power(int base, int exponent) {
        int val = 1;
        for (int i = 0; i < exponent; i++) 
            val *= base;
        return val;
    }
    public int[] solution461(int k) {
        // 1000
    	int range = power(10, k);
        int[] answer = new int[range];
        int count = 0;
                 //100                  999
        for (int i = range / 10; i < range; i++)
        {
            int current = i;
            int calculated = 0; // 자아 도취수
            while (current != 0) 
            { //100 시작해서 0이될때까지 멀한다는 건데...
            	
				calculated += power(current % 10, k); // 1의자리 k성
				current = current / 10; // 10의 몫이므로, 10자리씩 줄여간다
				
            }
            if (calculated == i)
                answer[count++] = i;
        }

        int[] ret = new int[count];
        for (int i = 0; i < count; i++)
            ret[i] = answer[i];
        return ret;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution461 sol = new Solution461();
        int k = 3;
        int[] ret = sol.solution461(k);

        // 실행] 버튼을 누르면 출력값을 볼 수 있습니다.
        System.out.printf("solution 메소드의 반환 값은 ");
        System.out.printf(Arrays.toString(ret));
        System.out.printf(" 입니다.\n");
    }   
}