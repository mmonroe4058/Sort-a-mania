
public class utilities {
	public static void bubbleSort(int[] list1)
	{
		for(int i = 0; i < list1.length-1; i++)
		{
			for(int j = 0; j < list1.length-i-1; j++)
			{
				if(list1[j+1] < list1[j])
				{
					swap(list1, j, j+1);
				}
			}
		}
	}
	public static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
}
