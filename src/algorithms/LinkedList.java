

public class LinkedList extends Node {
	
	Node head; 
	int size; 

	
	LinkedList(int size)
	{
		head = null; 
		size = 0; 
	}
	LinkedList()
	{
		head = null; 
		size = 0; 
	}

	public void reverse()
	{
		//Using 3 pointers for reversing LinkedList.
           Node previous=null;
           Node current=head;
           Node nextNode=head;
           
           while(nextNode!=null){
           		 // 2     
                  nextNode=nextNode.next; //make nextNode point to next node.
                  // 
                  current.next=previous; //make current node's next point to previous node.
                  previous = current;  //make previousNode point to currentNode.
                  current=nextNode;   //make currentNode point to nextNode.
           }
           //by this stage of program all the nodes are pointing to previous nodes(which has helped us generating reverse of LinkedList.)
           head=previous;  //now make first point to previous node(i.e. last node).
           
           System.out.println("LinkedList has been reversed successfully.");
	}


	
	public void checkIfCycle()
	{
		
		System.out.println("Checking LinkedList Type");
		System.out.println("--------------------------");
		if(tail == null)
		{
			System.out.println("Not a circular list");
		}
		else{
			System.out.println("Is a circular list");
		}
		
		
	}
	
	
	
	
	
	
	
	public void printCircle()
	{
		if(head == null) throw new IllegalArgumentException("Error list is empty");
		Node current = head; 
		System.out.print("[" + current.data + "]"); 
		while(current.next != tail)
		{
			current = current.next; 
		
			if(current == null) break; 
			
				System.out.print("[" + current.data + "]"); 
			
		}
		System.out.println("");
	}
	
	
	public void doublyAdd(Object data)
	{
		Node temp = new Node(data); 
		Node current = head; 
		if(head == null)
		{
			head = temp;
			tail = null; 
			size++;
			return; 
		}
		while(current.next != null)
		{
			tail = current; 
			current = current.next;
		}
		current.next = temp; 
	}
	
	public void circularAtBeginning(Object data)
	{
		Node temp = new Node(data); 
		Node current = head; 
		Node previous = null; 
		if(head == null)
			{
			head = temp; 
			tail = head; 
			}else{
				// 1 .next = 1, add 2, 2 = head 2.next = 1, 1 .next = head 
				
				previous = head; 
				head = temp; 
		
				current = head; 
				current.next = previous; 

				while(current.next != null)
				{
					
					current = current.next;
					
					if(current.next == tail){
						break; 
					}
				
				}
				current.next = head; 
				tail = head;

			}
		size++; 
	}
	
	
	
	
	
	
	
	
	
	
	
	public void circularAtEnd(Object data)
	{
		Node current = head; 
		Node temp = new Node(data); 
		if(head == null){
			head = temp; 
			tail = head; 
		}else{
		while(current.next != tail)
			{
			if(current.next == null)
				break; 
				
			current = current.next; 

			}
			current.next = temp;
			temp.next = tail; 
			tail = head; 
		}
			size++; 
	}
	
	
	
	
	// sorts the list in place. 
	public void insertionSort(){
		InsertionSort sort = new InsertionSort(this, head); 
		System.out.println("Sorting list of size " + sort.getSize());
		Node n = sort.linkedSort();
		head = n; 
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
			System.out.print("[][" +current.data + "]" + "->"); 
			current = current.next; 
		
		}
		System.out.print("null");
		System.out.println(" ");
	}
	
	public int getSize()
	{
		return size;
	}
	
}
