package com.datastructure;

public class LinkedList {
	Node head;

	class Node {

		Object data;
		Node ref;

		Node(Object data) {

			this.data = data;
		}

	}

	public void addLast(Object data) {

		Node newNode = new Node(data);

		if (head == null) { // list is empty

			head = newNode;

		} else if (head.ref == null) {// add only one node

			head.ref = newNode;
		} else {

			Node temp = head;
			while (temp.ref != null) {

				temp = temp.ref;

			}
			temp.ref = newNode;

		}
	}

	void show() {

		if (head == null) {

			System.out.println("List is empty");
		} else {
			Node temp = head;

			while (temp != null) {
				if (temp.ref != null) {

					System.out.print(temp.data + "=>");

				} else {

					System.out.println(temp.data);
					
					temp=temp.ref;
				}
				
			}
		}

	}

	public static void main(String[] args) {

		LinkedList l = new LinkedList();

		l.addLast(10);
		l.show();

		l.addLast(20);
		l.show();

		l.addLast(30);
		l.show();

		l.addLast(40);
		l.show();

		l.addLast(50);
		l.show();

		l.addLast(60);
		l.show();
	}

}
