/*
	Programmer: Josh Long
	Assignment: 7 Statistics - String Tokenizer Application
	Date: 9/11/15
 */

package statistics;

import javax.swing.*;

import java.text.*;
import java.util.*;

public class TestStatistics 
{
	public static void main (String [] args)
    {
    	int count = 0;
    	int length = 0;
    	String delim = ", ";
		String token = "";
		String in, out;
		
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
		
		Statistics s = new Statistics (data);
		
		in = JOptionPane.showInputDialog ("Enter the Number of Decimal Places to which the Computed Values are displayed:"); 
		length = Integer.parseInt(in);
		
		String pattern = "0.";
		for(int i = 0; i < length; i++)
			pattern = pattern + "0";
		
		DecimalFormat df = new DecimalFormat();
		df.applyPattern(pattern);
		
		out = "Original Data: \n";
		double[] o = s.getOrigData();
		for(int i = 0; i < count; i++)
			out = out + o[i] + " ";
		
		out = out + "\n\n";
		out = out + "Results Using Instance Methods:\n";
		
		out = out + "Sorted Data: \n";
		double[] sort = s.getSortedData();
		for(int i = 0; i < count; i++)
			out = out + sort[i] + " ";
		
		out = out + "\n\n";
		
		out = out + "Minimum Value: " + df.format(s.findMin()) + "\n";
		out = out + "Maximum Value: " + df.format(s.findMax()) + "\n";
		out = out + "Mean: " + df.format(s.findMean()) + "\n";
		out = out + "Median: " + df.format(s.findMedian()) + "\n\n\n";
		
		out = out + "Results Using Static Methods: \n";
		out = out + "Sorted Data: \n";
		double[] sortStatic = Statistics.computeSortedData(o);
		for(int i = 0; i < count; i++)
			out = out + sortStatic[i] + " ";
		
		out = out + "\n\n";
		
		out = out + "Minimum Value: " + df.format(Statistics.computeMin(o)) + "\n";
		out = out + "Maximum Value: " + df.format(Statistics.computeMax(o)) + "\n";
		out = out + "Mean: " + df.format(Statistics.computeMean(o)) + "\n";
		out = out + "Median: " + df.format(Statistics.computeMedian(o)) + "\n";
		out = out + "The Total Number of Statistics objects created during execution:\n";
		out = out + Statistics.computeCount(o);
		
		out = out + "\n\n\n";
		
		
		
        
        JOptionPane.showMessageDialog(null, out);

		System.exit (0);
    }
}
