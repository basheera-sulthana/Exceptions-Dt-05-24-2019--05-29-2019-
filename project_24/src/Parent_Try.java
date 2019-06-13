

public class Parent_Try 
{
	 public static void main(String args[])
	 {
       try
       {
    	   try
    	   {
    		   int arr[]= {1,2,3,4};
    		   System.out.println(arr[24]);
    		   System.out.println("First try block");
    	   }
    	   catch(ArrayIndexOutOfBoundsException e)
    	   {
    		   System.out.println(e);
    		   System.out.println("First catch block ends");
    	   }
    	   try
    	   {
    		   int a=5;
    		   int b=0;
    		   int c=a/b;
    		   System.out.println(c);
    	   }
    	   catch(ArithmeticException e)
    	   {
    		   System.out.println(e);
    	   }
       }
       catch(StringIndexOutOfBoundsException e1)
       {
    	   System.out.println(e1);
       }
       
       catch(NullPointerException e3)
       {
    	   System.out.println(e3);
       }
       catch(Exception e2)
       {
    	   System.out.println(e2);
       }
       
}
}