
import java.util.*;
class NameException extends Exception
{
	NameException(String s)
	{
	super(s);
   
	}
}	
public class Accept_Name
{
    static void name(String str)throws NameException
    {
    	if(str.length()>15)
    	{
    		throw new NameException("'Please enter shorter name'.");
    	}
    	else
    	{
    		System.out.println("good");
    	}
    }
    public static void main(String args[])
    {
	    Scanner sc=new Scanner(System.in);
        String str;
        System.out.println("Enter a string");
        str=sc.nextLine();
        try
        {
        	Accept_Name.name(str);
        }
        catch(NameException e)
        {
        	System.out.println(e);
        }
        
    }
}
