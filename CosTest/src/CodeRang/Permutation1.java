package CodeRang;
import java.util.*;

public class Permutation1 {
	public static void main(String[] args) {

		int[] nums = {1,2,3,4};
		
		//1 순열(Permutation)  nPr  nP2
		permutation(nums, 4 , 2, 0);
		System.out.println();

		//2 순열(Permutation) visit 사용
		boolean[] visit2 = new boolean[nums.length];
		LinkedList<Integer> ansList1 = new LinkedList<>();
		permutation2(nums , 4 , 2 , ansList1 , visit2);
		System.out.println();

		//3 증복 순열(Permutation with Repetition)
//		LinkedList<Integer> ansList2 = new LinkedList<>();
//		repermutation(nums , 4 , 2, ansList2);
	}	

	//1 순열(Permutation) 
	static void permutation(int[] nums, int n , int r , int depth ) {		
		if(depth == r) {
			for(int i =0 ; i < r ; i++ ) {
				System.out.print(nums[i] + " ");
			}
			System.out.println();
			return;
		}

		for(int i = depth ; i < n ; i++ ) {
			swap(nums, depth , i);
			permutation(nums ,n , r, depth+1);
			swap(nums, depth , i);			
		}
		
	}
	static void swap(int[] nums, int a, int b) {
		int temp = nums[a];
		nums[a] = nums[b];
		nums[b] = temp;
	}

	
	//2 순열(Permutation) visit 사용
	static void permutation2(int[] nums , int n , int r , LinkedList<Integer> ansList , boolean[] visit ) {
		if(ansList.size() == r) {
			for(int i : ansList) {
				System.out.print(i + " ");
			}
			System.out.println();
			return;
		}

		for(int i = 0 ; i < n ; i ++) {
			if(!visit[i]) {
				visit[i] = true;
				ansList.add(nums[i]);
				permutation2(nums, n , r, ansList, visit);
				visit[i] = false;
				ansList.removeLast();
			}
		}
	}
	

	//3 증복 순열(Permutation with Repetition)
	static void repermutation(int[] nums , int n , int r , LinkedList<Integer> ansList) {
		if(ansList.size() == r) {
			for(int i : ansList) {
				System.out.print(i + " ");
			}
			System.out.println();
			return;
		}

		for(int i = 0 ; i < n ; i ++) {
			ansList.add(nums[i]);
			repermutation(nums, n , r, ansList);
			ansList.removeLast();
		}
	}

}