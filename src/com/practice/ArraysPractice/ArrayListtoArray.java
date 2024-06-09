package com.practice.ArraysPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListtoArray {
public static void main(String args[]) {
	Integer a[]= {12,13,14,15};

	List<Integer> listarray2= new ArrayList<>(Arrays.asList(a));

System.out.println("This is coming from util method Arrays " + listarray2.toArray());
	
	
}

}
