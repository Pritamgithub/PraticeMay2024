package com.practice.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class SetOperations {
	public static void main(String[] args) {

		Set<String> stringset= new HashSet<String>();
		stringset.add("Hayabusa");
		stringset.add("R6");
		stringset.add("BMW");
		stringset.add("Cruiser");
		stringset.add("Hayabusa");
		
		System.out.println("Printing Set's implementation to HashSet"+stringset);
		
		Set<String> stringLinkedHashset= new LinkedHashSet<String>();
		stringLinkedHashset.add("Hayabusa");
		stringLinkedHashset.add("R6");
		stringLinkedHashset.add("BMW");
		stringLinkedHashset.add("Cruiser");
		stringLinkedHashset.add("Hayabusa");
		
		System.out.println("Printing Set's implementation to LinkedHashSet "+ stringLinkedHashset);
		
		
		
	}
}
