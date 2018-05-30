/*
	Programmer: Josh Long
	Assignment: 2 Rectangle class
	Date: 8/21/15
 */

package rectangle;

import javax.swing.*;

public class Rectangle 
{
	static double area(double l, double w)
	{
		return l * w;
	}
	
	static double perimeter(double l, double w)
	{
		return 2*l + 2*w;
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		double length, width;
		
		String message;

		message = "Hello, enter 2 numbers to find their area and perimeter as a rectangle";

		JOptionPane.showMessageDialog(null, message);

		String in, out;
		in = JOptionPane.showInputDialog ("Enter the length");
		length = Double.parseDouble (in);

		in = JOptionPane.showInputDialog("Enter the width");
		width = Double.parseDouble (in);
		
		out = "Length: " + length + "\n";
		out = out + "Width: " + width + "\n";
		out = out + "Area: " + area(length, width) + "\n";
		out = out + "Perimeter: " + perimeter(length, width) + "\n";
		
		JOptionPane.showMessageDialog(null, out);

		System.exit (0);
	}

}
