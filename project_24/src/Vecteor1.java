
import java.util.*;  
public class Vecteor1 
{
    public static void main(String args[])
    {  
    Vector<String> v=new Vector<String>();  
    v.add("Android");  
    v.add("Bluetooth");  
    v.add("Cupcake");  
    v.add("Donut");  
    v.add("Eclair");
    v.add("Froyo");
    v.add("Gingerbread");
    v.add("Honeycomb");
    v.add("Ice Cream Sandwich");
    Iterator<String> itr=v.iterator();  
    while(itr.hasNext()){  
    System.out.println(itr.next());  
    }  
    System.out.println(".............................................");
    System.out.println("This is add() method at last position = "+v.add("Jelly Bean"));
    System.out.println(".............................................");
    System.out.println("This is size() method = "+v.size());
    System.out.println(".............................................");
    System.out.println("This is indexOf() method at 1st index = "+v.indexOf(1));
    System.out.println(".............................................");
    System.out.println("This is get() method at 2nd index = "+v.get(2));
    System.out.println(".............................................");
    System.out.println("This is elementAt() method at 2nd index= "+v.elementAt(2));
    System.out.println(".............................................");
    System.out.println("This is remove() method at 4th index= "+v.remove(4));
    System.out.println(".............................................");
    v.add(4, "Eclair");
    System.out.println("This is add() method at index 4th position = "+v.get(4));
    System.out.println(".............................................");
    System.out.println("This is capacity() method = "+v.capacity());
    System.out.println(".............................................");
    System.out.println("This is firstElement() method = "+v.firstElement());
    System.out.println(".............................................");
    System.out.println("This is lastElement() method = "+v.lastElement());
    System.out.println(".............................................");
    System.out.println("This is hashCode() method = "+v.hashCode());
    System.out.println(".............................................");
    System.out.println("This is lastIndexOf() method at 5th index = "+v.lastIndexOf(5));
    System.out.println(".............................................");
    System.out.println("This is toString() method = "+v.toString());
    System.out.println(".............................................");
    System.out.println("This is clone() method = "+v.clone());
    System.out.println(".............................................");
    System.out.println("This is contains() method at 2nd index = "+v.contains(2));
    System.out.println(".............................................");
    System.out.println("This is remove() method  at 7th index = "+v.remove(7));
    System.out.println(".............................................");
    System.out.println("This is parallelStream() method = "+v.parallelStream());
    System.out.println(".............................................");
    System.out.println("This is iterator() method = "+v.iterator());
    System.out.println(".............................................");
    System.out.println("This is spliterator() method = "+v.spliterator());
    System.out.println(".............................................");
    
    
    System.out.println("The vector is = ");
    System.out.println(".............................................");
      
    
    for(String str:v)
    {     
        System.out.println(str);  
    }
    }  
    }  

