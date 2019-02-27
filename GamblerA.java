package com.bridgelabz.util;

public class GamblerA {
	int $Stake,$Goal;
	int noOfTimes ;
	int wins=0;
	int bets=0;
	public void gam() {
	for (int i=0; i< noOfTimes; i++) 
	{
		
		int cash = $Stake;
        //COMPUTATION    
		while (cash > 0 && cash < $Goal)
		{
			
			bets++;
        
			if (Math.random() < 0.5)
				//WIN $1 ADD
				cash++;     
			else 
				//LOSE $1 SUB
				cash--;    
		}
            
			if (cash == $Goal) 
            	//TOTAL NO. WIN
            	wins++; 
           
}
	//INPUT FORM USER
	Utility u=new Utility();
	System.out.println("Enter $Stake value: ");
	int $Stake=u.inputInteger();
	
	System.out.println("Enter $Goal value: ");
	int $Goal=u.inputInteger();

	System.out.println("Enter number of times: ");
	int noOfTimes=u.inputInteger();
	

	//COMPUTATION
	System.out.println(wins + " wins of " + noOfTimes);
	System.out.println("Percent of games won = " + 100.0 * wins / noOfTimes);
 System.out.println("Avg # bets= " + 1.0 * bets / noOfTimes);
	
	
	


}
	
}
