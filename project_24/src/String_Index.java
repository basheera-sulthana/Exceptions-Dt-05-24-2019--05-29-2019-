

public class String_Index
{
	public static void main(String args[])
	{
	String str="hello";
	try
	{
	
	System.out.println(str.charAt(8));
	}
	catch(StringIndexOutOfBoundsException e)
	{
		System.out.println(e);
	}
	
	
	}
}
