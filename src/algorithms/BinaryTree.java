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

	public BinaryNode arraytoTree(int [] array)
	{
		InsertionSort sort = new InsertionSort(array); 
		array = sort.getList(); 

		int middle = array[(array.length -1)/2];
        BinaryNode root = new BinaryNode(middle); 

        int length = (array.length -1) / 2; 
        int counter = 0; 
        root = toTree(root, array, length, counter); 
        root = toTree(root, array, array.length, length+1); 


      
       return root; 
      
	}

	public BinaryNode toTree(BinaryNode root, int [] array, int length, int counter)
	{
		if(counter == length)
		{
			counter = 0; 
			return null; 
		}
		else{
			BinaryNode node = new BinaryNode(array[counter]);
			
			if(array[counter] <= (Integer)root.data){
				root.right = node; 
				counter++; 
				toTree(root.right, array, length, counter);
			}else{
				root.left = node; 
				counter++; 
				toTree(root.left, array, length, counter);
			}
			
			
			
		}

       
       return root; 

	}
	

	public void add(int data)
	{
	 BinaryNode current = 	add(root,data); 
		root = current; 
	}

	public void search(int data)
	{
		BinarySearch bs = new BinarySearch(this,data); 
		bs.search(); 
	}

	public int getMaxIT()
	{
		int max = 0; 

		BinaryNode current = root;

		if(current == null){
			throw new IllegalArgumentException("ERROR TREE IS EMPTY");
		}
		while(current.right != null)
		{
			current = current.right;

		}
		max = (Integer)current.data; 

		return max; 

	}

	public int getMax()
	{
		int current = 0; 
		return getMax(root, current);
	}
	public int getMax(BinaryNode root, int current)
	{
		
		if(root != null){
			if((Integer)root.data >= (Integer)current)
			{
				current = (Integer)root.data; 
			}
		current = getMax(root.getRight(), current);

		}

		return current; 

	}
	
	
	public void postorder()
	{
		postorder(root); 
	}
	public void postorder(BinaryNode root)
	{

		if(root == null)
		{
			return;
		}

			postorder(root.getLeft());
			postorder(root.getRight()); 
			System.out.print(root.data + " "); 
	
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
			System.out.print(root.data + " ");
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
		System.out.print(root.data + " "); 
		preorder(root.left);
		preorder(root.right);
		}
		
	}
	

	public void levelOrder()
	{
		levelOrder(root); 
    	
	}
	public void levelOrder(BinaryNode root)
	{
	if(root != null)
	{
		System.out.print(root.data + " "); 
		 if(root.left != null)
		 	levelOrder(root.left);
		 if(root.right != null)
		 	levelOrder(root.right); 
	}

	}


	public void inorderIT()
	{
		LinkedStack stack = new LinkedStack();
		BinaryNode current = root; 

		if(root == null) throw new IllegalArgumentException("Error tree is empty"); 
		if(root.left == null && root.right == null) System.out.println(root.data); 
	
	    BinaryNode l = current.left;
	    BinaryNode r = current.right; 

	    Node c = new Node(root.data);

	    // prob need 2 whiles one for left side one for right
		while(true)
		{
			
			if(l != null)
			{
				Node left = new Node((Integer)l.data); 
				stack.push((Integer)left.data); 
				l = l.left; 
			}

			else if(r != null)
			{
				Node right = new Node((Integer)r.data); 
				stack.push((Integer)right.data);
				r = r.right;
			}

			if(l == null && r == null)
			{
				break; 
			}
		}

		// test 
		System.out.println(stack.pop());




	}


	public BinaryNode add(BinaryNode current, int data)
	{
		if(current == null) {
			current = new BinaryNode(data); 
		}
		
		else{
			if(data >= (Integer)current.data)
				current.right = add(current.right, data); 
			else
				current.left = add(current.left, data); 
		}
	
		
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
