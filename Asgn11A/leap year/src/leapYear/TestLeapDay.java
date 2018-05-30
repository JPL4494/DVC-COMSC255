/*
	Programmer: Josh Long
	Assignment: 11A Inheritance & Accessibility - LeapDay
	Date: 10/30/15
 */

package leapYear;

import javax.swing.*;
import java.util.*;

public class TestLeapDay 
{
	public static void main(String[] args) 
	{
		String in, out;
		String delim = "/";
		String token = "";
		
		in = JOptionPane.showInputDialog ("Enter the Month/Day");
		StringTokenizer st = new StringTokenizer (in, delim);
		String[] info = new String[2];
		for(int i = 0; i < 2; i++)
		{
			token = st.nextToken();
			token = token.trim();
			info[i] = token;
		}
		int a = (Integer.parseInt(info[0]));
		int b = (Integer.parseInt(info[1]));
		Day d = new Day(a, b);
		out = "";
		out = out + "Day number for " + a + "/" + b + " is " + d.findDayNum() + "\n";
		
		JOptionPane.showMessageDialog (null, out);
		
		in = JOptionPane.showInputDialog ("Enter the Month/Day/Year");
		StringTokenizer sta = new StringTokenizer (in, delim);
		String[] inf = new String[3];
		for(int i = 0; i < 3; i++)
		{
			token = sta.nextToken();
			token = token.trim();
			inf[i] = token;
		}
		int x = (Integer.parseInt(info[0]));
		int y = (Integer.parseInt(info[1]));
		int z = (Integer.parseInt(info[1]));
		LeapDay l = new LeapDay(x, y, z);
		
		out = "";
		out = out + "Day number for " + x + "/" + y + "/" + z + " is " + l.findDayNum() + "\n";
		JOptionPane.showMessageDialog (null, out);
	}
}
