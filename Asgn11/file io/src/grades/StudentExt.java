/*
	Programmer: Josh Long
	Assignment: 11 StudentExtFile - File I/O
	Date: 10/2/15
 */

package grades;

public class StudentExt extends Student
{
	private String gradeType;
	
	public StudentExt(String i, String n, int[] t, String g)
	{
		super(i,n,t);
		gradeType = g;
	}
	
	public String findGrade()
	{
		String grade = super.findGrade();
		
		if (gradeType.equalsIgnoreCase ("credit"))
		{
			if ((grade.equalsIgnoreCase ("A")) ||
			          (grade.equalsIgnoreCase ("B")) ||
			            (grade.equalsIgnoreCase ("C")))
				grade = "CR";
			else
			    grade = "NCR";
		}
	    return grade;
	}
}
