/*
	Programmer: Josh Long
	Assignment: 12 Polymorphism & Object Type Casting
	Date: 10/16/15
 */

package asgn12;

public class Employee
{
	private String name;
	private int salary;
	
	public Employee(String n, int s)
	{
		name = n;
		salary = s;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getSalary()
	{
		return salary;
	}
	
	public float computeBonus()
	{
		return 0;
	}
}
