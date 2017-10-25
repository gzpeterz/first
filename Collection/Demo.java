import java.util.*;

public class Demo {
	public static void main (String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i=0; i<20; i++) {
			// list.add("A" + i);
			list.add(i);
		}
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		Collections.shuffle(list);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.rotate(list, 1);
		System.out.println(list);
	}
}

class MyQueue {
	ArrayList cc ;

	public void enter(String str) {}
	public String outQueue() {}
	int size() 
	public String toString() {}

}


class MyStack {
	Collection  dd;

	public void push(String str)
	public String  pop();
	int size() 
	public String toString() {
	}

}


