package com.bridgelabz.util;
/*****************************************************************************
 *  Purpose:All permutation of a String using iterative method and Recursion method. Check if the arrays returned by two string functions are equal. 
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   26-02-2019
 *****************************************************************************/
import java.util.ArrayList;
import java.util.List;

class Permutation {
   public static void permutations(String s)
	{
		// CREATE AN EMPTY ArrayList TO STORE (partial) permutation
		List<String> partial = new ArrayList<>();

		// INTIALIZE THE LIST WITH FIRST CHARCTER OF THE STRING
		partial.add(String.valueOf(s.charAt(0)));

		// FOR EVERY CHARECTER DEFINE IN STRING
		for (int i = 1; i < s.length(); i++)
		{
			// CONSIDER PREVIOUSLY PARTIAL PERMUTATION

			// (iterate backwards to avoid ConcurrentModificationException)
			for (int j = partial.size() - 1; j >= 0 ; j--)
			{
				// REMOVE CURRENT PARTIAL PERMUTATION ArrayList
				String str = partial.remove(j);

				// INSERT NEXT CHARCTER OF THE SPECIFIED STRING IN ALL
				// POSSIBLE POSITION OF CURRENT PARTIAL PERMUTATION. THEN INSERT EACH OF  THESE NEWLY CINSTRUCTED STRING  IN THE LIST

				for (int k = 0; k <= str.length(); k++)
				{
					partial.add(str.substring(0, k) + s.charAt(i) +
								str.substring(k));
				}
			}
		}

		System.out.println(partial);
	}

	
	public static void main(String[] args)
	{
		String s = "ABC";
		permutations(s);
	}
}