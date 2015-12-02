

public class BinarySearch  {

	BinaryTree tree; 
	int data; // data to search 

	BinaryNode left;
	BinaryNode right; 
	public BinarySearch(BinaryTree tree, int data)
	{
		this.tree = tree;
		this.data = data; 


	}
	
	public void search()
	{
 		search(tree.root); 
	}

	public void search(BinaryNode root)
	{
		if(root != null)
		{

		if((Integer)root.data == (Integer)data)
		{
			System.out.println("Element found! "); 
			return; 
		}else{


			if((Integer)data > (Integer)root.data){
				search(root.right);
			}
			if((Integer)data < (Integer)root.data)
			{
				search(root.left); 
			}
		}

		}
		else{
			System.out.println("Item not found in tree"); 
			return;
		}

    
	}
	
}
