package algorithms;

public class LinkedList extends Node {
	
	Node head; 
	int size; 
	
	
	LinkedList(int size)
	{
		head = null; 
		size = 0; 
	}
	
	public void addEnd(Object data)
	{	Node temp = new Node(data); 
		Node current = head;
		if(head == null){
		head = temp; 
		size++; 
		return;}
		
		while(current.next != null)
		{
		current = current.getNext();	
		}
		current.setNext(temp);
		size++; 
	}
	
	
	
	
	
	
	public void delete(int i)
	{
		
		if(i > size) throw new IllegalArgumentException("Out of bounds, list is not that big!");
		if(i == 0){
			head = head.next; 
		}
		Node current = head.next; 
		Node previous = head;
		int n = 1; 
		while(current != null){
		
			if(n == i)
			{
				// check if end of the list
			
			
				// last item 
				if(current.next == null)
				{
					current = previous; 
					current.next = null; 
				}else{
					current = previous;
					current.next = current.next.next; 
				}
				
			}
			
			 
			
		//	System.out.println(current.data + "sdfsdfsd");
			previous = current; 
			current = current.next;
			n++;
		}
		size--; 
	}
	
	
	
	public void print()
	{
		Node current = head;
	
		while(current != null){ 
			System.out.print("[" +current.data + "]" + ""); 
			current = current.next; 
		
		}
		System.out.println(" ");
	}
	
	public int getSize()
	{
		return size;
	}
	
}
