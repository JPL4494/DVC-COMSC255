/*
	Programmer: Josh Long
	Assignment: 12 Polymorphism & Object Type Casting
	Date: 10/16/15
 */

package asgn12;

public class Executive extends Employee
{
	private float pctBonus;
	private int travelExpense;
	private int optionsCount;
	
	public Executive (String n, int s, float b, int t, int o)
	{
		super(n,s);
		pctBonus = b;
		travelExpense = t;
		optionsCount = o;
	}
	
	public float getPctBonus()
	{
		return pctBonus;
	}
	public int getTravelExpense()
	{
		return travelExpense;
	}
	public int getOptionsCount()
	{
		return optionsCount;
	}
	
	public float computeBonus()
	{
		float bonus = super.getSalary() * pctBonus + 1000;
		return bonus;
	}
}
