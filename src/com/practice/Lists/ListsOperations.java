package com.practice.Lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListsOperations {

	public static void main(String[] args) {

		// create a List of names;

		// usingLinkedList();

		// usingArray();
		usingList();

	}

	private static void usingList() {
		List<Person> personList = new ArrayList();
		personList.add(new Person(1, "Ford Motor Company"));
		personList.add(new Person(2, "General Motors"));
		personList.add(new Person(3, "Delta Airlines"));
		// System.out.println("Printing Using List method " + personList.toString()); //
		// just prints an object value

		// use of contains method in list ... contains method is used to check for
		// objects and

		List<Person> personList2 = new ArrayList();
		personList2.add(new Person(1, "Ford Motor Company"));
		personList2.add(new Person(2, "General Motors"));
		personList2.add(new Person(3, "Delta Airlines"));
		// personList2.add(new Person(4, "Delta Airlines"));

		System.out.println(" Using the equals method " + personList.equals(personList2));

		// personList.clear();// clears the entire list

		System.out.println("is empty check " + personList.isEmpty() + personList2.isEmpty());

		System.out.println("personlist is printing ");
		printListUsingIterator(personList);
		printListUsingIterator(personList2);

		/*
		 * System.out.println( "will print if is present in " + "the list or not " +
		 * personList.contains(new Person(1, "Ford")));
		 */
		// System.out.println("removing at index 0");
		// personList.remove(0);

		// printListUsingIterator(personList);//printsLists using while loop and
		// iterator
		// iterateUsingForLoop(personList);
		// printusingStream(personList);
		// printUsingForEach(personList);

	}

	private static void iterateUsingForLoop(List<Person> personList) {
		for (Person person : personList) { // works using for loop
			System.out.println(" person who is going to work in this companies " + person.id + " " + person.name);
		}
	}

	private static void printUsingForEach(List<Person> personList) {
		personList.forEach(person -> {
			System.out.println("foreach loop id " + person.id + " name " + person.name);
		});
	}

	private static void printusingStream(List<Person> personList) {
		personList.stream().forEach(person -> {
			System.out.println(" using Stream  " + person.id + " name " + person.name);
		});
	}

	private static void printListUsingIterator(List<Person> personList) {
		Iterator<Person> pers = personList.listIterator();
		while (pers.hasNext()) {
			Person type = pers.next();
			System.out.println(type.id + " " + type.name);

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

		// names.add(0, "chavhan");
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
