 /* Miriam Monroe and Ramisha Sarwar
 * Sort-a-Mania 
 * Miriam is editing these files
 */
package sortamania;
import sortamania.Utilities;

public class Team15SortCompetition {
	public static void main (String[] args)
	{
		String[] list = {"Apple", "Zebra", "Grape", "Quart", "Phone"};
		System.out.println(challengeTwo(list, "Grape"));
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
	
	public static int challengeFour()
}
