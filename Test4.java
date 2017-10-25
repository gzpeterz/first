public class Test4{
	public static void main(String[] args) {
		int j = 1234567;
		String sNumber = String.valueOf(j);
		System.out.println
			("j is" + sNumber.length() + "位数");
		String s = "May,F,2017";
		String[] sPlit = s.split(",");
		for(int i=0; i<sPlit.length; i++) {
			System.out.println(sPlit[i]);
		}
	}
}