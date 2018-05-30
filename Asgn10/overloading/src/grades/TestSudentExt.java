/*
	Programmer: Josh Long
	Assignment: 9B StudentExt - Inheritance & Method Overloading
	Date: 10/2/15
 */

package grades;

import javax.swing.*;
import java.util.*;

public class TestSudentExt 
{
	public static void main(String[] args) 
	{
		String in, out;
		int num;
		String delim = ", ";
		String token = "";
		int count = 0;
		
		out = "";
		
		in = JOptionPane.showInputDialog ("Enter Student Count:");
		num = Integer.parseInt(in);
		
		Student[] s = new StudentExt[num];
		
		for(int i = 0; i < num; i++)
		{
			in = JOptionPane.showInputDialog ("Enter Student Information:");
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
			
			s[i] = new StudentExt(info[0], (info[1] + " " + info[2]), g, info[count - 1]);
		}
		
		Vector<Student> a = new Vector<Student>();
		Vector<Student> b = new Vector<Student>();
		Vector<Student> c = new Vector<Student>();
		Vector<Student> d = new Vector<Student>();
		Vector<Student> f = new Vector<Student>();
		Vector<Student> cr = new Vector<Student>();
		Vector<Student> ncr = new Vector<Student>();
		
		for(int i = 0; i < num; i++)
		{
			if(s[i].findGrade().equalsIgnoreCase("A"))
				a.addElement(s[i]);
			else if(s[i].findGrade().equalsIgnoreCase("B"))
				b.addElement(s[i]);
			else if(s[i].findGrade().equalsIgnoreCase("C"))
				c.addElement(s[i]);
			else if(s[i].findGrade().equalsIgnoreCase("D"))
				d.addElement(s[i]);
			else if(s[i].findGrade().equalsIgnoreCase("F"))
				f.addElement(s[i]);
			else if(s[i].findGrade().equalsIgnoreCase("CR"))
				cr.addElement(s[i]);
			else
				ncr.addElement(s[i]);
			
		}
		
		out = "";
		
		for(int i = 0; i < a.size(); i++)
		{
			out = out + a.get(i).getId() + " " + a.get(i).getName() + " " + a.get(i).findGrade() + "\n";
		}
		for(int i = 0; i < b.size(); i++)
		{
			out = out + b.get(i).getId() + " " + b.get(i).getName() + " " + b.get(i).findGrade() + "\n";
		}
		for(int i = 0; i < c.size(); i++)
		{
			out = out + c.get(i).getId() + " " + c.get(i).getName() + " " + c.get(i).findGrade() + "\n";
		}
		for(int i = 0; i < d.size(); i++)
		{
			out = out + d.get(i).getId() + " " + d.get(i).getName() + " " + d.get(i).findGrade() + "\n";
		}
		for(int i = 0; i < f.size(); i++)
		{
			out = out + f.get(i).getId() + " " + f.get(i).getName() + " " + f.get(i).findGrade() + "\n";
		}
		for(int i = 0; i < cr.size(); i++)
		{
			out = out + cr.get(i).getId() + " " + cr.get(i).getName() + " " + cr.get(i).findGrade() + "\n";
		}
		for(int i = 0; i < ncr.size(); i++)
		{
			out = out + ncr.get(i).getId() + " " + ncr.get(i).getName() + " " + ncr.get(i).findGrade() + "\n";
		}
		
		JOptionPane.showMessageDialog(null, out);
		
		System.exit (0);
	}
}
