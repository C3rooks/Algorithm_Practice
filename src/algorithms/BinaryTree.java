package algorithms;

/*
 * Binary Search Tree,   insert root.. everything less goes to the left, greater goes to the right  
 * 
 * 
 * 
 * 
 */
public class BinaryTree extends BinaryNode implements Ilist{


	int size; 
	BinaryNode root;
	BinaryTree()
	{
		size = 0; 
		left = null; 
		right = null;
		root = null; 
	}
	
// needs work 
	public void print()
	{
		boolean condition = true;
		String output = "";
		if(root != null)
		{
			BinaryNode left = root.getLeft(); 
			BinaryNode right = root.getRight(); 
			
			output += "[" + root.data + "]";
			while(condition)
			{
				
				if(left != null)
				{
					output += "[" + root.getLeft().data + "]";
					left = left.getLeft(); 
				}
				
				if(right != null)
				{
					output += "[" + root.getRight().data + "]";
					right = right.getRight(); 
				}
				
                if(left.data == null && right.data == null)
               condition = false; 

			}
			
		}

	       System.out.println("Order = " + output); 


		
	}
	
	public void add(Object data)
	{
		add(root,data); 
	
	}
	
	public void add(BinaryNode current, Object data)
	{
		BinaryNode temp = new BinaryNode(data); 
		if(current == null) {
		current = temp;
		size++; 
		
		root = current; 
		return; 
		}
		
	
		BinaryNode left = current.left; 
		BinaryNode right = current.right; 
		
	
		
		
		if((Integer)data < (Integer)current.data){
			if(left == null) {
			BinaryNode temp2 = new BinaryNode(data); 
			current.left = temp2; 
			size++; 


				return;
			}
			else{
				add(current.left, data);
			}
		}
		
		if((Integer)data > (Integer)root.data){
			if(right == null) {current.right = temp; 
				
			}
			
		}
		
		
	
		
		
		
		
	
		root = current; 
		size++; 
		
	}
	
	
	
	
	public int getSize()
	{
		return size; 
	}
	
	public void delete(int i)
	{
		
	}
	
}
