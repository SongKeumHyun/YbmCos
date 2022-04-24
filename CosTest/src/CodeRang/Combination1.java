package CodeRang;

import java.util.*;

public class Combination1 {
	public static void main(String[] args) {

		int[] nums = {1,2,3,4};

		//1. 조합(Combination) - visit 배열로 사용 여부 체크하는 방법
		boolean[] visit1 = new boolean[nums.length];
		combination1(nums, 4, 2, 0, visit1);
		System.out.println();

		//2 조합(Combination) - 재귀 호출로 사용 여부 결정하는 방법   nCr
		int[] ans1 = new int[2];
		combination2(nums, ans1 , 4,2,0,0);	
		
		//3 중복 조합
        int[] ans2 = new int[2];
        recombination(nums, ans2, 4 ,2, 0 ,0 );
	}

	//1. 조합(Combination) - visit 배열로 사용 여부 체크하는 방법
	static void combination1(int[] nums, int n , int r , int start , boolean[] visit) {
		if(r == 0) {
			for(int i = 0 ; i < nums.length ; i++ ) {
				if(visit[i]) {
					System.out.print(nums[i] + " ");
				}
			}
			System.out.println();
			return;
		}

		for(int i = start ; i < nums.length  ; i++ ) {
			visit[i] = true;
			combination1(nums, n, r-1 , i+1 , visit);
			visit[i] = false;
		}

	}
	
	//2 조합(Combination) - 재귀 호출로 사용 여부 결정하는 방법
	static void combination2(int[] nums, int[] ans, int n , int r, int idx, int target) {
		if(r==0) {
			for(int i : ans) {
				System.out.print( i + " ");
			}
			System.out.println();
			return;
		}

		if(target == n) 
			return;
		ans[idx] = nums[target];
		combination2(nums,ans, n , r-1, idx+1, target+1); // 선택
		combination2(nums,ans, n , r, idx, target+1); // 선택 안함
	}

	//3 중복조합(Combination with repetition)
	static void recombination(int[] nums , int[] ans , int n , int r ,int idx , int target ) {
		if( r == 0 ){
			for(int i : ans) {
				System.out.print(i + " ");
			}
			System.out.println();
			return;
		}

		if(target == n) 
			return;
		ans[idx] = nums[target];
		recombination(nums, ans , n , r-1, idx+1, target);
		recombination(nums, ans , n , r , idx , target+1);
	}
}