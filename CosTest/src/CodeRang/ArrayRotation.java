package CodeRang;

//2차원 배열 회전 코드
public class ArrayRotation {

	public int[][] rightRotation90(int [][]A){
		int n = A.length;
		int[][] B = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				//B[i][j] = A[n - 1 - j][i];
				B[j][n-1-i] = A[i][j];
			}
		}

		return B;
	}
	
	public int[][] leftRotation90(int[][] A) {
		int n = A.length;
		int[][] B = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				B[i][j] = A[j][n -1 -i];
			}
		}

		return B;
	}
	
	public int[][] Rotation180(int[][] A) {
		int n = A.length;
		int[][] B180 = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				B180[i][j] = A[n - 1 - i][n - 1 - j];
			}
		}

		return B180;
	}
	
	public static void main(String[] args) {
		/*  
        int[][] A = { { 5, 4, 7}, 
					  { 1, 5, 4}, 
					  { 7, 6, 8} };
        */
		
        
        int[][] A = { { 2,7,11,9}, 
					  { 13,8,12,3}, 
					  { 31,18,5,6},
					  {7,17,14,7}};		        
        
        ArrayRotation sol = new ArrayRotation();
        
        int[][] right = sol.rightRotation90(A);
        printAry(right);
        
        int[][] left = sol.leftRotation90(A);
        printAry(left);
        
        int[][] res180 = sol.Rotation180(A);
        printAry(res180);

    }    

	//확인용
    public static void printAry(int[][] array){
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                System.out.print(array[i][j] + "\t ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

