
import java.util.*;


class StringNotExistException extends Exception
{
	StringNotExistException(String s)
	{
	super(s);
   
	}
}

/*class String1
{
	static void insert(String str)throws StringNotExistException
	{
		
	}
}*/
public class String_Array
{
		static void insert(String str)throws StringNotExistException
		{
			String s[]= new String[5];
			s[0]="kkd";
			s[1]="rjy";
			s[2]="rvpm";
			s[3]="rcpm";
			s[4]="amp";
			int count=0;
			
			
	        for(int i=0;i<5;i++)
            {
            	if((s[i].equals(str)))
            	{
            	 count++;
                     System.out.println("U r city is  already enrolled");
        		
            	}
            }
	        if(count==0)
	        {
            		throw new StringNotExistException("You are not Enrolled for the\r\n" + 
    					"class'.");
            	
            }
	
		}

		public static void main(String args[])
		{
	        try
            {
	        	String str;
	        	@SuppressWarnings("resource")
			    Scanner sc=new Scanner(System.in);
		        System.out.println("Enter city");
		        str=sc.nextLine();
        	    String_Array.insert(str);
            }
        
           catch(StringNotExistException e)
          {
        	System.out.println(e);
          }
		
	}
}
