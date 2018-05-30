/*
	Programmer: Josh Long
	Assignment: 15 Exceptions
	Date: 10/30/15
 */

package guess;

public class GuessOutOfRangeException extends Exception
{
	public GuessOutOfRangeException()
	{
		super("The guess was out of the range");
	}
}
