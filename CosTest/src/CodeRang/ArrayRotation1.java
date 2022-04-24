package CodeRang;

import java.util.Arrays;

 class ArrayRotation1 {

	public static int[][] solution(int[][] sample) {		
		int[][] result = {};
		
		//TODO


		return result;
	}
	
	public static void main(String[] args) {
//		int [][]data = {{3,7,1,9},
//		        {5,2,6,8},
//		        {6,4,7,1},
//		        {5,7,5,4}};
		
        
//		int [][]data = {{6,3,7,2,9},
//		        {8,5,3,6,7},
//		        {1,6,8,7,1},
//		        {4,5,7,9,4},
//		        {7,6,3,7,5}};    
		
		int [][]data = {{6,3,7,2,9,5,3,7},
		          {3,6,8,8,5,3,6,7},
		          {1,6,4,3,8,8,7,1},
		          {6,4,5,7,5,2,9,4},
		          {7,4,8,6,3,1,7,5},
		          {5,6,3,9,8,2,7,1},
		          {6,3,5,7,8,2,6,1},
		          {2,4,4,9,6,1,2,5}};
        
        
        int[][] res = solution(data);
        print(res);

    }    

	public static void print(int [][]ta){
		for(int []tmp : ta){
			System.out.println(Arrays.toString(tmp));
		}		
		System.out.println();
	}
}

