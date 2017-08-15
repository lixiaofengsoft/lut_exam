package com.sky.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginFilter implements Filter{

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("doFilter");
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		//如果request有对应的session,则返回这个session,如果request没有对应的session,则返回null
		HttpSession session = req.getSession(false);
		System.out.println(session+"======"+session.getAttribute("manager"));
		System.out.println("1"+session==null);
		System.out.println("2"+session.getAttribute("manager")==null);
		if(session==null||session.getAttribute("manager")==null){
			
			System.out.println("---");
				res.sendRedirect(req.getContextPath()+"/login2");
				//req.getRequestDispatcher("/login2").forward(request, response);
		}else{
			System.out.println("chain");
			chain.doFilter(request, response);
		}
	}

	@Override
	public void destroy() {
	}

}
