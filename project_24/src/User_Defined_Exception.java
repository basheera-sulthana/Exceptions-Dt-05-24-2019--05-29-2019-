
import java.util.*;
class InvalidAgeException extends Exception
{
	InvalidAgeException(String s)
	{
	super(s);
   
	}
}	

	class AgeExcep 
	{
		static void validate(int age)throws InvalidAgeException
		{
			if(age<18)
			{
				throw new InvalidAgeException("Access denied - You must be at\r\n" + 
						"least 18 years old.'");
			}
			else
			{
				System.out.println("Welcome...!!! U  r eligible to vote  ");
			}
		}
	}
	public class User_Defined_Exception 
	{	
		public static void main(String args[])
		{
			@SuppressWarnings("resource")
		    Scanner sc=new Scanner(System.in);
			int age;
			System.out.println("Enter ur age");
			age=sc.nextInt();
	        try
	        {
			AgeExcep.validate(age);
		    }
	        catch(InvalidAgeException e)
	        {
	        	System.out.println(e);
	        }
		}
	}

