/*
	Programmer: Josh Long
	Assignment: 14A Graphics - Pie Chart
	Date: 10/30/15
 */

package pieChart;

import java.awt.*;
import javax.swing.*;

class PieChart extends JPanel
{
	private int salesN, salesS, salesE, salesW, salesM;
	
	public PieChart(int a, int b, int c, int d, int e)
	{
		salesN = a;
		salesS = b;
		salesE = c;
		salesW = d;
		salesM = e;
		
		JFrame frame = new JFrame("Regional Sales Report");
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.add(this);
		frame.setSize(600, 500);
		frame.setVisible(true);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		double total = salesN + salesS + salesE + salesW + salesM;
		
		double a = (salesN / total) * 360;
		double b = (salesS / total) * 360;
		double c = (salesE / total) * 360;
		double d = (salesW / total) * 360;
		double e = (salesM / total) * 360;
		
		g.setColor(Color.RED);
		g.fillArc(110, 80, 300, 300, 0, (int)a);
		g.drawString("North Sales: " + salesN, 420, 80);
		
		g.setColor(Color.GREEN);
		g.fillArc(110, 80, 300, 300, (int)a, (int)b);
		g.drawString("South Sales: " + salesS, 420, 100);
		
		g.setColor(Color.BLUE);
		g.fillArc(110, 80, 300, 300, (int)(b+a), (int)c);
		g.drawString("East Sales: " + salesE, 420, 120);
		
		g.setColor(Color.MAGENTA);
		g.fillArc(110, 80, 300, 300, (int)(a+b+c), (int)d);
		g.drawString("West Sales: " + salesW, 420, 140);
		
		g.setColor(Color.ORANGE);
		g.fillArc(110, 80, 300, 300, (int)(a+b+c+d), (int)e);
		g.drawString("Midwest Sales: " + salesM, 420, 160);
		
		g.setColor(Color.BLACK);
	    g.drawArc( 110, 80, 300, 300, 0, 360);
	}
}
