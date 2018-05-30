/*
	Programmer: Josh Long
	Assignment: 15 Exceptions
	Date: 10/30/15
 */

package guess;

public class Guess 
{
	private int selection;
	
	public Guess()
	{
		selection =  ((int) (Math.random() * 7)) + 1;
	}
	
	public void checkGuess(String guess) throws GuessOutOfRangeException,
	GuessTooLargeException, GuessTooSmallException, GuessNotWholeNumberException
	{
		int n = 0;

		try
		{
			n = Integer.parseInt(guess);
		}
		catch(NumberFormatException ex)
		{
			throw new GuessNotWholeNumberException();
		}
		
		if (n > 7 || n < 1)
		{
			throw new GuessOutOfRangeException();
		}
		else if (n > selection)
		{
			throw new GuessTooLargeException();
		}
		else if (n < selection)
		{
			throw new GuessTooSmallException();
		}
		return;
	}
}
