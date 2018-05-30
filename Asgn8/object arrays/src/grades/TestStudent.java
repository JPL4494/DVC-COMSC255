/*
	Programmer: Josh Long
	Assignment: 8 Student - Object Arrays
	Date: 9/11/15
 */

package grades;

import javax.swing.*;
import java.util.*;

public class TestStudent 
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
		
		Student[] s = new Student[num];
		
		for(int i = 0; i < num; i++)
		{
			in = JOptionPane.showInputDialog ("Enter Student Information:");
			StringTokenizer st = new StringTokenizer (in, delim);
			count = st.countTokens();
			
			String[] info = new String[count];
			int[] g = new int[count - 4];
			int gCount = 0;
			for(int j = 0; j < count; j++)
			{
				token = st.nextToken();
				token = token.trim();
				info[j] = token;
				if(j > 3)
				{
					g[gCount] = Integer.parseInt(info[j]);
					gCount++;
				}
			}
			s[i] = new Student(info[0], (info[1] + " " + info[2]), g);
		}
		
		Vector<Student> a = new Vector<Student>();
		Vector<Student> b = new Vector<Student>();
		Vector<Student> c = new Vector<Student>();
		Vector<Student> d = new Vector<Student>();
		Vector<Student> f = new Vector<Student>();
		
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
			else
				f.addElement(s[i]);
			
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
		
		JOptionPane.showMessageDialog(null, out);
		
		System.exit (0);
	}

}
