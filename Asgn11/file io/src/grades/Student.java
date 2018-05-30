/*
	Programmer: Josh Long
	Assignment: 11 StudentExtFile - File I/O
	Date: 10/2/15
 */

package grades;

public class Student 
{
	private String ID;
	private String name;
	private int numOfTests;
	private int [] grades;
	
	public Student(String i, String n, int[] t)
	{
		ID = i;
		name = n;
		numOfTests = t.length;
		grades = new int [numOfTests];
		System.arraycopy(t, 0, grades, 0, numOfTests);
	}
	
	public String findGrade()
	  {
	    String grade;
	    int temp = 0;
	    
	    for(int i = 0; i < numOfTests; i++)
	    {
	    	temp = temp + grades[i];
	    }
	    
	    temp = temp / numOfTests;
	    
	    if(temp >= 90)
	    	grade = "A";
	    else if(temp < 90 && temp >= 80)
	    	grade = "B";
	    else if(temp < 80 && temp >= 70)
	    	grade = "C";
	    else if(temp < 70 && temp >= 60)
	    	grade = "D";
	    else
	    	grade = "F";
	   
	    return grade;
	  }
	 
	  public String getId()
	  {
	     return ID;
	  }
	 
	  public String getName()
	  {
	     return name;
	  }
}
