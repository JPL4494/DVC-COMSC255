/*
	Programmer: Josh Long
	Assignment: 14B Graphics - Draw
	Date: 12/5/15
*/

package asgn14b;

import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class JPanelExt extends JPanel implements ActionListener
{
	JFrame main = new JFrame("Graphics");
	JPanel JOps = new JPanel();
	JPanel panel = new JPanel();
	
	JButton happy = new JButton("Happy");
	JButton sad = new JButton("Sad");
	JButton pic = new JButton("Picture");
	
	int pick;
	
	public JPanelExt()
	{
		setLayout(new BorderLayout());
		
		JOps.add(happy);
		JOps.add(sad);
		JOps.add(pic);
		
		main.add(JOps, BorderLayout.SOUTH);
		main.add(panel);
		main.add(this);
		
		main.setSize(320, 400);
		main.setVisible(true);
		
		happy.addActionListener(this);
		sad.addActionListener(this);
		pic.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == happy)
		{
			pick = 1;
			repaint();
		}
		
		if(e.getSource() == sad)
		{
			pick = 2;
			repaint();
		}
		
		if(e.getSource() == pic)
		{
			pick = 3;
			repaint();
		}
	}
	
	@Override
	public void paintComponent(Graphics g)
	{	
		super.paintComponent(g);
		if(pick == 1)
		{
			g.setColor(Color.YELLOW);
			g.fillOval(0,0,300,300);
			g.setColor(Color.BLUE);
			g.fillOval(80,75,30,30);
			g.fillOval(190,75,30,30);
			g.setColor(Color.BLACK);
			g.fillArc (75,100,150,150,0,-180);
		}
		
		if(pick == 2)
		{
			g.setColor(Color.BLUE);
			g.fillOval(0,0,300,300);
			g.setColor(Color.BLACK );
			g.fillOval(80,75,30,30);
			g.fillOval(190,75,30,30);
			g.setColor(Color.BLACK);
			g.drawArc(75,150,150,150,0,180);
			g.setColor(Color.BLUE);
			g.fillOval(0,0,300,300);
			g.setColor(Color.BLACK );
			g.fillOval(80,75,30,30);
			g.fillOval(190,75,30,30);
			g.setColor(Color.BLACK);
			g.drawArc(75,150,150,150,0,180);
		}
		
		if(pick == 3)
		{
			BufferedImage img = null;
			try {
				img = ImageIO.read(new File("pic1.jpg"));
			} catch (IOException e) {
				e.printStackTrace();
			}
			ImageIcon icon = new ImageIcon(img);
			JLabel label = new JLabel(icon);
			
	        main.add(label);
		}
	}
}
