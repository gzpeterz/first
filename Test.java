public class Test {
	public static void main(String[] argv) {
		String s1 = "hello";
		String s2 = "hello";
		System.out.println(s1 == s2);  // ?

		s1 = new String("hello");
		s2 = new String("hello");
		System.out.println(s1 == s2);  // ?
		System.out.println(s1.equals(s2));  // ?

		char c[] = {'I',' ', 'l', 'o', 'v', 'e',
			' ', 'j', 'a', 'v', 'a'};
		String s3 = new String(c);
		String s4 = new String(c, 2, 4);
		System.out.println(s3);
		System.out.println(s4);
	}
}