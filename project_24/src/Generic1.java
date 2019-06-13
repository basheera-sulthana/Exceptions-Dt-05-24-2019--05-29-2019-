
import java.util.ArrayList;
public class Generic1 
{
		public static void main(String[] args) {
			
			ArrayList al = new ArrayList();
			al.add("Java");
			al.add("C++");
			al.add("C#");
            al.add(10.5);
            al.add(10);
			/*for (Object object : al)
			{
				String s = (String) object; // down casting
				System.out.println(s);
			}*/
			for (Object object : al) {
				if(object instanceof String) {
					String s = (String)object;
					System.out.println("this is String value = "+s +"\n"+object.getClass().getName());				
				} else if(object instanceof Integer) {
					Integer i = (Integer)object;
					System.out.println("this is Integer value  = "+object.getClass().getName() +i);
				} else {
					System.out.println("this is "+object.getClass().getName()+" value " +object);	
				}
				
			}
			
			ArrayList<String> al2 =  new ArrayList<>();
			al2.add("Hi......!!");
			al2.add("Welcome");
			al2.add("To");
			al2.add("My World");
			for (String s : al2) {
				System.out.println(s);
			}
		}

	}


