/*
	Programmer: Josh Long
	Assignment: 11A Inheritance & Accessibility - LeapDay
	Date: 10/30/15
 */

package leapYear;

public class LeapDay extends Day
{
	private int year;
	
	public LeapDay(int a, int b, int c)
	{
		super(a,b);
		year = c;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public int findDayNum()
	{
		int ret = super.findDayNum();
		if((year % 100) == 0)
			ret++;
		return ret;
	}
}
