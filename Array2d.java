package com.bridgelabz.util;
/*****************************************************************************
 *  Purpose: A library for reading in 2D arrays of integers, doubles, or booleans from standard input and printing them out to standard output.
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   26-02-2019
 *****************************************************************************/
import com.bridgelabz.util.Array2;
import com.bridgelabz.util.Utility;


public class Array2d {

	public static void main(String[] args) {
		          //INPUT TAKE FORM USER
					Utility u=new Utility();      
					System.out.println("Enter number of rows: ");
					int m = u.inputInteger();
					
					System.out.println("Enter number of columns: ");
					int n = u.inputInteger(); 
					
					        
					//CALLING METHODS
					int [][] a  =Array2.arrayInt(m,n);
					double [][] b  =Array2.arrayDouble(m,n);
					String [][] c  =Array2.arrayBoolean(m,n);
					        
					//DISPLAY
					Array2.display(a,b,c,m,n);
					        
	}

				

		


	}


