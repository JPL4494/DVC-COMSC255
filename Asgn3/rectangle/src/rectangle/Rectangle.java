/*
	Programmer: Josh Long
	Assignment: 3 Rectangle class with data members
	Date: 8/28/15
 */

package rectangle;

public class Rectangle 
{

	//instance variables
    private double length;
    private double width;

    //Constructor
    public Rectangle (double l, double w)
    {
       //initialize instance variables above using the parameters received
       //in the constructor
       length = l;
       width = w;
    }

    //instance methods
    public double getLength ()
    {
       return length;
    }
    public double getWidth ()
    {
       return width;
    }

    public double compArea ()
    {
       return width * length;
    }

    public double compPerimeter ()
    {
       return (2 * width) + (2 * length);
    }
   
}
