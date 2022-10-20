package com.celestial;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Keyboard Handler
 *
 */
public class App 
{
    public static void main( String[] args )
    {
	
    	
    	System.out.print("Enter the price, enter quit to exit:");
    	String lineRead;
        Scanner sc = new Scanner(System.in);
        int growBy=1;
        String[] prices=new String[growBy];//create an array; static array
        try
        {        
            for (int x =0;(x<prices.length && prompt() && ( lineRead=sc.next())!=null);x++)
            {
            	if(lineRead.equalsIgnoreCase("quit"))
            		break;
            	prices[x]=lineRead;
            	System.out.println(lineRead);
            	if(x==prices.length-1)        	
            		//the purpose of copyof is 
            		prices= Arrays.copyOf(prices, prices.length+growBy);         	
            }
        }catch( NoSuchElementException e )
        {}
        //error1: cannot convert null to double 
       // double[] doubleValues = Arrays.stream(prices)
            //    .mapToDouble(Double::parseDouble)
           //     .toArray();
    	
    	String[] SlicedPrices=new String[prices.length-1];

      ///////get rid of null   	

        for(int z=0;z<prices.length-1;z++)
    	{
    		SlicedPrices[z]=prices[z];
    	}  
        /////Convert//////
        double[] doubleValues = Arrays.stream(SlicedPrices)
                    .mapToDouble(Double::parseDouble)
                    .toArray();
        //////sort/////
        Arrays.sort(doubleValues);
        //////test///////
        for (double doubleValue : doubleValues)
        {
        	 System.out.println(doubleValue);
        }
    }
    
    double create_vat(double cost, double vat)
    {
    	return cost*vat;
    }
    
    static private boolean prompt()
    {
        System.out.print("enter next price:");
        return true;
    }

	   
}
