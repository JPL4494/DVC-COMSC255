/*
	Programmer: Josh Long
	Assignment: 9 Sibling - Inheritance
	Date: 10/2/15
 */

package inheritance;

import javax.swing.*;
import java.util.*;

public class TestSiblingExt 
{
	public static void main(String[] args) 
	{
		String in, out;
		int num = 0;
		String delim = " ";
		String token = "";
		int count = 0;
		
		in = JOptionPane.showInputDialog ("Enter Sbiling Count:");
		num = Integer.parseInt(in);
		
		SiblingExt[] s = new SiblingExt[num];
		
		for(int i = 0; i < num; i++)
		{
			in = JOptionPane.showInputDialog ("Enter the siblings name age weight and height");

			StringTokenizer st = new StringTokenizer (in, delim);
			count = st.countTokens();
			String[] info = new String[count];
			
			for(int j = 0; j < count; j++)
			{
				token = st.nextToken();
				token = token.trim();
				info[j] = token;
			}
			s[i] = new SiblingExt(info[0], Integer.parseInt(info[1]), Integer.parseInt(info[2]), Integer.parseInt(info[3]));
		}
		
		out = "The Lightest Sibling: ";
		int key = 0;
		for(int i = 0; i < num; i++)
		{
			if(s[key].getWeight() > s[i].getWeight())
				key = i;
		}
		out = out + s[key].getName() + " " + s[key].getAge() + " " + s[key].getWeight() + " " + s[key].getHeight() + "\n";
		
		out = out + "The Youngest Sibling: ";
		key = 0;
		for(int i = 0; i < num; i++)
		{
			if(s[key].getAge() > s[i].getAge())
				key = i;
		}
		out = out + s[key].getName() + " " + s[key].getAge() + " " + s[key].getWeight() + " " + s[key].getHeight() + "\n";
		
		out = out + "The Tallest Sibling: ";
		key = 0;
		for(int i = 0; i < num; i++)
		{
			if(s[key].getHeight() < s[i].getHeight())
				key = i;
		}
		out = out + s[key].getName() + " " + s[key].getAge() + " " + s[key].getWeight() + " " + s[key].getHeight() + "\n";
		
		
		JOptionPane.showMessageDialog(null, out);
	}

}
