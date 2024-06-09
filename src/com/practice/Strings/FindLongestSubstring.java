package com.practice.Strings;

public class FindLongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Need to find the longest substring without repeating characters
		
		// in a string need to find a string with max characters but characters should not be duplicate
		
		//Hashset
		// substring method 
		//string to char array
		// convert back in substring 
		
		String input = "abcabcbb";
		
		char[]a= input.toCharArray();
		char[]b=new char[a.length];
		for(int i=0;i<a.length;i++) {
			if(a[i]!=b[i]) {
				a[i]=b[i];
			}
			
			System.out.println("new String "+ b[i]);
		}
		
		
		
		
		
		
	}

}
