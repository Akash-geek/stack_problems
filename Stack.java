package StackProblmes;


public class Stack {
	Node head = null;
	class Node{
		Node next;
		int data;
		public Node(int data){
			this.next = null;
			this.data = data;
			}
		public Node(){
			this.next = null;
			}
		}

		
	public int pop(){
		if(this.head == null)
		return -100;
		else{
			 int data = head.data;
			 head = head.next;
			 return data;
		}
		
	}
	
	public boolean isEmpty(){
		return this.head == null? Boolean.TRUE : Boolean.FALSE;
	}
	 
	public void push(int data){
		Node newNode = new Node(data);
		if(this.head == null){
			this.head = newNode;
		} else {
			Node temp = this.head;
			this.head = newNode;
			this.head.next = temp;
		}
	}
	
	public int top(){
		return this.head == null ? -100 : this.head.data;
	}
	
	
}
