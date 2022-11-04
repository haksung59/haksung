package aaa.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.HandlerInterceptor;

@Service
public class AdminIntercep implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		
		System.out.println("AdminIntercep.preHandle() 진입");
		
		
		 HttpSession session = request.getSession();
		 
		 String id = (String)session.getAttribute("id");
		 
		 
		 if(session.getAttribute("mem")==null) {  //로그인 하지 않았다면
			 System.out.println("관리자 페이지 접근 실패");
			 response.sendRedirect("/qwer");
			 return false;
		}else if(id.equals("root")) {
			return true;
		}else {
			System.out.println("관리자 페이지 접근 실패");
			response.sendRedirect("/qwer");
			return false;
		}
		
		
		
	}
	
	
}
