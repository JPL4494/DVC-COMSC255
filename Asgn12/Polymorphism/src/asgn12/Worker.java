/*
	Programmer: Josh Long
	Assignment: 12 Polymorphism & Object Type Casting
	Date: 10/16/15
 */

package asgn12;

public class Worker extends Employee
{
	private float pctBonus;
	
	public Worker (String n, int s, float b)
	{
		super(n,s);
		pctBonus = b;
	}
	
	public float getPctBonus()
	{
		return pctBonus;
	}
	
	public float computeBonus()
	{
		float bonus = super.getSalary() * pctBonus;
		return bonus;
	}
}
