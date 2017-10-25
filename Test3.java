public class Test3{
	public static void main(String[] args) {
		String s = "Welcome to Java World!";
		String s1 = "   sun  java  ";
		System.out.println(s.startsWith("Welcome")); //true
		System.out.println(s.endsWith("World"));  // false
		String lower = s.toLowerCase();
		String upper = s.toUpperCase();
		System.out.println(lower);
		System.out.println(upper);
		String subS = s.substring(11);
		System.out.println(subS);   // Java World!
		String sp = s1.trim();
		System.out.println(sp);  // sun  java
	}
}