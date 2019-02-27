package com.bridgelabz.util;
/*****************************************************************************
 *  Purpose: Flip Coin and print percentage of Heads and Tails
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   26-02-2019
 *****************************************************************************/

import com.bridgelabz.util.Utility;
import com.bridgelabz.util.Flipc;

public class FlipCoin {

	public static void main(String[] args) {
		//TAKE INPUT FORM USER
		Utility u=new Utility();
	   	System.out.println("Enter a number: ");
		int n =u.inputInteger();
		//CREAT OBJECT OF Flipc CLASS
		Flipc ab =new Flipc();
		ab.flip(n);
		

}
}