package com.practice.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//
//An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
//
// 
//
//Example 1:
//
//Input: s = "anagram", t = "nagaram"
//Output: true
public class ValidAnagram {

	public static void main(String[] args) {

		ValidAnagram classObject = new ValidAnagram();
		// String s="rat";
		// String t="car";

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String s");

		String s = sc.nextLine();

		System.out.println("Enter the String t");

		String t = sc.nextLine();

		boolean result = classObject.isAnagram(s, t);
		System.out.println("This is the result " + result);
		sc.close();
	}

	public boolean isAnagram(String s, String t) {

		char[] a = s.toCharArray();
		char[] b = t.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		return Arrays.equals(a, b);

	}
}
