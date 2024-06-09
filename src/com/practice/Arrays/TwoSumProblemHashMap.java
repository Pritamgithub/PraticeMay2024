package com.practice.Arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSumProblemHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("The indices are");
		TwoSumProblemHashMap tsp = new TwoSumProblemHashMap();
		int nums[] = { 2, 7, 11, 15 };
		int a[] = tsp.twoSum(nums, 26);
		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);
		}
	}

	public int[] twoSum(int[] nums, int target) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		//reason to add in the Hashmap is there is a method in Hashmap which is containsKey
		for(int i=0;i<nums.length;i++) {
			
			int complement= target- nums[i];
			//check if the complement exists in the maps
			//System.out.println(complement);
			if(map.containsKey(complement)) {
				return new int[] {map.get(complement),i};
			}
			
			map.put(nums[i], i);
			//System.out.println(" this is the new int  " + new int[] {map.get(complement),i});
				//2, 7,11,15
     			
			
		}
		
		//if no solution is found throw an exception
		throw new IllegalArgumentException("No two sum solution");

	}
}
