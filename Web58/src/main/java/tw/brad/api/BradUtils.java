package tw.brad.api;

import java.io.BufferedReader;
import java.io.FileReader;

public class BradUtils {
	public static String loadView(String view) throws Exception {
		String viewFile = 
			String.format(
				"C:\\Users\\user\\git\\repository2\\Web58\\src\\main\\webapp\\views\\%s.html", 
				view);
		FileReader reader = new FileReader(viewFile);
		BufferedReader br = new BufferedReader(reader);
		String line = null; StringBuffer sb = new StringBuffer();
		while ((line = br.readLine()) != null) {
			sb.append(line);
		}
		return sb.toString();
	}
	public static String sayYa() {
		return "Ya";
	}
	public static String sayYa(String name) {
		return String.format("Ya! %s<br />", name);
	}
	
	public static String calc(String x, String y, String op) {
		
		return (int)(Math.random()*100) + "";
	}
	
}
