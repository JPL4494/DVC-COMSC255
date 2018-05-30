/*
	Programmer: Josh Long
	Assignment: 11A Inheritance & Accessibility - LeapDay
	Date: 10/30/15
 */

package leapYear;

public class Day 
{
	private int day;
	protected int month;
	
	public Day(int a, int b)
	{
		month = a;
		day = b;
	}
	
	public int getDay()
	{
		return day;
	}
	public int getMonth()
	{
		return month;
	}
	
	public int findDayNum()
	{
		int ret = day;
		
		if(month == 1)
			ret += 0;
		if(month == 2)
			ret += 31;
		if(month == 3)
			ret += 59;
		if(month == 4)
			ret += 90;
		if(month == 5)
			ret += 120;
		if(month == 6)
			ret += 151;
		if(month == 7)
			ret += 181;
		if(month == 8)
			ret += 212;
		if(month == 9)
			ret += 243;
		if(month == 10)
			ret += 273;
		if(month == 11)
			ret += 304;
		if(month == 12)
			ret += 334;
		
		return ret;
	}
}
