

public class InsertionSort {

	public LinkedList list; 
	public Node head; 
	int[] array; 

	public InsertionSort(int [] array)
	{
		this.array = array;
		sort(array); 
	}

	public void sort(int [] list)
	{
      for(int i = 0; i <= list.length -1; i++)
      {
      	for(int j = i+1; j <= list.length -1; j++)
      	{
      		if(list[i] > list[j])
      		{

      			int temp = list[i];
      			list[i] = list[j]; 
      			list[j] = temp; 
      		}

      	}
      }
	}

	public int[] getList()
	{

		return array; 
	}
	public InsertionSort(LinkedList list, Node head)
	{
		this.list = list; 
		this.head = head; 
	}
	
	public int getSize()
	{
		return list.getSize();
	}
	
	public Node linkedSort()
	{
		// 2 loops. 
		Node current = head; 
		Node previous = head; 
		boolean condition = true;
		boolean condition2 = true;
		boolean swapped = false; 
		Node nextUp = head.next; 
		
		Node head2 = null;
		while(condition)
		{
			 // this is for the first.
			while(condition2)
			{
			 
				if((Integer)current.data > (Integer)nextUp.data)
				{	
					Node temp = current; // 10 
					Node other = nextUp; // 4 
					
					head2.next = nextUp; // sets the 1 .next = to the 4 
					current = other; // current = 4 
					nextUp = temp; // nextUp = 10
					nextUp.next = other.next;
					
					swapped = true; 
				}
				
				else{
					nextUp = nextUp.next;
					if(nextUp == null){
						condition2 = false;
					}
				}
			
			}	
			
			head2 = current; 
			current = current.next; 
			if(current == null) condition = true; 
			else{
				nextUp = current.next;
				condition2 = true; 
			}
		}
		
	
		System.out.println(head.data + "Test"); 
		return current; 
		
		
	}
	
}
