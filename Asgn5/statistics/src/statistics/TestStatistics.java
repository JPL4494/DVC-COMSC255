/*
	Programmer: Josh Long
	Assignment: 5 Statistics - Primitive Array
	Date: 8/28/15
 */

package statistics;

import javax.swing.*;

public class TestStatistics 
{
	public static void main (String [] args)
    {
    	int length;
		
		String in, out;
		
		in = JOptionPane.showInputDialog ("Enter the Number of Data Values");
		length = Integer.parseInt(in);
		
		double[] data = new double[length];
		
		for(int i = 0; i < length; i++)
		{
			in = JOptionPane.showInputDialog ("Enter data value");
			data[i] = Double.parseDouble (in);
		}
    	
		Statistics s = new Statistics (data);
		
		out = "Original Data: \n";
		double[] o = s.getOrigData();
		for(int i = 0; i < length; i++)
			out = out + o[i] + " ";
		
		out = out + "\n";
		
		out = out + "Sorted Data: \n";
		double[] sort = s.getSortedData();
		for(int i = 0; i < length; i++)
			out = out + sort[i] + " ";
		
		out = out + "\n";
		
		out = out + "Minimum Value: " + s.findMin() + "\n";
		out = out + "Maximum Value: " + s.findMax() + "\n";
		out = out + "Mean: " + s.findMean() + "\n";
		out = out + "Median: " + s.findMedian() + "\n";
		
        
        JOptionPane.showMessageDialog(null, out);

		System.exit (0);
    }
}
