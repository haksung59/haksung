package aaa.service;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.HandlerInterceptor;

@Service
public class EventIntercep implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		
		System.out.println("EventIntercep.preHandle() 진입");
		
		//return HandlerInterceptor.super.preHandle(request, response, handler);
		
		//return false;
		//return true;
		
		Date chkDay = new Date(2021-1900, 7-1, 30);
		
		boolean res = new Date().before(chkDay);
		
		if(!res) {
			
			response.sendRedirect("fail");
		}
		
		return res;
		
	}
	
	
}
