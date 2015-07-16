import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;


public class UrlEncodeTest {
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String ss = URLEncoder.encode("liwen@whwdxy.com", "utf-8");
		System.out.println(ss);
		System.out.println(URLEncoder.encode(ss,"utf-8"));
	}
}
