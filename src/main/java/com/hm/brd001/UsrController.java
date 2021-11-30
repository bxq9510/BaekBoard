package com.hm.brd001;

import java.util.Locale;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hm.VO.UsrVO;
import com.hm.service.IF_UsrService;

@Controller
public class UsrController {
	@Inject
	private IF_UsrService usrService = null;
	@RequestMapping(value = "/addUsrForm", method = RequestMethod.GET)
	public String usrForm(Locale locale, Model model) throws Exception{
		return "usr/usrInput";		
	}
	@RequestMapping(value = "/usrSave", method = RequestMethod.POST)
	public String usrSave(UsrVO usrvo, Locale locale, Model model) throws Exception{
		usrService.insert(usrvo);
		return "/brdForm";
	}
	@RequestMapping(value = "/usrList", method = RequestMethod.GET)
	public String usrList(Locale locale, Model model) throws Exception{
		model.addAttribute("usrList", usrService.usrList());
		return "usr/usrList";
	}
}
