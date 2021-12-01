package com.hm.brd001;

import java.util.Locale;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hm.VO.BrdVO;
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
	@RequestMapping(value = "/usrDelete", method = RequestMethod.GET)
	public String usrDelete(@RequestParam("uid") String uid, Locale locale, Model model) throws Exception {
		usrService.usrDel(uid);
		return "redirect:/usrList";
	}
	@RequestMapping(value = "/usrMod", method = RequestMethod.GET)
	public String usrMod(@RequestParam("uid") String uid, Locale locale, Model model) throws Exception {
		model.addAttribute("oneData", usrService.usrModForm(uid));
		return "usr/usrModInput";
	}
	@RequestMapping(value = "/usrModSave", method = RequestMethod.POST)
	public String usrModSave(UsrVO usrvo, Locale locale, Model model) throws Exception {
		usrService.update(usrvo);
		return "redirect:/usrList";
	}
}
