/*
	Programmer: Josh Long
	Assignment: 13 GUI Calculator
	Date: 10/23/15
 */

package test16a;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame implements ActionListener
{
	JPanel JMain = new JPanel();
	JPanel JNum1 = new JPanel();
	JPanel JNum2 = new JPanel();
	JPanel JResult = new JPanel();
	JPanel JOps = new JPanel();
	
	JLabel Jnum1 = new JLabel("Number 1: ");
	JTextField Tnum1 = new JTextField(10);
	
	JLabel Jnum2 = new JLabel("Number 2: ");
	JTextField Tnum2 = new JTextField(10);
	
	JLabel Jres = new JLabel("Result: ");
	JTextField Tres = new JTextField(10);
	
	JButton add = new JButton("Add");
	JButton sub = new JButton("Sub");
	JButton div = new JButton("Div");
	JButton mult = new JButton("Mult");
	JButton clear = new JButton("Clear");
	
	public MyFrame()
	{
		this.setContentPane(JMain);
		GridLayout g1 = new GridLayout(4,1);
		
		JMain.setLayout(g1);
		JMain.add(JNum1);
		JMain.add(JNum2);
		JMain.add(JResult);
		JMain.add(JOps);
		
		JNum1.add(Jnum1);
		JNum1.add(Tnum1);
		JNum1.setBackground(Color.LIGHT_GRAY);
		
		JNum2.add(Jnum2);
		JNum2.add(Tnum2);
		JNum2.setBackground(Color.WHITE);
		
		JResult.add(Jres);
		JResult.add(Tres);
		JResult.setBackground(Color.RED);
		
		JOps.add(add);
		JOps.add(sub);
		JOps.add(mult);
		JOps.add(div);
		JOps.add(clear);
		
		JOps.setBackground(Color.BLUE);
		
		add.addActionListener(this);
		sub.addActionListener(this);
		mult.addActionListener(this);
		div.addActionListener(this);
		clear.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		double temp = 0;
		double n1 = 0;
		double n2 = 0;
		if(e.getSource() == add)
		{
    		if(Tnum1.getText() != "")
     			n1 = Double.parseDouble(Tnum1.getText());
     		if(Tnum2.getText() != "")
     			n2 = Double.parseDouble(Tnum2.getText());
 		    temp = n1 + n2;
 		    String ret = new Double(temp).toString();
 		   
 		    Tres.setText(ret);
		}
		
		if(e.getSource() == sub)
		{
    		if(Tnum1.getText() != "")
     			n1 = Double.parseDouble(Tnum1.getText());
     		if(Tnum2.getText() != "")
     			n2 = Double.parseDouble(Tnum2.getText());
 		    temp = n1 - n2;
 		    String ret = new Double(temp).toString();
 		   
 		    Tres.setText(ret);
		}
		
		if(e.getSource() == mult)
		{
    		if(Tnum1.getText() != "")
     			n1 = Double.parseDouble(Tnum1.getText());
     		if(Tnum2.getText() != "")
     			n2 = Double.parseDouble(Tnum2.getText());
 		    temp = n1 * n2;
 		    String ret = new Double(temp).toString();
 		   
 		    Tres.setText(ret);
		}
		
		if(e.getSource() == div)
		{;
    		if(Tnum1.getText() != "")
     			n1 = Double.parseDouble(Tnum1.getText());
     		if(Tnum2.getText() != "")
     			n2 = Double.parseDouble(Tnum2.getText());
     		if(n2 != 0)
 		    	temp = n1 / n2;
     		else
     			temp = 0;
     		
 		    String ret = new Double(temp).toString();
 		   
 		    Tres.setText(ret);
		}
		
		if(e.getSource() == clear)
		{
    		Tnum1.setText("");
    		Tnum2.setText("");
    		Tres.setText("");
		}
		
	}
}
