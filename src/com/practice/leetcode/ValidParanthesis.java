package com.practice.leetcode;

import java.util.Stack;

//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

public class ValidParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "'(', ')', '{', '}', '[' ']'";

		isValid(s);
	
		
		
//can use hashmap to see using the containsKey
	}

	private static boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
			
		char[]a = s.toCharArray();
		
		
		if(s.length()%2!=0)
			return false;

		for(char c : a) {
			if(c=='(' || c=='{' || c=='[') {
				stack.push(c);
			}
			else if(c==')' && !stack.isEmpty() && stack.peek()=='(') {
				stack.pop();
			}else if(c=='}' && !stack.isEmpty() && stack.peek()=='{'){
				stack.pop();
			}
			else if(c==']' && !stack.isEmpty() && stack.peek()=='['){
				stack.pop();
			}
			
		}
		return stack.isEmpty();
		
}}


