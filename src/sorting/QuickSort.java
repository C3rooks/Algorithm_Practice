
public class QuickSort {

	int [] list; 
	
	public QuickSort(int[] list)
	{
		
		this.list = list; 
		sort(list, list.length, 0);
	}
	
	public void sort(int [] list, int high, int low)
	{
		int i = low; 
		int j = high; 
		int pivot = (high + low) / 2; 
		
		while(i < j)
		{
			if(list[i] > list[j]){
				i++; 
			}
			if(list[j] < list[i]){
				j--;
			}
			
			if(i < j)
			{
				// swap
				int temp = list[i];
				list[i] = list[j];
				list[j] = temp; 
				i++;
				j--;
			}
			
		}
		
		
	
	}
	
}
