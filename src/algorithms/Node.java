package algorithms;

public class Node implements INode {

	
	public Node next; 
	public Object data;
	public Node tail; 
	

	public Node(Object data)
	{
		this.data = data;
		next = null; 
		tail = null;
	}
	public Node()
	{
		next = null;
		data = null;
	}
	public void setTail(Node tail)
	{
		this.tail = tail; 
	}
	public Node getTail()
	{
		return tail; 
	}
	public void setNext(Node n)
	{
		this.next = n; 
	}
	public Node getNext()
	{
		return next;
	}
	public Object getData()
	{
		return data;
	}
	public void setData(Object data)
	{
		this.data = data; 
	}
	
}
	
