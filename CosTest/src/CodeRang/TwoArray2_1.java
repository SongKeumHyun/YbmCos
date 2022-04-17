package CodeRang;

import java.util.Arrays;

 class TwoArray2_1 {

	public static void main(String[] args) {
		int N = 9;
		int [][]table = new int[N][N];
		
		
		String pos = "d4";
		
		table[(pos.charAt(0)-'a')][(pos.charAt(1)-'0')] = 1;
		
		int num = 3;
		
		int []dx = {-1, 1, 0, 0};
		int []dy = { 0, 0, -1,1};
		
		print(table);		
		
		for (int d = 1; d <= num; d++) {
			for (int i = 0; i < 4; i++) {
				int nx = (pos.charAt(0)-'a') + dx[i]*d;
				int ny = (pos.charAt(1)-'0') + dy[i]*d;
				
				if(nx >= 0 && nx < N && ny >= 0 && ny < N){
					table[nx][ny] = 1;
				}
				print(table);	
			}
					
		}	
	}
	
	public static void print(int [][]table){
		for(int []tmp : table){
			System.out.println(Arrays.toString(tmp));
		}		
		System.out.println();
	}

}
