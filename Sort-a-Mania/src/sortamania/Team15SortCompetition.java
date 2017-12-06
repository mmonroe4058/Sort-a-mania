 /* Miriam Monroe and Ramisha Sarwar
 * Sort-a-Mania 
 * Miriam is editing these files
 */
package sortamania;
import sortamania.Utilities;

public class Team15SortCompetition {
	public static void main (String[] args)
	{
		/*
		String[] list = {"Apple", "Zebra", "Grape", "Quart", "Phone"};
		System.out.println(challengeTwo(list, "Grape"));
		*/
		
		/*
		int[] x = {111, 2, 5, 70, 8, 3,};
		int[] y = {20, 2, 56, 72, 8, 32,};
		int [] z = {101, 22, 5, 7, 8, 31,};
		int[][] stuff = {x, y, z};
		System.out.println(challengeFour(stuff));
		*/
	}
	public static double challengeOne(int[] list)
	{
		double median = 0;
		Utilities.bubbleSort(list);
		median = Utilities.median(list);
		return median;
	}
	
	public static int challengeTwo(String[] arr, String str)
	{
		int index = 0;
		String[] things = Utilities.mergeSort(arr);
		index = Utilities.binarySearch(things, 0, arr.length-1, str);
		
		return index;
	}
	
	public static double challengeFour(int[][] arr)
	{
		double[] medians = new double[arr.length];
		
		for(int i = 0; i < arr.length; i++)
		{
			Utilities.bubbleSort(arr[i]);
			medians[i] = Utilities.median(arr[i]);
		}
		
		Utilities.bubbleSortD(medians);
		return Utilities.medianD(medians);

	}
}
