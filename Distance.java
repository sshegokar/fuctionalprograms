package com.bridgelabz.util;
/*****************************************************************************
 *  Purpose:Calculate Euclidean distance from the point (x, y) to the origin (0, 0)
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   27-02-2019
 *****************************************************************************/
import com.bridgelabz.util.Utility;
public class Distance {

	public static void main(String[] args) {
		 Utility a=new Utility();
		 //INPUT FORM USER
		 System.out.println("Enter the x coordinator");
		 int x=a.inputInteger();
		 System.out.println("Enter the Y coordinator");
		 int y=a.inputInteger();
		 //COMPUTE DISTANCE (0, 0)
	     double dist = Math.sqrt(x*x + y*y);
	 
	    // OUTPUT
System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + dist);
		 
		

	}

}
