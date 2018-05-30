/*
	Programmer: Josh Long
	Assignment: 6 Statistics - String Tokenize
	Date: 9/11/15
 */

package statistics;

import javax.swing.*;

import java.util.*;

public class TestStatistics 
{
	public static void main (String [] args)
    {
    	int count1 = 0;
    	int count2 = 0;
    	String delim = " ";
		String token = "";
		String in, out;
		
		in = JOptionPane.showInputDialog ("Enter a delimited text string:");
		
		StringTokenizer st = new StringTokenizer (in, delim);
		delim = ",";
        StringTokenizer qt = new StringTokenizer (in, delim);
		count1 = st.countTokens();
		count2 = qt.countTokens();
		
		String [] data1 = new String [count1];
		String [] data2 = new String [count2];
		
		for(int i = 0; i < count1; i++)
		{
			token = st.nextToken();
			token = token.trim();
			if((i+1) < count1)
				token = token + "|";
			data1[i] = token;
		}
		
        String token2 = "";
		for(int i = 0; i < count2; i++)
		{
			token2 = qt.nextToken();
			token2 = token2.trim();
			if((i+1) < count2)
				token2 = token2 + "|";
			token2 = token2 + " ";
			data2[i] = token2;
		}
		
		out = "---Tokenizer---by space---\n";
		for(int i = 0; i < count1; i++)
		{
			out = out + data1[i];
		}
        JOptionPane.showMessageDialog(null, out);
        
        out = "---Tokenizer---by comma---\n";
        for(int i = 0; i < count2; i++)
		{
			out = out + data2[i];
		}
        JOptionPane.showMessageDialog(null, out);

		System.exit (0);
    }
}
