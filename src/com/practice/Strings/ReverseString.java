package com.practice.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseString {

	public static void main(String args[]) {

		String name = "Pritam";

		//reverseusingCharacterArray(name);
		//reverseusingtoCharacterArray(name);
	}

	private static void reverseusingtoCharacterArray(String name) {

		char[]nameArray= name.toCharArray();//[p,r,i,t,a,m];
		char[] helperArray = new char[nameArray.length];
		//System.out.println("printing helperArray " + " "+nameArray[5] + " I am the length "+ nameArray.length);
		
		for(int i=nameArray.length-1;i>=0;i--)
		{
			helperArray[nameArray.length -1-i]=nameArray[i];
		}
		for(int j=0;j<helperArray.length;j++) {
			System.out.println(helperArray[j]);
		}
		
		System.out.println(" This the helper array printing from Arrays to string() "+Arrays.toString(helperArray));
		
	}

	private static void reverseusingCharacterArray(String name) {
		// TODO Auto-generated method stub
		// convert the name into character array
		char[] nameArray =new char[name.length()];
		//created a nameArray with name.length;
		
		int i=0;
		for (i=0;i<name.length();i++)
		{
			nameArray[i]= name.charAt(i);
		}
		
		for (int j=nameArray.length;j>0;j--)
		{
			System.out.print(""+nameArray[j-1]);
		}
		System.out.println();
		
		System.out.println("This is the name array ");
		System.out.println(Arrays.toString(nameArray));
		
	}

}
