class Solution2101 {
    public String solution2101(String s) {
        s += '#';
        String answer = "";
        for(int i = 0; i < s.length(); ++i)
        {
        	char a = s.charAt(i);
        	//char b = s.charAt(i+1);
        	
            if (s.charAt(i) == '0' )  // 01
            {
            	if(i != 0 && s.charAt(i-1) != '0') 
                answer += "0";
            }
            else
            {
                answer += "1";
            }
        }
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. main 메소드는 잘못된 부분이 없으니, solution 메소드만 수정하세요.
    public static void main(String[] args) {
        Solution2101 sol = new Solution2101();
        String s = "101100011100";
        String ret = sol.solution2101(s);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}