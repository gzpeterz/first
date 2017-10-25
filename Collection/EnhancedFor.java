import java.util.*;

public class EnhancedFor {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		for(int i : arr) {
			System.out.println(i);
		}
		
		Collection c = new ArrayList();
		c.add(new String("aaa"));
		c.add(new String("bbb"));
		c.add(new String("ccc"));
		for(Object o : c) {
			System.out.println(o);
		}

		/*
		 Java 8 
		*/
		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);

		items.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v));

		items.forEach((k,v)->{
    		System.out.println("Item : " + k + " Count : " + v);
    		if("E".equals(k)){
        		System.out.println("Hello E");
    		}
		});

		List<String> items2 = new ArrayList<>();
		items2.add("A");
		items2.add("B");
		items2.add("C");
		items2.add("D");
		items2.add("E");

		//lambda
		//Output : A,B,C,D,E
		items2.forEach(item->System.out.println(item));

		//Output : C
		items2.forEach(item->{
    		if("C".equals(item)){
        		System.out.println(item);
    		}
		});
	}
}