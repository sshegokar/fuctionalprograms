package com.bridgelabz.util;
/*****************************************************************************
 *  Purpose: Leap Year or Not
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   26-02-2019
 *****************************************************************************/

public class LeapYear {

	public static void main(String[] args) {
		Utility u=new Utility();
		System.out.println("Enter a leap year:");
		int year=u.inputInteger();
		LeapY a =new LeapY();
		boolean result = a.leapYearCheaker(year);
	 
		if(result)
		{
			System.out.println("Year:"+ year + " is a leap year");
		}
		else
		{
			System.out.println("Year:"+ year + " is not a leap year");
		}
}

	}


