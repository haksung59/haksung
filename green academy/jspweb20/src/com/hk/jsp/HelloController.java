package com.hk.jsp;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.*;
import javax.servlet.http.*;
import com.hk.jsp.vo.*;


public class HelloController extends HttpServlet {
	
	// doGet, doPost
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		
		//jsp처럼 클라이언트 요청을 받는 페이지이므로
		response.setContentType("text/html; charset=UTF-8");
		
		/*
		 * PrintWriter out = response.getWriter();
		 * out.println("<h3>Hello Controller</h3>");
		 */
		// 대신
		
		// 서블릿에서 선언한 변수
		String data = "서블릿에서 만들 문자열입니다";
		int score = 80;
		// 객체변수 
		MemberVo mypage = new MemberVo();
		mypage.setId("kevin");
		mypage.setPwd("1234");
		
		// url을 분기 -> hello.do 나  test.do 등등 여러개 분기해서 사용
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		//System.out.println("uri="+uri);
		//System.out.println("conPath="+conPath);
		String commend = uri.substring(conPath.length());
		System.out.println("commend="+commend);
		
		RequestDispatcher rd;
		String viewpage = "";
		
		if(commend.equals("/hello.do")) {
			viewpage = "/views/hello.jsp";
			request.setAttribute("result", data);
			request.setAttribute("num", score);
			request.setAttribute("myinfo", mypage); // 참조변수 전달
		}else if(commend.equals("/test.do")) {
			//정적배열
			String[] week = {"월","화","수","목","금","토","일"};
			request.setAttribute("weekday", week);
			viewpage = "/views/test.jsp";
		}else if(commend.equals("/list.do")) {
			List<String> food = new ArrayList<String>();
			food.add("짬뽕");
			food.add("스파게티");
			food.add("짜장면");
			request.setAttribute("foodlist", food);
			viewpage="/views/list.jsp";
		}else if(commend.equals("/compare.do")) {
			int english = 65;
			int java = 85;
			request.setAttribute("score", english);
			request.setAttribute("score2", java);
			viewpage = "/views/compare.jsp";
		}else { // 해당되는 페이지가 없는 경우
			viewpage = "/views/error.jsp";
		}
		// jsp화면으로 넘기기 
		rd = getServletContext().getRequestDispatcher(viewpage);
		rd.forward(request, response);
		
		
	}
	

}
