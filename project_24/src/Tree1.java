
import java.util.*;  

public class Tree1
{
	

	   public static void main(String args[]){  
	    //Creating and adding elements  
	    TreeSet<String> s=new TreeSet<String>();  
	    s.add("Ravi");  
	    s.add("Vijay");  
	    s.add("Ravi");  
	    s.add("Ajay");  
	    s.add("Zahir");
	    //traversing elements  
	    Iterator<String> itr=s.iterator();  
	    while(itr.hasNext()){  
	    System.out.println(itr.next());  
	    }  
	    System.out.println("This is add() method = "+s.add("Ram"));
	    System.out.println(".............................................");
	   // System.out.println("This is contains() method = "+s.contains(1));
	    //System.out.println(".............................................");
	    System.out.println("This is clone() method = "+s.clone());
	    System.out.println(".............................................");
	    System.out.println("This is isEmpty() method = "+s.isEmpty());
	    System.out.println(".............................................");
	    System.out.println("This is iterator() method = "+s.iterator());
	    System.out.println(".............................................");
	    System.out.println("This is remove() method = "+s.clone());
	    System.out.println(".............................................");
	    System.out.println("This is size() method = "+s.size());
	    System.out.println(".............................................");
	    System.out.println("This is spliterator() method = "+s.spliterator());
	    System.out.println(".............................................");
	    System.out.println("This is higher() method = "+s.higher(""));
	    System.out.println(".............................................");
	    System.out.println("This is lower() method = "+s.lower(""));
	    System.out.println(".............................................");
	    System.out.println("This is pollFirst() method = "+s.pollFirst());
	    System.out.println(".............................................");
	    System.out.println("This is pollLast() method = "+s.pollLast());
	    System.out.println(".............................................");
	    System.out.println("This is ceiling() method = "+s.ceiling(""));
	    System.out.println(".............................................");
	    System.out.println("This is floor() method = "+s.floor("z"));
	    System.out.println(".............................................");
	    System.out.println("This is first() method = "+s.first());
	    System.out.println(".............................................");
	    System.out.println("This is last() method = "+s.last());
	    System.out.println(".............................................");
	  
		  System.out.println(".............................................");	    
		    for(String str:s)
		    {     
		        System.out.println(str);  
		    }


	    }  
	    }  


