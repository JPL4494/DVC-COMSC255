/*
	Programmer: Josh Long
	Assignment: 15 Exceptions
	Date: 10/30/15
 */

package guess;

public class GuessNotWholeNumberException extends Exception
{
	public GuessNotWholeNumberException()
	{
		super("The Guess wasn't a whole number");
	}
}
