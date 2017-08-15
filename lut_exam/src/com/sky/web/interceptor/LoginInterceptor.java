package com.sky.web.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter{
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("--------preLoginInterceptor");
		HttpSession session = request.getSession(false);
		if(session==null||session.getAttribute("manager")==null){
			request.getRequestDispatcher("/WEB-INF/jsp/login2.jsp").forward(request, response);
//			response.sendRedirect(request.getContextPath()+"/login2");
			System.out.println("hello");
			return false;
		}
		return true;
	}
	
}
