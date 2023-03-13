package tw.brad.api;

import java.io.BufferedReader;
import java.io.FileReader;

public class BradUtils {
	public static String loadView() throws Exception {
		String viewFile = "C:\\Users\\user\\git\\repository2\\Web58\\src\\main\\webapp\\views\\view1.html";
		FileReader reader = new FileReader(viewFile);
		BufferedReader br = new BufferedReader(reader);
		String line = null; StringBuffer sb = new StringBuffer();
		while ((line = br.readLine()) != null) {
			sb.append(line);
		}
		return sb.toString();
	}
}
