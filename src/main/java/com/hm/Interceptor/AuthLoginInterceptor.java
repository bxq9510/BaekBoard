package com.hm.Interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AuthLoginInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session = request.getSession(); // 세션 id 가져오기
		Object obj = session.getAttribute("usrId");
		if (obj == null) { // 로그인을 안 한 사람.. 클라이언트의 세션 id로 세션값을 가져올때 null값
			// 로그인 안되어 있기 때문에 로그인으로 컨트롤러를 돌려버리는 것
			response.sendRedirect(request.getContextPath()+"/login");
			return false; // 원래 호출한 컨드롤러를 인터셉트하여 다른 컨트롤러를 호출, 그러니 원래 호풀한 컨트롤러를 호출하지 마라!
		}
		return true; 
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		super.afterCompletion(request, response, handler, ex);
	}
	
}
