/*
	Programmer: Josh Long
	Assignment: 1B Calculate average and sum of 3 numbers
	Date: 8/21/15
 */

package math;

import javax.swing.*;

public class Average
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		double n1 = 0;
		double n2 = 0;
		double n3 = 0;
		double sum = 0;
		double average;
		
		String message;

		message = "Hello, enter 3 numbers to find their sum and average";

		JOptionPane.showMessageDialog(null, message);

		String in, out;
		in = JOptionPane.showInputDialog ("Enter the first number");
		//convert the String into a double.
		n1 = Double.parseDouble (in);

		in = JOptionPane.showInputDialog("Enter the second number");
		n2 = Double.parseDouble (in);
		
		in = JOptionPane.showInputDialog("Enter the third number");
		n3 = Double.parseDouble (in);

		sum = n1 + n2 + n3;
		average = sum / 3;

		//Build the out String
		out = "";
		out = out + "The sum of " + n1 + ", " + n2 + " and " + n3 + " is " + sum + "\n";
		
		out = out + "The average of " + n1 + ", " + n2 + " and " + n3 + " is " + average + "\n";
		
		JOptionPane.showMessageDialog(null, out);

		System.exit (0);

	}

}
