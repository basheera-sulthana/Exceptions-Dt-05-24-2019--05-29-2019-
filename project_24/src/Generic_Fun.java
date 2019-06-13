

import java.util.ArrayList;

public class Generic_Fun 
{
		static <T> void display(T element) 
		{
			System.out.println("...."+ element);
		}
		
		static <A> void print(A[] elements) 
		{
			
			for (A e : elements)
			{
				System.out.println(e);
			}
			
		}
		
		
		public static void main(String []args) 
		{
			display(10);
			display("Hello....!!");	
			Integer[] array = {10,20,30,40};			
			print(array);
			System.out.println(".........................");
			String str[]= {"Vijay","Rama"};
			print(str);
			System.out.println(".........................");

			Character cArray[]= {'J','A','V','A'};
			print(cArray);
			
			
		}
	}


