package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GooGooResult")
public class gugudan extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
	
		String c = request.getParameter("color");
	    int n1 = Integer.parseInt(request.getParameter("start"));
	    int n2 = Integer.parseInt(request.getParameter("end"));

//		받아온 변수들 잘 들어왔는지 한 번 확인해보는 부분, html 실행하고 나서 다시 이 곳으로 돌아오면 콘솔창에 받아온 값들이 찍혀있다.	    
//	    System.out.println(c);
//	    System.out.println(n1);
//	    System.out.println(n2);
	    
	    
		out.println("<html><body>");
		out.println("<table border = '1px solid black' bgcolor ='" + c + "'>");
		
		for(int j = n1; j <= n2; j++) {
			out.println("<tr>");
			for(int i = 1; i <= 9; i++) {
				out.println("<td>");
				out.println(j + " * " + i + " = " + (j * i));
				out.println("</td>");
			}
			out.println("</tr>");
		}
		out.println("</table>");
		out.println("</body></html>");
	    
	}

}
