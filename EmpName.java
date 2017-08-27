import java.util.*;

public class EmpName {

	public static void main(String[] args) {
	
		HashMap<Integer, String> hm= new HashMap<Integer, String>();
		hm.put(1,"Ankur");
		hm.put(2,"Aman");
		hm.put(3,"Raman");
		hm.put(4,"Ram");
		hm.put(5,"Shyam");
	Set<Integer> key=hm.keySet();
	for (Integer keys:key)
	{
		System.out.println(hm.get(keys));
	}
	}

}
