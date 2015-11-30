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
	

	public void add(Object data)
	{
		add(root,data); 
	
	}
	
	
	public void postorder()
	{
		postorder(root); 
	}
	public void postorder(BinaryNode root)
	{
		if(root != null)
		{
			postorder(root.getLeft());
			postorder(root.getRight()); 
			System.out.println(root.data); 
		}
	
	}
	
	public void inorder()
	{
		inorder(root);
	}
	public void inorder(BinaryNode root)
	{
		if(root != null)
		{
			inorder(root.getLeft());
			System.out.println(root.data);
			inorder(root.getRight());
		}
	}
	
	public void preorder()
	{
		preorder(root); 
	}
	public void preorder(BinaryNode root)
	{
		if(root != null){
		System.out.println(root.data); 
		preorder(root.left);
		preorder(root.right);
		}
		
	}
	
	public BinaryNode add(BinaryNode current, Object data)
	{
		BinaryNode temp = new BinaryNode(data);
		if(current == null) {
			current = temp; 
			root = current; 
		}
		


		if((Integer)data < (Integer)current.data)
		{
			current.left = add(current.left, data); 
		}
		else if((Integer)data >(Integer)current.data)
		{
			current.right = add(current.right,data); 
		}
		
		root = current; 
		return current; 
		
		
	}
	
	
	
	
	public int getSize()
	{
		return size; 
	}
	
	public void delete(int i)
	{
		
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	
}
