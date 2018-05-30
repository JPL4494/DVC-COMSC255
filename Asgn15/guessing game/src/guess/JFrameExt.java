/*
	Programmer: Josh Long
	Assignment: 15 Exceptions
	Date: 10/30/15
 */

package guess;

import java.awt.event.*;

import javax.swing.*;

import java.awt.BorderLayout;
 

 public class JFrameExt extends JFrame implements ActionListener
{
	JPanel jpNorth = new JPanel();
	JPanel jpCenter = new JPanel();
	private JLabel jlbMessage = new JLabel("Enter Guess: ");
	private JTextField jtfMessage = new JTextField (15);
	private JTextArea jtaMessage = new JTextArea (11, 30);
	
	JScrollPane jscrMessage = new JScrollPane (jtaMessage,
			  JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
			  JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	
	private Guess g;
	
	private int guessCount = 0;
	private int gameCount = 0;
	private double guessTotal = 0;
	
	public JFrameExt()
	{	
		super("Guessing Game");
		setLayout(new BorderLayout(5, 10));
		
		jpNorth.add(jlbMessage);
		jpNorth.add(jtfMessage);

		jpCenter.add(jscrMessage);

		jtfMessage.addActionListener(this);

		g = new Guess();
		
		super.add(jpNorth, BorderLayout.NORTH);
		super.add(jpCenter);
		
		setLocation(675,250);
	}
	
	public void actionPerformed (ActionEvent e)
	{ 
		String message = "";
		String userGuess;
		if (e.getSource() == jtfMessage)
		{
			//increment guess count
			guessCount++;
			 String temp = "";
			try
			{
				//Get the user guess from the text field
				userGuess = jtfMessage.getText().trim ();
				temp = userGuess.replaceAll("[\\D|^.]+", "0");
				jtfMessage.setText("");
				guessTotal = guessTotal + Integer.parseInt(temp);

				//Call checkGuess and  pass it userGuess.
				g.checkGuess (temp);

				//If it got here, user guess is correct.
				message = "Correct Guess: " + userGuess + "\n";

				//Increment gameCount
				gameCount++;


				//Accumulate  Summary Report in variable message.
				message = message + "Guess average: " + (guessTotal / guessCount) + " Games: " + gameCount + " Guesses: " + guessCount + "\n";
				//(But don’t display content of message here).
				//(They will be displayed later in clause finally below)

				//Start a new Game
				gameCount++;
				g = new Guess ();

			}
			catch (GuessNotWholeNumberException ie)
			{
				//Extract message from exception object
				message = ie.getMessage() + ": " + temp;
			}
			catch (GuessTooSmallException ts)
			{
				//Extract message from exception object
				message = ts.getMessage() + ": " + temp;

			}
			catch (GuessTooLargeException tl)
			{
				//Extract message from exception object
				message = tl.getMessage() + ": " + temp;

			}
			catch (GuessOutOfRangeException oob)
			{
				//Extract message from exception object
				message = oob.getMessage() + ": " + temp;

			}
			//the code in finally will always execute
			//just before leaving the try/catch block.
			finally
			{
				//display message in text area.
				jtaMessage.append (message + "\n");
				//display prompt for the next guess

				jtaMessage.append ("Enter your guess above" + "\n");
			}
		}
	}
}