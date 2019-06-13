

public class Nested_Try
{
	public static void main(String args[])
	 {
      try
      {
   	   try
   	   {
   		int a=5;
		   int b=3;
		   int c=a/b;
		   System.out.println(c);
		   System.out.println("Successfully completed 1st arithmetic try block");
		   System.out.println("...................................");

   	       try
   	       {
   			   int arr[]= {1,2,3,4};
   			   System.out.println(arr[3]);
   			   System.out.println("Successfully completed 2nd  array index try block");
   			   System.out.println("...................................");



   	      }
   	      catch(ArrayIndexOutOfBoundsException e)
   	     {
   		   System.out.println(e);
   		   System.out.println("ArrayIndexOutOfBounds Exception  Raised ");
   	    }
   	  catch(ArithmeticException e)
	   {
		   System.out.println(e);
   		   System.out.println("ArithmeticException  Raised ");

	   }
   	       }
   	catch(Exception e2)
       {
    	   System.out.println(e2);
       }
      }
      finally
      {
    	  System.out.println("Finall block");
      }
       
   	   
}
	 }
