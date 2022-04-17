package CodeRang;

import java.util.Arrays;

 class TwoArray2_3 {

	public static void main(String[] args) {
		int N = 9;
		int [][]table = new int[N][N];
		
		
		String pos = "d4";
		
		table[(pos.charAt(0)-'a')][(pos.charAt(1)-'0')] = 1;
		
		int num = 3;
		
		int []dx = {-1, 1, 0, 0};
		int []dy = { 0, 0, -1,1};
		
		print(table);
		
		int cnt = 0;
		for (int i = 0; i < 4; i++) {
			char r = pos.charAt(0);
			char c = pos.charAt(1);	
			
			while(r>='a' && r <='i' && c >= '0' && c <= '8'){	
				cnt++;
				table[r-'a'][c-'0'] = 1;
				r = (char)(r + dx[i]);
				c = (char)(c + dy[i]);
				
				if(cnt == num){
					cnt = 0;
					break;
				}
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


/*
 * �ٸ� �ڵ��� ������ ����ϸ�, TwoArray2_1.java �ڵ��� ���ó�� ���ѵ� ������ŭ �����¿�� 1�� ä����� �� ��
 * ī��Ʈ �� �� �ִ� ������ �ϳ��� �� �� ���� �ִٴ� ���� �ڵ��� ���̹Ƿ� �����ϼ���.
 * 
 */ 
