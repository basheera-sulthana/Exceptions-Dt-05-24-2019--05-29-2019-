

public class Throws
{
      static void index()throws ArrayIndexOutOfBoundsException
      {
            int arr[]= {1,2,3,4,5};
      	  System.out.println(arr[4]);
    	  throw new ArrayIndexOutOfBoundsException("Error");
      }
      public static void main(String args[])
      {
    	  try
    	  {
    		  index();
    		  
    	  }
    	  catch(ArrayIndexOutOfBoundsException e)
    	  {
    		  System.out.println(e);
    	  }
      }
 		 
}
