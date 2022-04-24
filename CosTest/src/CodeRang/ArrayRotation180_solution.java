package CodeRang;

public class ArrayRotation180_solution {
	
	public static String solution(int[][] sample) {			
		String answer = "";
		
		int n = sample.length;
		int [][]B = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				B[i][j] = (sample[i][j] + sample[n-1-i][n-1-j])%10;
			}
		}
		
		for(int i=0; i<n; i++) {
			if(i%2 == 0) {
				for(int j=0; j<n; j++) {
					answer += B[i][j];
				}
			}else {			
				for(int j=n-1; j >= 0; j--) {
					answer += B[i][j];
				}
			}
		}

		return answer;
	}
	public static void main(String[] args) {
//		int [][]data = {{5, 4, 7},
//				        {1, 5, 4},		        
//				        {7, 6, 8}};
		
        
		int [][]data = {{2, 7, 11, 9},
				        {13, 8, 12, 3},
				        {31, 18, 5, 6},
				        {7, 17, 14, 7}};    

        
        String res = solution(data);
        System.out.println(res);

    }   

}

