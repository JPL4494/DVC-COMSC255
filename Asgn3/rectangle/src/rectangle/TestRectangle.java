/*
	Programmer: Josh Long
	Assignment: 3 Rectangle class with data members
	Date: 8/28/15
 */

package rectangle;

import javax.swing.*;

public class TestRectangle
{
    public static void main (String [] args)
    {
    	double l, w;
		
		String in, out;
		in = JOptionPane.showInputDialog ("Enter the length for the first object");
		l = Double.parseDouble (in);

		in = JOptionPane.showInputDialog("Enter the width for the first object");
		w = Double.parseDouble (in);
    	
        Rectangle r1 = new Rectangle (l, w);
        
        in = JOptionPane.showInputDialog ("Enter the length for the second object");
		l = Double.parseDouble (in);

		in = JOptionPane.showInputDialog("Enter the width for the second object");
		w = Double.parseDouble (in);
                         
        Rectangle r2 = new Rectangle (l, w);                
        
        out = "Values for the first object\n";
        out = out + "Length: " + r1.getLength() + "\n";
        out = out + "Width: " + r1.getWidth() + "\n";
        out = out + "Area: " + r1.compArea() + "\n";
        out = out + "Perimeter: " + r1.compPerimeter() + "\n";
        out = out + "Values for the second object\n";
        out = out + "Length: " + r2.getLength() + "\n";
        out = out + "Width: " + r2.getWidth() + "\n";
        out = out + "Area: " + r2.compArea() + "\n";
        out = out + "Perimeter: " + r2.compPerimeter() + "\n";
        
        JOptionPane.showMessageDialog(null, out);

		System.exit (0);
    }
}