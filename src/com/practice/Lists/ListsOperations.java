package com.practice.Lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListsOperations {

	public static void main(String[] args) {

		// create a List of names;

		//usingLinkedList();

		// usingArray();
		usingList();

	}

	private static void usingList() {
		List<Person> personList = new ArrayList();
		personList.add(new Person(1, "Ford Motor Company"));
		personList.add(new Person(2, "General Motors"));
		personList.add(new Person(3, "Delta Airlines"));
		// System.out.println("Printing Using List method " + personList.toString());
		for (Person person : personList) {
			System.out.println(" person who is going to work in this companies " + person.id + " " + person.name);
		}

		Iterator<Person> pers=personList.listIterator();
		while (pers.hasNext()) {
			Person type = pers.next();
			System.out.println(type.id + type.name);




		}

	}

	private static void usingArray() {
		Person[] p = { new Person(4, "Sulochana"), new Person(5, "Laxman"), new Person(6, "Rao"),
				new Person(7, "rathod") };

		for (Person pr : p) {
			System.out.println(pr.name);
		}
	}

	private static void usingLinkedList() {
		LinkedList<String> names = new LinkedList<>();

		names.add(0, "chavhan");
		names.add(1, "pritam");
		// names.add(2, "prakash");
		names.add(2, "ramchandra");
		names.add(3, "balusing");
		// names.
		System.out.println(names);
		// create a function to sort this list
		names.sort(null);
		// [chavhan, pritam, ramchandra, balusing]
		System.out.println(names);
	}

}
