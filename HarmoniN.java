package com.bridgelabz.util;
/*****************************************************************************
 *  Purpose: Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N 
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   26-02-2019
 *****************************************************************************/



import com.bridgelabz.util.Utility;

public class HarmoniN {

	public static void main(String[] args) {
		
		Utility u=new Utility();
	   	System.out.println("Enter a number: ");
		double n =u.inputDouble();
		Harmonic a=new Harmonic ();
    	double result=a.harmoni(n);
		
		if(n>0)
	 	{
			System.out.println("The Harmonic Value for the number is: "+result);
	 	}
		else
		{
			System.out.println("The number should be greater than zero");
		}
}

	
	

	}


