package com.practice.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

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
		//stringLinkedHashset.
		for (Iterator<String> iterator = stringLinkedHashset.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println("coming using iterator "+string);
		}
		
	}
}
