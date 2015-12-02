
import java.util.Arrays;


public class Queue extends Node{
	public enum QueueType{ARRAY(0), CIRCULAR(1), LINKED(2), PRIORTY(3);
	private int value;

    private QueueType(int value) {
            this.value = value;
    }
	
	}
	int buffer; 
	int[] queue; 
	int type; 
	int location;
	int remover; 
	public Queue(int size, int type)
	{
		location = size - 1;
		remover = 0; 
		buffer = size;
		this.type = type;
		switch(type){
		case 0 : arrayQueue();
		case 1 : circularQueue(); 
		case 2 : linkedQueue(); 
		case 3 : priortyQueue();
		default : break; 
		}
	
	
	}
	public int deQueue()
	{
		int ret = 0; 
		switch(type){
		case 0 : arrayEnQueue();
		case 1 : ret = circularDequeue(); 
		case 2 : linkedEnQueue(); 
		case 3 : priorityEnQueue();
		default : break; 
		}
		return ret; 
	}
	
	public void enQueue(int data)
	{
		switch(type){
		case 0 : arrayEnQueue();
		case 1 : circularEnQueue(data); 
		case 2 : linkedEnQueue(); 
		case 3 : priorityEnQueue();
		default : break; 
		}
	}
	
	
	//fifo or Lilo e.g 12345 all inserted returns 1 first 
	public int circularDequeue()
	{
		int deq = queue[remover];
		queue[remover] = -1; 
		remover++; 
		return deq; 
		
	}
	
	public void circularEnQueue(int data)
	{
			if(location == -1) location = buffer -1; 
			queue[location] = data; 
			location--; 
		
			
	}
	
	public void arrayEnQueue()
	{
	}
	public void linkedEnQueue()
	{
	}
	public void priorityEnQueue()
	{
	}
	
	
	
	
	
	
	public void priortyQueue()
	{
		
	}
	
	public void linkedQueue()
	{
		
	}
	
	// this will not overwrite
	public void arrayQueue()
	{
		queue = new int[buffer];
	}
	
	// this will overwrite any inside. 
	public void circularQueue()
	{
		queue = new int[buffer];
		Arrays.fill(queue, -1);
	}
	
	
	
	
	
}
