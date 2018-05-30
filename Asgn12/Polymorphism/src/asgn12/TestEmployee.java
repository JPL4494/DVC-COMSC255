/*
	Programmer: Josh Long
	Assignment: 12 Polymorphism & Object Type Casting
	Date: 10/16/15
 */

package asgn12;

import javax.swing.*;
import java.util.*;
import java.text.*;

public class TestEmployee 
{
	public static void main(String[] args) 
	{
		String in, out;
		int nw, nm, ne, n;
		
		String delim = ", ";
		String token = "";
		
		DecimalFormat df = new DecimalFormat ();
		df.applyPattern (".00");
		
		in = JOptionPane.showInputDialog ("Enter number of workers:");
		nw = Integer.parseInt(in);
		in = JOptionPane.showInputDialog ("Enter number of managers:");
		nm = Integer.parseInt(in);
		in = JOptionPane.showInputDialog ("Enter number of executives:");
		ne = Integer.parseInt(in);
		
		n = nw + nm + ne;
		
		Vector<Employee> e = new Vector<Employee>();
		
		Worker[] w = new Worker[nw];
		for(int i = 0; i < nw; i ++)
		{
			in = JOptionPane.showInputDialog ("Enter worker name, salary, percent bonus:");
			StringTokenizer st = new StringTokenizer (in, delim);
			int count = st.countTokens();
			String[] info = new String[count];
			
			for(int j = 0; j < count; j++)
			{
				token = st.nextToken();
				token = token.trim();
				info[j] = token;
			}
			w[i] = new Worker((info[0] + " " + info[1]), Integer.parseInt(info[2]), Float.parseFloat(info[3]));
			e.add(w[i]);
		}
		
		Manager[] m = new Manager[nm];
		for(int i = 0; i < nm; i ++)
		{
			in = JOptionPane.showInputDialog ("Enter manager name, salary, percent bonus, travel expense:");
			StringTokenizer st = new StringTokenizer (in, delim);
			int count = st.countTokens();
			String[] info = new String[count];
			
			for(int j = 0; j < count; j++)
			{
				token = st.nextToken();
				token = token.trim();
				info[j] = token;
			}
			m[i] = new Manager((info[0] + " " + info[1]), Integer.parseInt(info[2]), Float.parseFloat(info[3]), Integer.parseInt(info[4]));
			e.add(m[i]);
		}
		
		Executive[] ex = new Executive[ne];
		for(int i = 0; i < ne; i ++)
		{
			in = JOptionPane.showInputDialog ("Enter executive name, salary, percent bonus, travel expense, stock options:");
			StringTokenizer st = new StringTokenizer (in, delim);
			int count = st.countTokens();
			String[] info = new String[count];
			
			for(int j = 0; j < count; j++)
			{
				token = st.nextToken();
				token = token.trim();
				info[j] = token;
			}
			ex[i] = new Executive((info[0] + " " + info[1]), Integer.parseInt(info[2]), Float.parseFloat(info[3]), Integer.parseInt(info[4]), Integer.parseInt(info[5]));
			e.add(ex[i]);
		}
		
		out = "";
		out = out + "Total Bonus: ";
		float tB = 0;
		for(int i = 0; i < n; i++)
		{
			tB = tB + e.get(i).computeBonus();
		}
		out = out + tB + "\n";
		
		String name;
		double salary, pctBonus, bonus, travelExpense;
		int optionsCount;
		 
		for (int i=0; i < n; i++)
		{
			//get name and salary
			//To access target object methods that are defined in class Employee, we don’t need type casting.
			name = e.get(i).getName();
			salary = e.get(i).getSalary();
		 
			//call computeBonus using polymorphic call
			//Since computeBonus is declared in Employee class, we don’t need type casting.
			bonus = e.get(i).computeBonus();
		 
			//To access target object methods that are not defined in class Employee, we use down casting.
			//Downcasting (Widening) should be done within an if statement using instanceof
			//Since getPctBonus method is not present in class Employee, it is accessed via down casting.
			//Similarly getTravelExpense, and getOptionsCount are accessed via downcasting.
			//The instanceof clause is used below to ensure a safe down casting (widening).
			if (e.get(i) instanceof Worker)
			{
				pctBonus = ( (Worker) e.get(i) ).getPctBonus ( );
				out = out + "Name: " + name + "\n";
				out = out + "Salary: " + df.format(salary) + "\n";
				out = out + "Percent Bonus: " + df.format(pctBonus) + "\n";
				out = out + "Total Bonus: " + df.format(bonus) + "\n\n";
			}
			else if (e.get(i) instanceof Manager) 
			{
				pctBonus = ( (Manager) e.get(i) ).getPctBonus ( );
				travelExpense = ( (Manager) e.get(i) ).getTravelExpense ( );
				out = out + "Name: " + name + "\n";
				out = out + "Salary: " + df.format(salary) + "\n";
				out = out + "Percent Bonus: " + df.format(pctBonus) + "\n";
				out = out + "Total Bonus: " + df.format(bonus) + "\n";
				out = out + "Travel Expense: " + df.format(travelExpense) + "\n\n";
		     }
			
			else if (e.get(i) instanceof Executive) 
			{
				pctBonus = ( (Executive) e.get(i) ).getPctBonus ( );
				travelExpense = ( (Executive) e.get(i) ).getTravelExpense ( );
				optionsCount = ( (Executive) e.get(i) ).getOptionsCount ( );

				out = out + "Name:" + name + "\n";
				out = out + "Salary: " + df.format(salary) + "\n";
				out = out + "Percent Bonus: " + df.format(pctBonus) + "\n";
				out = out + "Total Bonus: " + df.format(bonus) + "\n";
				out = out + "Travel Expense: " + df.format(travelExpense) + "\n";
				out = out + "Options Count: " + df.format(optionsCount) + "\n\n";
			}
		}
		JOptionPane.showMessageDialog(null, out);
	}
}
