/*
	Programmer: Josh Long
	Assignment: 12 Polymorphism & Object Type Casting
	Date: 10/16/15
 */

package asgn12;

public class Manager extends Employee
{
	private float pctBonus;
	private int travelExpense;
	
	public Manager (String n, int s, float b, int t)
	{
		super(n,s);
		pctBonus = b;
		travelExpense = t;
	}
	
	public float getPctBonus()
	{
		return pctBonus;
	}
	public int getTravelExpense()
	{
		return travelExpense;
	}
	
	public float computeBonus()
	{
		float bonus = super.getSalary() * pctBonus + 500;
		return bonus;
	}
}
