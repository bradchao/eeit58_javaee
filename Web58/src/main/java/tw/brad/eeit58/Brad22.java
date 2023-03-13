package tw.brad.eeit58;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Brad22")
public class Brad22 extends HttpServlet {
	private static final int CHECK_OK = 1; 
	private static final int CHECK_ERROR_ACCOUNT = 2; 
	private static final int CHECK_ERROR_PASSWORD = 3; 
	private static final int CHECK_EXCEPTION = 4; 
	
	private Connection conn;
	
	public Brad22() {
		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "root");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/iii", prop);
			System.out.println("OK");
		}catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//super.service(req, resp);
		
		req.setCharacterEncoding("UTF-8");
		
		String account = req.getParameter("account");
		String passwd = req.getParameter("passwd");
		
		int result = checkAccount(account, passwd);
		switch (result) {
			case CHECK_OK:
				resp.sendRedirect("brad23.html");
				break;
			case CHECK_EXCEPTION:
				
				break;
			case CHECK_ERROR_ACCOUNT:
				resp.sendRedirect("brad22.html");
				break;
			case CHECK_ERROR_PASSWORD			:
				
				break;
		}
		
		
	}
	
	private int checkAccount(String account, String passwd) {
		
		return CHECK_OK;
	}
	
}
