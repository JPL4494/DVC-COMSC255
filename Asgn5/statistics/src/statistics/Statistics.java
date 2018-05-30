/*
	Programmer: Josh Long
	Assignment: 5 Statistics - Primitive Array
	Date: 8/28/15
 */

package statistics;

import java.util.*;

public class Statistics 
{
	private double[] data;
	private double[] sdata;
	
	public Statistics(double[] d)
	{
		data = new double  [d.length];
        sdata = new double [d.length];

        System.arraycopy (d, 0, data, 0, d.length);
        System.arraycopy (d, 0, sdata, 0, d.length);

        Arrays.sort (sdata);
	}
	
	public double[] getOrigData()
	{
	    double[] d = new double [data.length];
	    
	    System.arraycopy (data, 0, d, 0, data.length);

	    return d;
	}
	
	public double[] getSortedData()
	{
	    double [] d = new double [sdata.length];
	    
	    System.arraycopy (sdata, 0, d, 0, sdata.length);

	    return d;
	}
	
	public double findMin()
	{
		return sdata[0];
	}
	
	public double findMax()
	{
		return sdata[sdata.length - 1];
	}
	
	public double findMean()
	{
		double d = 0;
		for(int i = 0; i < sdata.length; i++)
		{
			d = d + sdata[i];
		}
		return d / sdata.length;
	}
	
	public double findMedian()
	{
		int indexHi, indexLo;
		if(sdata.length % 2 != 0)
		{
			return sdata[sdata.length / 2];
		}
		
		indexHi = sdata.length / 2;
        indexLo = indexHi - 1;
        return (sdata[indexLo] + sdata[indexHi] ) / 2;
	}
	
	public String outputOriginal(String o)
	{
		o = "Original Data: \n";
		for(int i = 0; i < data.length; i++)
			o = o + data[i] + " ";
		
		return o;
	}
	
	public String outputSorted(String o)
	{
		o = o + "Sorted Data: \n";
		for(int i = 0; i < sdata.length; i++)
			o = o + sdata[i] + " ";
		
		return o;
	}
}
