package tw.brad.eeit58;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.brad.api.BradUtils;

@WebServlet("/Brad18")
public class Brad18 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String x = request.getParameter("x");
		String y = request.getParameter("y");
		String result;
		int r =  (Integer)request.getAttribute("result");
		
		if (x != null && y != null) {
			result = r + "";
		}else {
			x = y = result = "";
		}
		
		//---------------
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		try {
			String content = BradUtils.loadView();
			out.printf(content, x, y, result);
		}catch (Exception e) {
			out.print("ERROR1");
		}
		
		response.flushBuffer();
	}

}
