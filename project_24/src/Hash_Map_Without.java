
import java.util.HashMap;
import java.util.Iterator;

public class Hash_Map_Without 
{
		 public static void main(String args[]) {
		 HashMap h = new HashMap();
			h.put("a", "Android Versions");
			System.out.println("\n"+h);

		    h.put(1, "Android");
			System.out.println("\n"+h);

			h.put(2, "Bluetooth");
			System.out.println("\n"+h);

			h.put(3, "Cupcake");
			System.out.println("\n"+h);

			h.put(4, "Donut");
			System.out.println("\n"+h);

			h.put(5, "Eclair"); //replacing old value with new value
			System.out.println("\n"+h);

			h.put(null, "Froyo");
			System.out.println("\n"+h);

			h.put("null", "test");
			System.out.println("\n"+h);

			h.put("a","Androis Versions form A-Z");
		/*	for(Object obj:h)
			{
				System.out.println(h);
			}*/
			System.out.println("\n"+h);
	 }
	}


