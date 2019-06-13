
import java.util.*;
class InvalidNumberException extends Exception
{
	InvalidNumberException(String s)
	{
	super(s);
   
	}
}	
public class Accept_3_numbers
{
	static void add()throws InvalidNumberException
	{
		
	
	
	
		@SuppressWarnings("resource")
	    Scanner sc=new Scanner(System.in);
		int count=0;
		int a;
		System.out.println("Enter 1st value");
		a=sc.nextInt();
		int b;
		System.out.println("Enter 2nd value");
		b=sc.nextInt();
		int c;
		System.out.println("Enter 3rd value");
		c=sc.nextInt();
		int num=a+b+c;
		System.out.println("Sum is  "+num);
		if(num>100)
		{
			throw new InvalidNumberException(" 'Please enter the numbers,"
					+"which total is below 100'.");
		}
		
			}
		public static void main(String args[])
		{
			 try
			 {
				 Accept_3_numbers.add();
			 }
			 catch(InvalidNumberException e)
			 {
				 System.out.println(e);
				 
			 }
		}
	}

