package com.bridgelabz.util;
/*****************************************************************************
 *  Purpose:  Computes the prime factorization of N using brute force 
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   26-02-2019
 *****************************************************************************/
import com.bridgelabz.util.Utility;

public class primeFact {

	public static void main(String[] args) {
		
		//CREATE AN OBJECT
		primeF ab=new primeF();
		
		//TAKE INPUT FORM USER
		Utility u=new Utility();
		System.out.println("Enter the no. to find PrimeFactors:");
		int n=u.inputInteger();
		
		System.out.println("The prime factors for the "+n+" is:");
		
	  for(int i=2;i<=n;i++)
		{  
			if(ab.isPrime(i))
			{
				System.out.print(i+" ");
			}
		}
       
}
		
	}

