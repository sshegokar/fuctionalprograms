package com.bridgelabz.util;

public class LeapY {
	public  boolean leapYearCheaker(int year)
	{
		if(year>1000)
		{
		   if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
		   {
		       return true;
		   }
		}
return false;

}
}
