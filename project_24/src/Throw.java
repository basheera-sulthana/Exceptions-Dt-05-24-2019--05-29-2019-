

public class Throw 
{
	public static void main(String args[])
	{
            try
            {
            	/*int a=4;
            	int b=0;
            	int c=a/b;
            	System.out.println(c);*/
                throw new ArithmeticException("divide by zero exception is occured");
            
            }
            catch(ArithmeticException e)
            {
            	System.out.println(e);
            }
	}
}
