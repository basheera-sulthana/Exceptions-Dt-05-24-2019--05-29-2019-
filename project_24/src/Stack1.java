
import java.util.*;  
public class Stack1 
{
	
	
	public static void main(String args[])
	{  
	Stack<String> s = new Stack<String>();  
	s.add("Android");  
    s.add("Bluetooth");  
    s.add("Cupcake");  
    s.add("Donut");  
    s.add("Eclair");
    s.add("Froyo");
    s.add("Gingerbread");
    s.add("Honeycomb");
    s.add("Ice Cream Sandwich"); 
	s.pop();  
	s.pop();  
	Iterator<String> itr=s.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	}  
	  System.out.println("The vector is  ");
	    System.out.println(".............................................");
	    System.out.println(".............................................");
	    System.out.println("This is add() method at last position = "+s.add("Jelly Bean"));
	    System.out.println(".............................................");
	    System.out.println("This is size() method = "+s.size());
	    System.out.println(".............................................");
	    System.out.println("This is indexOf() method at 1st index = "+s.indexOf(1));
	    System.out.println(".............................................");
	    System.out.println("This is get() method at 2nd index = "+s.get(2));
	    System.out.println(".............................................");
	    System.out.println("This is elementAt() method at 2nd index= "+s.elementAt(2));
	    System.out.println(".............................................");
	    System.out.println("This is remove() method at 4th index= "+s.remove(4));
	    System.out.println(".............................................");
	    s.add(4, "Eclair");
	    System.out.println("This is add() method at index 4th position = "+s.get(4));
	    System.out.println(".............................................");
	    System.out.println("This is capacity() method = "+s.capacity());
	    System.out.println(".............................................");
	    System.out.println("This is firstElement() method = "+s.firstElement());
	    System.out.println(".............................................");
	    System.out.println("This is lastElement() method = "+s.lastElement());
	    System.out.println(".............................................");
	    System.out.println("This is hashCode() method = "+s.hashCode());
	    System.out.println(".............................................");
	    System.out.println("This is lastIndexOf() method at 5th index = "+s.lastIndexOf(5));
	    System.out.println(".............................................");
	    System.out.println("This is toString() method = "+s.toString());
	    System.out.println(".............................................");
	    System.out.println("This is clone() method = "+s.clone());
	    System.out.println(".............................................");
	    System.out.println("This is contains() method at 2nd index = "+s.contains(2));
	    System.out.println(".............................................");
	    System.out.println("This is remove() method  at 7th index = "+s.remove(7));
	    System.out.println(".............................................");
	    System.out.println("This is parallelStream() method = "+s.parallelStream());
	    System.out.println(".............................................");
	    System.out.println("This is iterator() method = "+s.iterator());
	    System.out.println(".............................................");
	    System.out.println("This is spliterator() method = "+s.spliterator());
	    System.out.println(".............................................");
	    
	    for(String str:s)
	    {     
	        System.out.println(str);  
	    }
	}  
	} 

