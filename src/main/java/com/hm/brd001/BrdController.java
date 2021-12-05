package com.hm.brd001;

import java.util.Locale;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hm.VO.BrdVO;
import com.hm.VO.PageVO;
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
	public String brdList(PageVO pagevo, Locale locale, Model model) throws Exception {
		// 처음에 페이지 번호를 넘기지 않을 경우
		if (pagevo.getPage() == null) {
			pagevo.setPage(1); // 클라이언트가 보낸 파라미터가 자동 매핑되고 해당 변수값을 가져온 후 null로 인지 체크
		} // page 정보
		pagevo.setPerPageNum(10); // page당 출력할 게시물 수
		pagevo.setTotalCount(55); //전체 게시글 수
		System.out.println("전쳬페이지수 : "+brdService.brdcnt());
		model.addAttribute("brdList", brdService.brdList(pagevo));
		model.addAttribute("pageVO", pagevo);
		return "bbs/brdList";		
	}
	
	
	
	// select * from brd where no = #{vno}
	@RequestMapping(value = "/brdDetail", method = RequestMethod.GET)
	public String brdDetail(Locale locale, Model model, @RequestParam("vno") int vno) throws Exception {
		model.addAttribute("oneData", brdService.brdDetail(vno));
		model.addAttribute("comList", comService.comList(vno));
		return "bbs/brdDetail";
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

