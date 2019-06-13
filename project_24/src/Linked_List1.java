
import java.util.*;  

import java.util.LinkedList;

public class Linked_List1
{
	public static void main(String args[])
	{  
		LinkedList<String>li1 = new LinkedList<String>();  
		li1.add("1st class");
		li1.add("2nd class");
		li1.add(2,"3rd class");
		li1.get(0);
		LinkedList<String>li2 = new LinkedList<String>();
		li2.add("4th class");
		li2.add("5th class");
		li2.add(2,"6th class");
		Iterator<String>itr1 = li1.iterator();
		 System.out.println("List1 is \n.............");
		while(itr1.hasNext())
		{  
		   System.out.println(itr1.next());  
		}  
	    System.out.println(".............................................");

		Iterator<String>itr2 = li2.iterator();
		 System.out.println("List2 is \n.............");
		while(itr2.hasNext())
		{  
		   System.out.println(itr2.next());  
		}  
	    System.out.println(".............................................");
	    System.out.println( "Add all stmt used = "+li1.addAll(li2));
	    System.out.println(".............................................");
	    li1.addFirst("Welcome");       
	    System.out.println("After adding the element is");	    
		 for(String str:li1)
		    {
			     
		        System.out.println(str);  
		    }
		    System.out.println(".............................................");
		 li1.addFirst("Hiii.....");
	        System.out.println("AddFirst() method\n Then the ouput is \n.................................................");  
	        li2.addLast("Bye");
	        System.out.println("The list2 is \n............................");  
	        System.out.println(li2);  
		    System.out.println(".............................................");
		    li1.clear();
		    System.out.println("Clear() method is used on List1");	    
	        System.out.println(li1);
		    System.out.println(".............................................");
		    System.out.println("This is clone method = "+li2.clone());
		    System.out.println(".............................................");
		    System.out.println("To check whether the String contains or not in list1 = "+li1.contains("1st class"));
		    System.out.println(".............................................");
		    System.out.println("Get() method is used on list 2 = "+li2.get(2));
		    System.out.println(".............................................");
		    System.out.println("GetFirst() method is used on list 2  = "+li2.getFirst());
		    System.out.println(".............................................");
		    System.out.println("GetLast() method is used on list 2  = "+li2.getLast());
		    System.out.println(".............................................");
		    System.out.println("list "+li2.lastIndexOf("4th class"));
		    System.out.println(".............................................");
		    System.out.println("Peek() method is =  "+li2.peek());
		    System.out.println(".............................................");
		    System.out.println("peekFirst() method is =  "+li2.peekFirst());
		    System.out.println(".............................................");
		    System.out.println("peekLast() method is = "+li2.peekLast());
		    System.out.println(".............................................");
		    System.out.println("poll() method is used = "+li2.poll());
		    System.out.println(".............................................");
		    System.out.println("pollfirst() method is =  "+li2.pollFirst());
		    System.out.println(".............................................");
		    System.out.println("polllast() method is =  "+li2.pollLast());
		    System.out.println(".............................................");
	        System.out.println("Offer() Adds the specified element as the tail (last element) of this list.\r\n" + 
	        		" "+li2.offer("10th"));  
		    System.out.println(".............................................");
		    System.out.println(""+li2.equals(li1));
		    System.out.println(".............................................");

		    System.out.println("The list2 is \n.....");
			 for(String str:li2)
			    {
				     
			        System.out.println(str);  
			    }
			 System.out.println(".............................................");
			  System.out.println("pop() method is =  "+li2.pop());
			    System.out.println(".............................................");
		        System.out.println(li2);  

	}
}
