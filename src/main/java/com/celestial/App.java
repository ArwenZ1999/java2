package com.celestial;

import java.util.ArrayList;
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
	
    	
    	ArrayList lines = new ArrayList(10);//garbage collection automatially
    	
    	
    	
    	
    	System.out.print("Enter the price, enter quit to exit:");
    	String lineRead;
        Scanner sc = new Scanner(System.in);
        int growBy=1;
        String[] prices=new String[growBy];//create an array; static array
        try
        {        
            while ( prompt() && ( lineRead=sc.next())!=null)
            {
            	if(lineRead.equalsIgnoreCase("quit"))
            		break;
            	lines.add(lineRead);//arraylist add prices 
            	System.out.println(lineRead);
            	
            }
        }catch( NoSuchElementException e )
        {}	
    	//String[] SlicedPrices=new String[prices.length-1];
        int lineNo=0; //declear all the varibales on the top 
        //lines.forEach(line->{//->lamda forbid to modify the code outside the scoop
        	//System.out.println(++lineNo+":"+line);
        //});
    	for(var line:lines)
    	{
    		System.out.println(++lineNo+":"+line);
    	};
    	
    	
    }
    static private boolean prompt()
    {
        System.out.print("enter next price:");
        return true;
    }

	   
}
