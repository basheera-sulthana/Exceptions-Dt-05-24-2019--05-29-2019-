
import java.util.*;  
public class List_Array1
{
    
    
    public static void main(String args[]){  
    ArrayList<String> list=new ArrayList<String>();
    list.add("Hiiiii.....!!"); 
    list.add("Hellooooo....");  
    list.add("Welcome...."); 
    list.add("To....");  
   
     list.add(4, "KKD");
    Iterator itr=list.iterator();  
    while(itr.hasNext()){  
    System.out.println(itr.next());  
    } 
    System.out.println(".............................................");  

    System.out.println("The getted value is =  "+list.get(0));
    System.out.println(".............................................");
    System.out.println("The removed element  is =  "+list.remove(1)); 
    System.out.println(".............................................");
    System.out.println("After removing the element ....\n The list can be displayed as = "+list);
   //list.clear();
   // System.out.println(list);
    System.out.println(".............................................");
    System.out.println("List = "+list.isEmpty());
    System.out.println(".............................................");
    System.out.println("list "+list.lastIndexOf("Hiiiii.....!!"));
    System.out.println(".............................................");
    System.out.println("  "+list.contains("KKD"));
    System.out.println(".............................................");
    System.out.println("This is clone method = "+list.clone());
    System.out.println(".............................................");
    System.out.println("This is remove method = "+list.remove("Welcome...."));
    System.out.println(".............................................");
    System.out.println("This is size method = "+list.size());
    System.out.println(".............................................");
    list.trimToSize();
    System.out.println("This is trim method = "+list);
    System.out.println(".............................................");
    list.add("RVPM");
    System.out.println("After trim method = "+list);
    System.out.println(".............................................");
    String s = list.get(1);
    System.out.println("The getted element is at index 1 = "+s);
    System.out.println(".............................................");
    System.out.println("To array method  = "+list.toArray());
    System.out.println(".............................................");

    for(String str:list)
    {
        System.out.println(str);  
    }
    

  
    }  
    }  





/* 
//Traversing list through Iterator  
Iterator itr=list.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  */