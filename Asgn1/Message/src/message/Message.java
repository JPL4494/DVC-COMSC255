/*
	Programmer: Josh Long
	Assignment: 1A Simple message
	Date: 8/21/15
 */

package message;

import javax.swing.*;

public class Message 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String message;

		message = "Today is a good day. \nI am learning Java programming. \nIt’s a lot of fun.";

		JOptionPane.showMessageDialog(null, message);

		System.exit (0);
	}

}
