/*
	Programmer: Josh Long
	Assignment: 13 GUI Calculator
	Date: 10/23/15
 */

package gui;

import java.awt.*;
import java.awt.event.*;


class WindowFrame extends Frame
{
	private Label lbl1, lbl2, lbl3, lbl4;
	private TextField num1, num2, result;
	private Button add, sub, mult, div, clear;
	
	public WindowFrame() 
	{
		setLayout(new FlowLayout());
	 
		lbl1 = new Label("Enter number 1: ");
	    	add(lbl1);
	    num1 = new TextField(10);
	    	add(num1); 
	    	
	    lbl2 = new Label("Enter number 2: ");
	    	add(lbl2);
	    num2 = new TextField(10);
	    	add(num2);
	    	
	    lbl3 = new Label("            Results: ");
	    	add(lbl3);
	    result = new TextField(10);
	    	add(result);
	    	
	    lbl4 = new Label("            ");
	    	add(lbl4);
	 
	    add = new Button("ADD");
	    	add(add);
	    sub = new Button("SUB");
	    	add(sub);
	    mult = new Button("MULT");
	    	add(mult);
	    div = new Button("DIV");
	    	add(div);
	    clear = new Button("CLEAR");
	    	add(clear);
	    	
	    
	    
	    add.addActionListener(new ActionListener()
	    {
	    	@Override
	         public void actionPerformed(ActionEvent e) 
	         {
	    		double temp = 0;
	    		double n1 = 0;
	    		double n2 = 0;
	    		if(num1.getText() != "")
	     			n1 = Double.parseDouble(num1.getText());
	     		if(num2.getText() != "")
	     			n2 = Double.parseDouble(num2.getText());
	 		    temp = n1 + n2;
	 		    String ret = new Double(temp).toString();
	 		   
	 		    result.setText(ret);
	         }
	    });
	    
	    sub.addActionListener(new ActionListener()
	    {
	    	@Override
	         public void actionPerformed(ActionEvent e) 
	         {
	    		double temp = 0;
	    		double n1 = 0;
	    		double n2 = 0;
	    		if(num1.getText() != "")
	     			n1 = Double.parseDouble(num1.getText());
	     		if(num2.getText() != "")
	     			n2 = Double.parseDouble(num2.getText());
	 		    temp = n1 - n2;
	 		    String ret = new Double(temp).toString();
	 		   
	 		    result.setText(ret);
	         }
	    });
	    
	    mult.addActionListener(new ActionListener()
	    {
	    	@Override
	         public void actionPerformed(ActionEvent e) 
	         {
	    		double temp = 0;
	    		double n1 = 0;
	    		double n2 = 0;
	    		if(num1.getText() != "")
	     			n1 = Double.parseDouble(num1.getText());
	     		if(num2.getText() != "")
	     			n2 = Double.parseDouble(num2.getText());
	 		    temp = n1 * n2;
	 		    String ret = new Double(temp).toString();
	 		   
	 		    result.setText(ret);
	         }
	    });
	    
	    div.addActionListener(new ActionListener()
	    {
	    	@Override
	         public void actionPerformed(ActionEvent e) 
	         {
	    		double temp = 0;
	    		double n1 = 0;
	    		double n2 = 0;
	    		if(num1.getText() != "")
	     			n1 = Double.parseDouble(num1.getText());
	     		if(num2.getText() != "")
	     			n2 = Double.parseDouble(num2.getText());
	 		    if(n2 != 0)
	 		    	temp = n1 / n2;
	 		    String ret = new Double(temp).toString();
	 		   
	 		    result.setText(ret);
	         }
	    });
	    
	    clear.addActionListener(new ActionListener()
	    {
	    	@Override
	         public void actionPerformed(ActionEvent e) 
	         {  
	    		num1.setText("0");
	    		num2.setText("0");
	 		    result.setText("0");
	         }
	    });
	    
	    addWindowListener(new WindowAdapter() 
	    {
	         @Override
	         public void windowClosing(WindowEvent e) 
	         {
	            System.exit(0);
	         }
	      });

	    setTitle("Calculator Application");
	    setSize(300, 170);
	    setLocation(683,250);
	    setVisible(true);
	   }  
	
	
}
