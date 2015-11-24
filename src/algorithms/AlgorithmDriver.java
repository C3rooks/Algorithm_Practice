package algorithms;

public class AlgorithmDriver {

	public static void main(String[] args) {
	
	AlgorithmDriver driver = new AlgorithmDriver(); 
	//driver.startLinkedList();
	driver.startBinaryTree();
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
		list.addEnd("Hi");
		list.addEnd("whatsup");
		list.addEnd("Corey");
		System.out.println("Size = " + list.getSize()); 
		list.print(); 
		
		list.delete(1); // deletes at location 2; 
		list.print(); 
	}

	
	
	
	
}
