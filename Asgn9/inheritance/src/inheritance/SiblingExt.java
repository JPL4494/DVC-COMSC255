/*
	Programmer: Josh Long
	Assignment: 9 Sibling - Inheritance
	Date: 10/2/15
 */

package inheritance;

public class SiblingExt extends Sibling
{
	private int height;
	
	public SiblingExt (String n, int a, int w, int h)
	{
		super(n,a,w);
		height = h;
	}
	
	public int getHeight()
	{
		return height;
	}
}
