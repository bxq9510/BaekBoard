package com.hm.brd001;

import java.util.Locale;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hm.VO.BrdVO;
import com.hm.VO.ComVO;
import com.hm.service.IF_BrdService;
import com.hm.service.IF_ComService;

@Controller
public class BrdController {
	@Inject
	private IF_BrdService brdService;
	@Inject
	private IF_ComService comService;
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String brdForm(Locale locale, Model model) throws Exception{
		return "/brdForm";		
	}
	// 메인화면 이동
	@RequestMapping(value = "/brdForm", method = RequestMethod.GET)
	public String brdMain(Locale locale, Model model) throws Exception{
		return "/brdForm";		
	}
	@RequestMapping(value = "/brdInput", method = RequestMethod.GET)
	public String brdInput(Locale locale, Model model) throws Exception{
		return "bbs/brdInput";		
	}
	// insert into brd	values (brd_seq.nextval, #{title}, #{name}, #{memo}, 0, default)
	@RequestMapping(value = "/brdSave", method = RequestMethod.POST)
	public String brdSave(BrdVO brdvo, Locale locale, Model model) throws Exception{
		brdService.insert(brdvo);
		return "redirect:/brdList";
	}
	// select * from brd order by no | update brd set views=views+1 where no = #{vno}
	@RequestMapping(value = "/brdList", method = RequestMethod.GET)
	public String brdList(Locale locale, Model model) throws Exception {
		model.addAttribute("brdList", brdService.brdList());
		return "bbs/brdList";		
	}
	// select * from brd where no = #{vno}
	@RequestMapping(value = "/brdDetail", method = RequestMethod.GET)
	public String brdDetail(Locale locale, Model model, @RequestParam("vno") int vno) throws Exception {
		model.addAttribute("oneData", brdService.brdDetail(vno));
		model.addAttribute("comList", comService.comList(vno));
		return "bbs/brdDetail";
	}
	@RequestMapping(value = "/comSave", method = RequestMethod.POST)
	public String comSave(@RequestParam("vno") int vno, ComVO comvo, Locale locale, Model model) throws Exception {
		comService.insert(comvo);
		return "redirect:/brdDetail?vno="+vno;
	}
	// delete from brd where no = #{vno}
	@RequestMapping(value = "/brdDelete", method = RequestMethod.GET)
	public String brdDelete(@RequestParam("vno") int vno, Locale locale, Model model) throws Exception {
		brdService.delete(vno);
		return "redirect:/brdList";
	}
	@RequestMapping(value = "/brdMod", method = RequestMethod.GET)
	public String brdModinput(@RequestParam("vno") int vno, Locale locale, Model model) throws Exception {
		model.addAttribute("oneData", brdService.modBrdForm(vno));
		return "bbs/brdModInput";
	}
	// update brd set title=#{title}, memo=#{memo} where no = #{no}
	@RequestMapping(value = "/brdModSave", method = RequestMethod.POST)
	public String brdMod(BrdVO brdvo, Locale locale, Model model) throws Exception {
		brdService.update(brdvo);
		return "redirect:/brdList";
	}
}

