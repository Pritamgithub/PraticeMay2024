package com.practice.Lists;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedList {
	public static void main(String[] args) {

		// create a linked list using link implementation and then reverse it

		LinkedList<String> stringList = new LinkedList<String>();

		stringList.add("Hello");
		stringList.add("World");
		System.out.println("Original Format of Linked List " + stringList);
		Collections.reverse(stringList);

		System.out.println("Reverse Format of Linked List " + stringList);
	
		for(int i=0;i<stringList.size();i++) {
			System.out.println(stringList.get(i));
		}

		for(String listelement : stringList) {
			System.out.println(listelement);
		}
		
		stringList.stream().forEach(element ->{
			System.out.println("Printing using stream "+element);
		});
		stringList.forEach(element ->{
			System.out.println("Printing using lambda "+element);
		});

		Iterator<String> iteratorstring = stringList.iterator();
		while(iteratorstring.hasNext()) {
			iteratorstring.next();
			System.out.println("printing using iterator while loop" +stringList);
		}
		

	}
}
