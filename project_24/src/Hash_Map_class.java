
//package map;
//import collections.Employee;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
public class Hash_Map_class
{
         	public static void main(String[] args) {
			HashMap<Integer, String> hm = new HashMap<>();
			hm.put(1, "Java");
			hm.put(2, "C");
			hm.put(3, "C++");
			hm.put(4, "HTML");
			hm.put(1, "JavaScript"); //replacing old value with new value
			hm.put(null, "C#");
			hm.put(null, "PHP");
			
			Set<Integer> keys = hm.keySet();
			for (Integer key : keys) {
				String value = hm.get(key);
				System.out.println(key +"   " +value);
			}
			System.out.println(".................................");
			Set<Entry<Integer, String>> set = hm.entrySet();
			for (Entry<Integer, String> entry : set) {
				Integer key = entry.getKey();	
				System.out.println("Key "+key);
                String val = entry.getValue();			
				System.out.println("Value "+val+"\n");
			}
			for (Entry<Integer, String> entry : set) {
				Integer key = entry.getKey();
				
				System.out.println("Keys are  "+key);
			}
			for (Entry<Integer, String> entry : set) 
			{
                String val = entry.getValue();
				
				System.out.println("Values are  "+val);
			}
			
			/*HashMap<Employee, Employee> hm1 = new HashMap<>();
			Employee employee = new Employee();
			hm1.put(employee, employee);*/
			
			
		}

	}


