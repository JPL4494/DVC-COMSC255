/*
	Programmer: Josh Long
	Assignment: 11B Inheritance & Polymorphism - Sibling
	Date: 10/16/15
 */

package asgn11B;

import javax.swing.*;

public class Rectangle implements Status
{

	//instance variables
    private double length;
    private double width;

    //Constructor
    public Rectangle (double l, double w)
    {
       //initialize instance variables above using the parameters received
       //in the constructor
       length = l;
       width = w;
    }

    //instance methods
    public double getLength ()
    {
       return length;
    }
    public double getWidth ()
    {
       return width;
    }

    public double compArea ()
    {
       return width * length;
    }

    public double compPerimeter ()
    {
       return (2 * width) + (2 * length);
    }
    
    public String getStatus()
	{
		String ret;
		ret = "Rectangle\nWidth: " + width + "\nLength: " + length + "\n";
		return ret;
	}
    public void displayStatus() 
	{
		  String out;
		  out = getStatus();
		  JOptionPane.showMessageDialog(null, out);
	}
   
}
