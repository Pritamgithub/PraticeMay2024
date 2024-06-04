/**
 * 
 */
package com.practice.Lists.LinkedList;

/**
 * 
 */
public class LinkedListImplementation {
	Node head;

	class Node {
		int data;
		Node next;

		public Node(int data, Node next) {
			this.data = data;
			this.next = null;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListImplementation linkedList = new LinkedListImplementation();
		linkedList.add(5);
		linkedList.add(7);
		linkedList.add(8);
		linkedList.printList();
		size();

	}

	private void printList() {

		Node current = head; // Start from the head node
		System.out.println("Printing LinkedList ");
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}

	}

	private void add(int data) {

		Node newnode = new Node(data, null);
//		newnode =head;

		if (head == null) {
			head = newnode;
		} else {

			Node current = head;
			while (current.next != null) {
				current = current.next;
			}

			current.next = newnode;
		}
	}

	private static void size() {
		int count = 0;
		Node head = null;
		Node current = head;
		while (current != null) {
			count += 1;
			current = current.next;
		}

	}

}