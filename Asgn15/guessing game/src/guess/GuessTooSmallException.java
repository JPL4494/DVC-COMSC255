/*
	Programmer: Josh Long
	Assignment: 15 Exceptions
	Date: 10/30/15
 */

package guess;

public class GuessTooSmallException extends Exception
{
	public GuessTooSmallException()
	{
		super("The guess is too small");
	}
}
