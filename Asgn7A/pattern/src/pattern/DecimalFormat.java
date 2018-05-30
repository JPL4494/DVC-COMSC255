/*
	Programmer: Josh Long
	Assignment: 7A Configuring Output Decimal Places
	Date: 10/10/15
 */

package pattern;

import javax.swing.*;
import java.text.*;
import java.util.*;

public class DecimalFormat 
{

	public static void main(String[] args) 
	{
		String in, out;
		
		int count = 0;
    	int length = 0;
    	String delim = ", ";
		String token = "";
		
		in = JOptionPane.showInputDialog ("Enter Data <separated by commas/spaces>:");
		
		StringTokenizer st = new StringTokenizer (in, delim);
		count = st.countTokens();
		
		double [] data = new double [count];
		
		for(int i = 0; i < count; i++)
		{
			token = st.nextToken();
			token = token.trim();
			data[i] = Double.parseDouble(token);
		}
		
		out = "";
		out = "Original Data:\n";
		for(int i = 0; i < count; i++)
		{
			out = out + data[i] + " ";
		}
		
		JOptionPane.showMessageDialog(null, out);
		
		in = JOptionPane.showInputDialog ("Enter the Number of Decimal Places to which the Computed Values are displayed:"); 
		length = Integer.parseInt(in);
		
		String pattern = "0.";
		for(int i = 0; i < length; i++)
			pattern = pattern + "0";
		
		DecimalFormat df = new DecimalFormat();
		df.applyPattern(pattern);
		
		out = length + " decimal places: ";
		for(int i = 0; i < count; i++)
		{
			out = out + df.format(data[i]) + " ";
		}
	}

}
