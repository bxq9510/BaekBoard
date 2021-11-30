package com.hm.brd001;

import java.util.Locale;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hm.VO.ComVO;
import com.hm.service.IF_ComService;

@Controller
public class ComController {
	@Inject
	private IF_ComService comService;

}
