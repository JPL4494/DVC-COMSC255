/*
	Programmer: Josh Long
	Assignment: 14A Graphics - Pie Chart
	Date: 10/30/15
 */

package pieChart;

import java.awt.*;
import javax.swing.*;

public class TestPieChart 
{
	public static void main(String[] args) 
	{
		String in;
		int a, b, c, d, e;
		
		in = JOptionPane.showInputDialog ("Enter sales percentage of the North:");
		a = Integer.parseInt(in);
		in = JOptionPane.showInputDialog ("Enter sales percentage of the South:");
		b = Integer.parseInt(in);
		in = JOptionPane.showInputDialog ("Enter sales percentage of the East:");
		c = Integer.parseInt(in);
		in = JOptionPane.showInputDialog ("Enter sales percentage of the West:");
		d = Integer.parseInt(in);
		in = JOptionPane.showInputDialog ("Enter sales percentage of the Midwest:");
		e = Integer.parseInt(in);
		
		PieChart p = new PieChart(a,b,c,d,e);
	}
}
