package com.practice.Arrays;

public class TwoSumProblemBruteForceWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The indices are");
		TwoSumProblemBruteForceWay tsp= new TwoSumProblemBruteForceWay();
		int nums[] = {2,7,11,15};
	   int a[]= tsp.twoSum(nums, 9);
	   for(int i=0;i<a.length;i++) {
		   
		   System.out.println(a[i]);
	   }
	}
	
	
	public int[] twoSum(int[] nums, int target) {
		int i;
		int j = 0;
		for( i =0;i<nums.length;i++) {
			for( j=i+1;j<nums.length;j++) {
				if(nums[i]+nums[j]==target) {
					return new int[] {i,j};
				}
			}
		}
		return new int[] {};        
	}
}
