package com.bridgelabz.util;

public class primeF {
	public  boolean isPrime(int i)
	{
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
			{
	     		return false;
	    	}
	  	}
return true;

	}
}
