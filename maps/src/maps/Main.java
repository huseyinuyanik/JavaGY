package maps;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		HashMap b= new HashMap();
		
		b.put("Turkey","Ankara");
		b.put("Fransa", "Paris");
		b.put("England", "London");
		
		Set s=b.entrySet();
		Iterator i=s.iterator();
		
		
		int[]c= new int[] {1,2};
		
		
		HashMap<Integer, String> hm=new HashMap<>();
		
		hm.put(07, "Huseyin");
		hm.put(12,"Ayse");
		hm.put(05, "Hamit");
		System.out.println(hm);
		System.out.println(hm.get(07));
		
		enum Oyuncular{
			Ali, Veli, Osman, Hayri
		}
		
		Oyuncular g=Oyuncular.Veli;
		
		System.out.println(g);
		System.out.println(g.ordinal());
		

	}

}


