package aaa.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import aaa.db.BoardMapper;

@Controller
public class BoardController {
	
	@Resource
	BoardMapper mapper;
	
	@RequestMapping("/board/list")
	ModelAndView list() {
		
		ModelAndView mav = new ModelAndView("board/list");
		mav.addObject("mainData", mapper.bblist());
		
		return mav;
	}

}
