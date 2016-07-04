import java.text.NumberFormat;


public class NumberFormatTest {

	public static void main(String[] args) {
		String s = "1.0";
		String a = NumberFormat.getInstance().format(s);
		System.out.println(Integer.parseInt(a));
		System.out.println(s);
		System.out.println(Character.MAX_RADIX);
		System.out.println(Character.MIN_RADIX);
	}
}
