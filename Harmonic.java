package com.bridgelabz.util;


public class Harmonic {
 public   double harmoni(double n)
	{
		// COMPUTE 1/1 + 1/2 + 1/3 + ... + 1/n
        double val = 0.0;

		for (int i = 1; i <= n; i++) 
		{
		//SUM += 1.0 / i;
		val = val + (1.0/i);
		}
return val;
	

	}
}