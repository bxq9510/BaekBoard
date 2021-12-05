package com.hm.brd001;

import java.util.Locale;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hm.VO.UsrVO;
import com.hm.service.IF_UsrService;

@Controller
public class LoginController {
	@Inject
	private IF_UsrService usrService = null;
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Locale locale, Model model) throws Exception{
		return "login/loginForm";		
	}
	@RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	public String loginProcess(UsrVO usrvo, HttpServletRequest request, Locale locale, Model model) throws Exception{
		String targetUrl = "";
		UsrVO tempUsrvo = usrService.usrModForm(usrvo.getId());
		if (tempUsrvo == null) {
			System.out.println("아이디가 없다");
			targetUrl = "login/loginForm";
		}else {
			if (tempUsrvo.getPw().equals(usrvo.getPw())) {
				System.out.println("로그인 성공");
				HttpSession session = request.getSession();
				session.setAttribute("usrName", tempUsrvo.getName());
				session.setAttribute("usrId", tempUsrvo.getId());
				targetUrl = "redirect:/";
			}else {
				System.out.println("비밀번호가 틀렸다");
				targetUrl = "login/loginForm";
			}
		}
		return targetUrl;		
	}
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpServletRequest request, Locale locale, Model model) throws Exception{
		HttpSession session = request.getSession();
		session.invalidate();
		return "redirect:/";		
	}
}
