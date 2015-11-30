package algorithms;

public class LinkedStack extends Node {
	int size; 
	Node head; 
	
	public void push(int data)
	{
		Node temp = new Node(data); 
		Node current = head;
		if(head == null) head = temp; 
		else
		{
			Node old = head; 
			head = temp;
			head.next = old; 
				
		}
		
		size++; 
	}
	
	public int pop()
	{
		Node current = head; 
		Node next = head.next; 
		size--; 
		if(next == null) return (Integer)head.data; 

		// replace the head with the next value;
		head = head.next; 
		return (Integer)current.data;
	}
	
	public int getSize()
	{
		return size; 
	}
	
	public boolean isEmpty()
	{
		if(size == 0) return true;
		return false; 
	}
	
}
