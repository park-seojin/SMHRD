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
		// html page�� �����Ҷ� html������ �ѱ��� �ۼ��ؾ� �Ѵٸ�
		response.setCharacterEncoding("EUC-KR");

		// client�κ��� ��û�� �����͸� ���ڵ� ���ٶ�(post ����� ���ڵ�)
		request.setCharacterEncoding("EUC-KR");
		String text = request.getParameter("text");
		System.out.println(text);
	
	}

}
