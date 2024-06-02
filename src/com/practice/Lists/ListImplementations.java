/**
 * 
 */
package com.practice.Lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * 
 */
public class ListImplementations {

	/**
	 * List has three implementation 
	 * 1. LinkedList -> internally uses doubly linked list and acts a queue and list, used for manipulation for faster
	 * 2. ArrayList -> Internally uses dynamic arrays, used for storing and accessing
 	 * 3. Stack -> LIFO, push, pop, peek, remove etc
	 * 4. Vector which is deprecated in java 5
	 */
	
	static int number =20;

	public static void main(String[] args) {
		//ListImplementations lm= new ListImplementations();
		System.out.println(ListImplementations.number);
		
		List<String> stringlist= new Stack<String>();
		stringlist.add("Hayabusa");
		stringlist.add("R6");
		stringlist.add("BMW");
		stringlist.add("Cruiser");
		stringlist.add("Hayabusa");
		
		System.out.println("Printing List's implementation using Stack "+stringlist);
		
		List<String> stringlinkedlist= new LinkedList<String>();
		stringlinkedlist.add("Hayabusa");
		stringlinkedlist.add("R6");
		stringlinkedlist.add("BMW");
		stringlinkedlist.add("Cruiser");
		stringlinkedlist.add("Hayabusa");
		
		System.out.println("Printing list's implementation using Linked List"+stringlinkedlist);
		
		List<String> stringArraylist= new ArrayList<String>();
		stringArraylist.add("Hayabusa");
		stringArraylist.add("R6");
		stringArraylist.add("BMW");
		stringArraylist.add("Cruiser");
		stringArraylist.add("Hayabusa");
		
		System.out.println("Printing list's implementation using Array List"+stringArraylist);
		
		
	}

}
