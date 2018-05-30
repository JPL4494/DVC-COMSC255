/*
	Programmer: Josh Long
	Assignment: 15 Exceptions
	Date: 10/30/15
 */

package guess;

import javax.swing.JFrame;

public class TestJFrameExt 
{
	public static void main(String[] args) 
	{
		JFrameExt j = new JFrameExt();
		j.setSize(400, 300);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setVisible(true);
	}
}
