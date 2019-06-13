
import java.util.*;
import java.io.FileOutputStream;
public class Try_With_Resources 
{
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
    Scanner sc=new Scanner(System.in);
	String str;
	System.out.println("Enter a string");
	str=sc.nextLine();
	try
	{
		FileOutputStream fos =new FileOutputStream("D:/xyz.txt");
		byte byteArray[]=str.getBytes();
		fos.write(byteArray);
		//System.out.println(str);

		System.out.println("The given string "+str+ " is successfully entered");
		fos.close();

	}
	catch(Exception e)
	{
		System.out.println(e);

	}
	}
}
