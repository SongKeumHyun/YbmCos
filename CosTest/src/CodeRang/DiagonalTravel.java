package CodeRang;

import java.util.Arrays;

public class DiagonalTravel {

	public static int[][] solution(int N, int x, int y){
		int [][]answer = new int[N][N];
		int dx[] = {-1, -1, -1, 0, 1, 1, 1, 0};
		int dy[] = {-1, 0, 1, 1, 1, 0, -1, -1};


		answer[x][y] = 1;
		print(answer);

	    
		for (int i=0; i<dx.length; i++) {
		    int nx = x + dx[i];
			int ny = y + dy[i];			
			if ((0<= nx && nx < N) && (0<= ny && ny < N))
			       answer[nx][ny] = 1;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		int N = 8;
		int x = 3;
		int y = 3;
		int [][]result = solution(N, x, y);
		print(result);

	}

	public static void print(int [][]ta){
		for(int []tmp : ta){
			System.out.println(Arrays.toString(tmp));
		}		
		System.out.println();
	}
}
