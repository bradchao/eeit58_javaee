package tw.brad.eeit58;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.brad.api.Brad17;

@WebServlet("/Brad16")
public class Brad16 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		// 1. 接收參數
		String x = request.getParameter("x");
		String y = request.getParameter("y");
		
		// 2. 演算法 Brad17
		try {
			Brad17 model = new Brad17(x, y);
			int result = model.plus();
			request.setAttribute("result", result);
		}catch(Exception e) {
			request.setAttribute("result", 0);
			System.out.println(e.toString());
		}
		
		// 3. 呈現 View
		RequestDispatcher dispatcher = request.getRequestDispatcher("Brad18");
		dispatcher.forward(request, response);
	
	}

}
