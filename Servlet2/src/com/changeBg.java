package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ChangeBg")
public class changeBg extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
	    String s1 = request.getParameter("color");

	    
// css에 넣어서 하는 방법	    
		out.println("<html>");
		out.println("<head>");
		out.println("<style>");
		out.println("body{");
		out.println("background-color : " + s1 +";");
		out.println("}");
		out.println("</style>");
			
		out.println("</head>");
		
		out.println("<body>");

// body에 바로 속성 메겨서 하는 방법, 여기선 이게 더 편한 듯
//		out.println("<body bgcolor ='" + s1 + "'>");
		out.println("</body>");
		out.println("</html>");
		
	}
}
