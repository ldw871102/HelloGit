import java.text.SimpleDateFormat;
import java.util.Date;


public class HelloGit {

	public static void main(String[] args) {
		String id = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		System.out.println(id);
		
		String idd = "112233";
		System.out.println(idd.substring(0,idd.length()-2));
	}
}
