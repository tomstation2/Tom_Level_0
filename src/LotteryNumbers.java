import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers{
	public static void main(String[] args) {
		String x= "Ur lucky #'s r...";
		for (int i = 0; i < 5; i++) {
		int r=new Random().nextInt(50)+1; 
		x=x+r+" ";
		}
		JOptionPane.showMessageDialog(null, x);
	}
}

/*******************************************************************************
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 *    Lottery numbers
 *    Duration=.5
 *    Platform=Eclipse
 *    Type=Teacher instructions
 *    Objectives=random
 *    Optional=Yes
 *    
 ******************************************************************************/

/**
 No recipe	
 Show 5 random numbers between 1 and 50 using JOptionPane		
*/															
