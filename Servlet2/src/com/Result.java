package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Result")
public class Result extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// html page로 응답할때 html문서에 한글을 작성해야 한다면
		response.setCharacterEncoding("EUC-KR");

		// client로부터 요청한 데이터를 인코딩 해줄때(post 방식의 인코딩)
		request.setCharacterEncoding("EUC-KR");
		String text = request.getParameter("text");
		System.out.println(text);
	
	}

}
