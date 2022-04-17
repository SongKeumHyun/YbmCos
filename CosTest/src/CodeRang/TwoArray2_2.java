package CodeRang;

import java.util.Arrays;

 class TwoArray2_2 {

	public static void main(String[] args) {
		int N = 9;
		int [][]table = new int[N][N];
		
		
		String pos = "4e";
		
		System.out.println((pos.charAt(0)-'0'));
		
		table[(pos.charAt(0)-'0')][(pos.charAt(1)-'a')] = 1;
				
		int []dx = {-1, 1, 0, 0};
		int []dy = { 0, 0, -1,1};
		
		print(table);	
		
		
		for (int i = 0; i < 4; i++) {	
			char r = pos.charAt(0);
			char c = pos.charAt(1);		
			
			while(r>='0' && r <='8' && c >= 'a' && c <= 'i'){				
				table[r-'0'][c-'a'] = 1;
				r = (char)(r + dx[i]);
				c = (char)(c + dy[i]);				
			}			
			print(table);			
		}	
	}
	
	public static void print(int [][]table){
		for(int []tmp : table){
			System.out.println(Arrays.toString(tmp));
		}		
		System.out.println();
	}

}
