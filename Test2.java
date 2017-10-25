public class Test2 {
	public static void main(String[] args) {
		String s1 = "sun java", s2="Sun Java";
		System.out.println(s1.charAt(1));  // ?
		System.out.println(s1.length());  // ?
		System.out.println(s1.indexOf("java"));  // ?
		System.out.println(s1.indexOf("Java"));  // ?
		System.out.println(s1.equals(s2));  // ?
		System.out.println(s1.equalsIgnoreCase(s2));  // ?

		String s = "I love java";
		String sr = s.replace('I', 'U');
		System.out.println(sr);
	}
}