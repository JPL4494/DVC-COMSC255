/*
	Programmer: Josh Long
	Assignment: 4 Multiple objects and comparing them
	Date: 8/28/15
 */

package multipleObjects;

import javax.swing.*;

public class TestSibling 
{
	public static void main (String [] args)
    {
    	String n;
    	int a;
    	double w;
		
		String in, out;
		in = JOptionPane.showInputDialog ("Enter name");
		n = in;

		in = JOptionPane.showInputDialog("Enter age");
		a = Integer.parseInt(in);
		
		in = JOptionPane.showInputDialog ("Enter weight");
		w = Double.parseDouble (in);
    	
        Sibling s1 = new Sibling (n, a, w);
        
        in = JOptionPane.showInputDialog ("Enter name");
		n = in;

		in = JOptionPane.showInputDialog("Enter age");
		a = Integer.parseInt(in);
		
		in = JOptionPane.showInputDialog ("Enter weight");
		w = Double.parseDouble (in);
    	
        Sibling s2 = new Sibling (n, a, w);
        
        in = JOptionPane.showInputDialog ("Enter name");
		n = in;

		in = JOptionPane.showInputDialog("Enter age");
		a = Integer.parseInt(in);
		
		in = JOptionPane.showInputDialog ("Enter weight");
		w = Double.parseDouble (in);
    	
        Sibling s3 = new Sibling (n, a, w);
        
        out = "Lightest sibling: ";
        
        if(s1.getWeight() < s2.getWeight())
        {
        	if(s1.getWeight() < s3.getWeight())
        	{
        		out = out + s1.getName() + " " + s1.getAge() + " " + s1.getWeight() + "\n\n";
        	}
        }
        else if(s2.getWeight() < s3.getWeight())
        {
        	out = out + s2.getName() + " " + s2.getAge() + " " + s2.getWeight() + "\n\n";
        }
        else
        {
        	out = out + s3.getName() + " " + s3.getAge() + " " + s3.getWeight() + "\n\n";
        }
        
        out = out + "Youngest Sibling: ";
        if(s1.getAge() < s2.getAge())
        {
        	if(s1.getAge() < s3.getAge())
        	{
        		out = out + s1.getName() + " " + s1.getAge() + " " + s1.getWeight() + "\n\n";
        	}
        }
        else if(s2.getAge() < s3.getAge())
        {
        	out = out + s2.getName() + " " + s2.getAge() + " " + s2.getWeight() + "\n\n";
        }
        else
        {
        	out = out + s3.getName() + " " + s3.getAge() + " " + s3.getWeight() + "\n\n";
        }
        
        JOptionPane.showMessageDialog(null, out);

		System.exit (0);
    }
}
