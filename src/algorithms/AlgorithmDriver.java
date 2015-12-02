 import java.util.Scanner; 

public class AlgorithmDriver {

	public static void main(String[] args) {

	
	startManual(); 
	
//	driver.startLinkedList();
	//driver.startBinaryTree();
	//driver.startLinkedList(); 
//	driver.startStack();
//	driver.startLinkedStack();
	//driver.startQueue();
	}

	public static void startManual(){
	AlgorithmDriver driver = new AlgorithmDriver(); 
	driver.startBinaryTree(); 
	}


	public void programmingProblems()
	{

	}



	public static void startInteractive()
	{
	System.out.println("Welcome to my Interview Practice Code! ");
	System.out.println("Please select from the list what you would like to review: "); 
	System.out.println("---Data Structures--- \n" + "1: LinkedLists\n" +"2: BinaryTrees\n" + "3: Stacks \n" + "4: Queues \n" + "5: Heaps");
	System.out.println("6: Graphs \n" + "---Sorting Algorithms--- \n" + "7: InsertionSort \n" + "8: BubbleSort \n" + "9: QuickSort \n" + "10: MergeSort");
	System.out.println("---Programming Problems--- \n" + "11: Find Min element in stack");
	System.out.println("Press Q to Quit");

	Scanner inScan = new Scanner(System.in); 
	AlgorithmDriver driver = new AlgorithmDriver(); 
	while(inScan.hasNext())
	{

		switch(inScan.next()){
			case "1" : driver.startLinkedList(); break;
			case "2" : driver.startBinaryTree(); break;
			case "3" : driver.startStack(); break;
			case "Q" : System.exit(1); break;
			case "q" : System.exit(1); break;
			
		}

		
	}
	}


	
	public void startQueue()
	{
		Queue queue = new Queue(3,1); 
		queue.enQueue(3);
		queue.enQueue(2);
		queue.enQueue(8);
		System.out.println(queue.deQueue()); 
		System.out.println(queue.deQueue()); 
		System.out.println(queue.deQueue()); 

	}
	
	public void startStack(){
		Stack stack = new Stack(10);
	
		stack.push(42);
		stack.push(9);
		stack.push(15);
		stack.getMin(); 
		stack.getMax(); 
	}
	
	public void startLinkedStack()
	{
		LinkedStack stack = new LinkedStack(); 
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.pop();
		stack.pop(); 
		System.out.println("Returning item " + stack.pop());
		System.out.println("The size is now " + stack.getSize()); 
	}
	
	
	
	public void startBinaryTree()
	{
		BinaryTree tree = new BinaryTree();
		tree.add(6); 
		tree.add(24);
		tree.add(19);
		tree.add(94);
		tree.add(5);
		tree.add(1);
		tree.add(10);
		tree.add(3);
		tree.add(8);
		tree.add(9);
	
		tree.postorder(); 
		System.out.println(" ");
		tree.inorder();
		System.out.println(" ");
		tree.preorder();
		System.out.println(" ");

		System.out.println(" ---- Array to Tree -----");

		int testConvert [] = {1,2,3,4};
		BinaryNode root = tree.arraytoTree(testConvert);

		tree.postorder(root); 
	

		//tree.preorder();
	    //tree.postorder();
	   // tree.inorder();
	 //   tree.inorderIT();

	 //   tree.levelOrder();
		System.out.println("Max = " + tree.getMax()); 
		System.out.println("Max = " + tree.getMaxIT()); 
		tree.search(65); 
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

		list.reverse(); 
		list.print(); 
		//list.insertionSort();
		//list.print();
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
