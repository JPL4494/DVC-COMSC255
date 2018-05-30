/*
	Programmer: Josh Long
	Assignment: 9 Sibling - Inheritance
	Date: 10/2/15
 */

package inheritance;

public class Sibling 
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
}
