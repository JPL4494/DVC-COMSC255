/*
	Programmer: Josh Long
	Assignment: 11B Inheritance & Polymorphism - Sibling
	Date: 10/16/15
 */

package asgn11B;

import javax.swing.*;

public class Sibling implements Status
{
	private String name;
	private int age;
	private int weight;
	
	public Sibling(String n, int a, int w)
	{
		name = n;
		age = a;
		weight = w;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public int getWeight()
	{
		return weight;
	}
	
	public String getStatus()
	{
		String ret;
		ret = "Sibling\nName: " + name + "\nAge: " + age + "\nWeight: " + weight + "\n";
		return ret;
	}
	public void displayStatus() 
	{
		  String out;
		  out = getStatus();
		  JOptionPane.showMessageDialog(null, out);
	}
}
