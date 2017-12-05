import sortamania.Utilities;

/*
 * Miriam Monroe and Ramisha Sarwar
 * Sort-a-Mania
 * Ramisha is editing these files
 */

public class Team15SortCompetition {
	//utilities myUtil = new utilities();
	public static void main (String[] args)
	{
		/*String[] list = {"Apple", "Zebra", "Grape", "Quart", "Phone"};
		System.out.println(challengeTwo(list, "Grape"));*/
		
		int[] list = {4, 7, 8, 9, 3, 10};
		System.out.print(challengeThree(list));
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
		int index = 0;
		String[] things = Utilities.mergeSort(arr);
		index = Utilities.binarySearch(things, 0, arr.length-1, str);
		
		return index;
	}
	public static double challengeThree(int[] list)
	{
		utilities.bubbleSort(list);
		double median = utilities.median(list);
		return median;
	}
}
