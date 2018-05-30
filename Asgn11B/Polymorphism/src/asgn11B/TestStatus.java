/*
	Programmer: Josh Long
	Assignment: 11B Inheritance & Polymorphism - Sibling
	Date: 10/16/15
 */

package asgn11B;

import javax.swing.*;
import java.util.*;

public class TestStatus {

	public static void main(String[] args) 
	{
		String in, out;
		String delim = ", ";
		String token = "";
		int count = 0;
		
		Status [] status = new Status[6];
		Rectangle [] r = new Rectangle[3];
		Sibling [] s = new Sibling[2];
		
		for(int i = 0; i < 3; i++)
		{
			double l, w;
			
			in = JOptionPane.showInputDialog ("Enter the length of the rectange");
			l = Double.parseDouble (in);

			in = JOptionPane.showInputDialog("Enter the width of the rectange");
			w = Double.parseDouble (in);
			
			r[i] = new Rectangle(l,w);
		}
		
		for(int i = 0; i < 2; i++)
		{
			in = JOptionPane.showInputDialog ("Enter the siblings name age, weight, height");

			StringTokenizer st = new StringTokenizer (in, delim);
			count = st.countTokens();
			String[] info = new String[count];
			
			for(int j = 0; j < count; j++)
			{
				token = st.nextToken();
				token = token.trim();
				info[j] = token;
			}
			s[i] = new Sibling(info[0], Integer.parseInt(info[1]), Integer.parseInt(info[2]));
		}
		
		in = JOptionPane.showInputDialog ("Enter Student Information seperated by commas:");
		StringTokenizer st = new StringTokenizer (in, delim);
		count = st.countTokens();
		
		String[] info = new String[count];

		for(int j = 0; j < count; j++)
		{
			token = st.nextToken();
			token = token.trim();
			info[j] = token;
		}
		
		int tcount = Integer.parseInt(info[3]);

		int gCount = 0;
		int[] g = new int[tcount];
		for(int k = 0; k < tcount; k++)
		{
			g[gCount] = Integer.parseInt(info[k+4]);
			gCount++;
		}
		
		Student stu = new Student(info[0], (info[1] + " " + info[2]), g);
		
		status[0] = r[0];
		status[1] = r[1];
		status[2] = r[2];
		status[3] = s[0];
		status[4] = s[1];
		status[5] = stu;
		
		for (int i = 0; i < status.length; i++)
		{
		     status[i].displayStatus();
		}
		
		out = "";

		for (int i = 0; i < status.length; i++)
		{
		     out = out + status[i].getStatus();
		}

		JOptionPane.showMessageDialog (null, out);
	}
	
}
