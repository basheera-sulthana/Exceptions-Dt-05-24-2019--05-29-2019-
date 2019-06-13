
import java.util.HashMap;
import java.util.IdentityHashMap;
public class Identity_Hash_Map
{
	 public static void main(String []args) {
		 HashMap<Integer, String> h = new HashMap<>(); 
		 Integer i1 = new Integer(1);
		 Integer i2 = new Integer(1);
		 Integer i3 = new Integer(2);
		 
		 h.put(i1, "Apple");
		 h.put(i2, "Ball");
		 h.put(i3,"Cat");
		 h.put(3,"Cat");
		 System.out.println(h);
		 
		 IdentityHashMap<Integer, String> ih = new IdentityHashMap<Integer, String>();
		 ih.put(i1, "Ram");
		 ih.put(i2, "Vijay");
		 ih.put(3,"Cat");
		 System.out.println(ih);
		 
	 }
	
}
