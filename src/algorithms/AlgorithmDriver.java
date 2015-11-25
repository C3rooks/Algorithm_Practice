package algorithms;

public class AlgorithmDriver {

	public static void main(String[] args) {
	
	AlgorithmDriver driver = new AlgorithmDriver(); 
	driver.startLinkedList();
	//driver.startBinaryTree();
	}
	
	
	public void startBinaryTree()
	{
		BinaryTree tree = new BinaryTree();
		tree.add(10); 
		tree.add(8);
		tree.add(12);
	    tree.add(7);
		tree.print(); 
		
	}
	
	
	public void startLinkedList()
	{
		LinkedList list = new LinkedList(10); 
		
		list.addEnd(1);
		list.addEnd(10);
		list.addEnd(4);
		list.addEnd(8);
		list.addEnd(12);
		list.addEnd(9);
		list.print(); 
		list.insertionSort();
		list.print();
		/*
		list.addEnd("Hi");
		list.addEnd("whatsup");
		list.addEnd("Corey");
		System.out.println("Size = " + list.getSize()); 
		list.print(); 
		
		list.delete(1); // deletes at location 2; 
		//list.print();
		list.checkIfCycle();
	
		
		LinkedList circular = new LinkedList(10); 
		circular.circularAtEnd("Hi");
		circular.circularAtEnd("whatsup");
		circular.circularAtEnd("Corey");
		circular.circularAtEnd("Foo");
		//circular.printCircle(); 

		circular.circularAtBeginning("Bar");
	//	circular.printCircle(); 
		//System.out.println("Size = " + circular.getSize());
		
	
		LinkedList doubly = new LinkedList(10); 
		doubly.doublyAdd("hell");
		doubly.doublyAdd("whatsssssss");
		doubly.doublyAdd("Algorithms");
	//	doubly.printCircle(); 
		//doubly.checkIfCycle();
		  */ 
		 
	}

	
	
	
	
}
