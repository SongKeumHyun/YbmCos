package CodeRang;

import java.util.Arrays;

 class TwoArray {

	public static void main(String[] args) {
		int N = 7;
		int [][]ta = new int[N][N];
		ta[3][2] = 1;
		
		int posx = 3;
		int posy = 2;
		
		int num = 2;
		
		int []dx = {-1, 1, 0, 0};
		int []dy = { 0, 0, -1,1};
		
		print(ta);
		
		
		for (int d = 1; d <= num; d++) {
			for (int i = 0; i < 4; i++) {
				int nx = posx + dx[i]*d;
				int ny = posy + dy[i]*d;
				
				if(nx >= 0 && nx < N && ny >= 0 && ny < N){
					ta[nx][ny] = 1;
				}	
				print(ta);
			}
						
		}	
	}
	
	public static void print(int [][]ta){
		for(int []tmp : ta){
			System.out.println(Arrays.toString(tmp));
		}		
		System.out.println();
	}

}
