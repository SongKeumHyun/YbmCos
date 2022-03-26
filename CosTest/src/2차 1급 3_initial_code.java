class Solution23 {
    
	// 앱력값에 해당하는 10의 배술를 리턴 하네
	public int func_a(int n){
        int ret = 1;
        while(n > 0){
            ret *= 10; // 루프마다 10의 배수를 곱함
            n--;
        }
        return ret;
    }

    //숫자의 길이 구하기
    int func_b(int n){ 
        int ret = 0;
        while(n > 0){
            ret++;
            n /= 10; // 10으로 나눈 몫을 리턴 하면 리턴 회수가 자리수가 됨
        }
        return ret;
    }
 // 전체 구성하는 자리의 수들의 합을 구하네 
    int func_c(int n){ 
        int ret = 0;
        while(n > 0){
            ret += n%10;
            n /= 10; // 위에서 한자리 씩 제거한다는 의미 1234 -> 123 >  12 -> 1
        }
        return ret;
    }
    
	public int solution23(int num) {
        int nextNum = num;
        while(true){
            nextNum++;
            int length = func_b(nextNum); // 전체 길를 구하는 수
            if(length % 2 != 0)
                continue;

            int divisor = func_a(length/2); // 초
            int front = nextNum / divisor;
            int back = nextNum % divisor;
            
            int frontSum = func_c(front);
            int backSum = func_c(back);
            if(frontSum == backSum)
                break;
        }
        return nextNum - num;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution23 sol = new Solution23();
//        int tmp = sol.func_a(2);
       
        int num1 = 1;
        int ret1 = sol.solution23(num1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int num2 = 235386;
        int ret2 = sol.solution23(num2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");

    }
}