/*
	Programmer: Josh Long
	Assignment: 15 Exceptions
	Date: 10/30/15
 */

package guess;

public class GuessTooLargeException extends Exception
{
	public GuessTooLargeException()
	{
		super("The guess is too large");
	}
}
