package algorithms;

public class BinaryNode {


	
	public Object data; 
	public BinaryNode left; 
	public BinaryNode right; 
	
	
	public BinaryNode(Object data)
	{
		this.data = data; 
		left = null; 
		right = null; 
	}

	public BinaryNode()
	{
		left = null; 
		right = null; 
		data = null;
	}


	public void setLeft(BinaryNode left)
	{
		this.left = left;
	}
	public void setRight(BinaryNode right)
	{
		this.right = right;
	}
	public BinaryNode getRight()
	{
		return right;
	}
	public BinaryNode getLeft()
	{
		return left; 
	}
	
	
	
}
