/*
	Programmer: Josh Long
	Assignment: 4 Multiple objects and comparing them
	Date: 8/28/15
 */

package multipleObjects;

public class Sibling 
{
	private String name;
	private int age;
    private double weight;
    
    public Sibling(String s, int a, double w)
    {
    	name = s;
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
    
    public double getWeight()
    {
    	return weight;
    }
}
