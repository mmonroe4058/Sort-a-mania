/*
 * Miriam Monroe and Ramisha Sarwar
 * Sort-a-Mania
 * Ramisha is editing these files
 */

public class Team15SortCompetition {
	//utilities myUtil = new utilities();
	public static void main (String[] args)
	{

	}
	public static double challengeOne(int[] list)
	{
		utilities.bubbleSort(list);
		
		double median = 0;
		
		if(list.length % 2 == 0)
		{
			int x = list.length - 2;
			int y = x/2;
			int i =  y + 1;
			double e = list[y];
			double f = list[i];
			
			median = (e + f)/2;
		}
		
		if(list.length % 2 == 1)
		{
			int x = list.length - 1;
			int y = x/2;
			median = list[y];
		}
		return median;
	}
	
	public static int challengeTwo(String[] arr, String str)
	{
		String[] things = mergeSort(arr);
		
		
	}
	public static int challengeThree(int[] list)
	{
		int median = 0;
		
		return median;
	}
}
