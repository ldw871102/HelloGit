
public class StringToDouble {

	public static void main(String[] args) {
		String s = "12.1";
		String s1 = "12.10";
		System.out.println(s==s1);
		double d = Double.parseDouble(s);
		System.out.println(d);
		double d1 = Double.parseDouble(s);
		System.out.println(d1);
		System.out.println(d==d1);
	}
}
