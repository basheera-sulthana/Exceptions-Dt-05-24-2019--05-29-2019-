
import java.util.*;
public class Try_Catch
{
		public static void main(String args[])
		{
			@SuppressWarnings("resource")
	    Scanner sc=new Scanner(System.in);
	    int a,b;
	    System.out.println("Enter a value");
	    a=sc.nextInt();
	    System.out.println("Enter b value");
	    b=sc.nextInt();
	       try
	    {
	    	   int c=a/b;
	           System.out.println("Result is "+c);
	    }
	      catch(ArithmeticException e)
	       {
	    	  System.out.println(e);
	       }
		}
	}

