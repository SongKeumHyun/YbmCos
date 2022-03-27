class Solution311 {
	
	// 2배 배열 뒤에 넣어 주고 리턴 해주는 배열
    int[] func_a(int[] arr) 
    {
        int length = arr.length;
        int[] ret = new int[length*2];
        for(int i = 0; i < length; i++)
            ret[i + length] = ret[i] = arr[i];
        
        return ret;
    }
    
    // 둘이 가능성이 있나
    // 원리는 서로다른 배열에 동일 한 수가 있는지... 보는 방법
    boolean func_b(int[] first, int[] second)
    {
        int[] counter = new int[1001];
        for(int i = 0; i < first.length; i++)
        {
            counter[first[i]]++;
            counter[second[i]]--;
        }
        for(int i = 0; i < 1001; i++)
            if(counter[i] != 0)
                return false;
        return true;
    }
    
    // first는 비교 대상 이 두배의 크기로 들어 있는 배열 123+ 123
    // 시작 주서는 다르지만 연속해서 동일한 수의 패턴이 존재 하는지 확인 
    boolean func_c(int[] first, int[] second)
    {
	    int length = second.length;
	    for(int i = 0; i < length; i++)
	    {
	        int j;
	        for(j = 0; j < length; j++)
	            if(first[i + j] != second[j])
	                break;
	        if(j == length)
	            return true;
    }
	    
    return false;
    }

    public boolean solution311(int[] arrA, int[] arrB) 
    {
        if(arrA.length != arrB.length)
            return false;
        
        if(func_b(arrA,arrB))
        {
            int[] arrAtemp = func_a(arrA);
            if(func_c(arrAtemp,arrB))
                return true;
        }
        return false;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution311 sol = new Solution311();
        int[] arrA1 = {1, 2, 3, 4};
        int[] arrB1 = {3, 4, 1, 2};
        boolean ret1 = sol.solution311(arrA1, arrB1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int[] arrA2 = {1, 2, 3, 4};
        int[] arrB2 = {1, 4, 2, 3};
        boolean ret2 = sol.solution311(arrA2, arrB2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}