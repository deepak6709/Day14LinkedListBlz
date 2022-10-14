package com.datastructure;

public class LinkedListBlz {

	public static void main(String[] args) {
		
		  Node<T> head;
		    Node<T> tail;


		    void push(T data){
		        Node<T> node = new Node<>(data);
		        if(head == null){
		@@ -30,13 +31,23 @@ public boolean insertAfter(T searchData, T insertData) {
		        Node<T> newNode = new Node<>(insertData);
		        Node<T> searchedNode = search(searchData);
		        if (searchedNode != null) {
		            newNode.next = searchedNode.next;
		            searchedNode.next = newNode;
		            newNode.next = tail;
		            return true;
		        }
		        return false;
		    }

		    public void popElement(T value){
		        Node<T> searchedNode = search(value);
		        Node<T> temp = head;
		        while(temp.next != searchedNode){
		            temp = temp.next;
		        }
		        temp.next = searchedNode.next;

		    }

		    void add(T data){
		        Node<T> node = new Node<>(data);
		        if(head == null){
		@@ -69,6 +80,16 @@ public T pop() {
		        return deletedElement;
		    }

		    public int size(){
		        int count=0;
		        Node<T> temp = head;
		        while(temp != null){
		            temp = temp.next;
		            count++;
		        }
		        return count;
		    }

		    public T popLast() {
		        T deletedElement = tail.data;
		        Node<T> temp = head;
		@@ -78,6 +99,5 @@ public T popLast() {
		        temp.next = null;
		        temp = tail;
		        return  deletedElement;

		    }
		}
	}

}
