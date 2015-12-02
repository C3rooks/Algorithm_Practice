 

import java.util.*; 

public class Stack {

	int stackSize; 
	int [] array;
	int capacity;
	int top; 

	public Stack(int size)
	{   capacity  = size;
		stackSize = 0; 
		array = new int[size];
		Arrays.fill(array, -1); 
		top = -1; 

	}
	
	public void getMax()
	{
		int size = stackSize -1; 
		int previous = -1;
		int next = -1; 
		int max = getMaxRecursive(size, previous, next); 
		System.out.println("The max value = " + max);
	}
	
	public int getMaxRecursive(int size, int previous, int next)
	{
		if(previous == -1){
			previous = array[size]; 
		}
		if(next == -1)
		{
			next = previous; 
		}else{
			next = array[size];
		}

		if(next >= previous)
		{
			previous = next; 
		}
		if(size == 0) return previous; 
		
		return getMaxRecursive(size -1, previous, next); 
	}
	public void getMin()
	{
		int size = stackSize -1; 
		int previous = -1;
		int next = -1; 
		int lowest = getMinRecusive(size, previous, next); 
		System.out.println("The lowest value = " + lowest);
	}
	
	// did not use pop didnt want to pop from stack
	public int getMinRecusive(int size, int previous, int next)
	{
		if(previous == -1){
			previous = array[size]; 
		}
		if(next == -1)
		{
			next = previous; 
		}else{
			next = array[size];
		}

		if(next <= previous)
		{
			previous = next; 
		}
		if(size == 0) return previous; 
		
		return getMinRecusive(size -1, previous, next); 
	}
	public void push(int data)
	{
		if(!isEmpty()) {System.out.println("Overflow! stack is full!"); return;}
		top++;

		System.out.println("Inserting " + data + " into stack location [" + top +"]");
		array[top] = data; 

		stackSize++; 
	}

	public boolean isEmpty()
	{

		if(stackSize == capacity)return false;

		return true;
	}
	public int pop()
	{
		if(array[0] == -1){
		 System.out.println("Stack is empty");
			return 0; 
		}
		System.out.println("Removing item " + array[top] + " from the stack");
		int val = array[top];
		array[top] = -1; 
		top--;
		stackSize--; 
		return val; 
	}
	public int getSize()
	{
		return stackSize; 
	}

}