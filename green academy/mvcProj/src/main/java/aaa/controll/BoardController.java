package aaa.controll;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import aaa.db.BoardMapp;
import aaa.model.BoardVO;
import aaa.model.BoardVOList;
import aaa.model.PageInfo;

@Controller
public class BoardController {
	
	@Resource
	BoardMapp mapper;
	
	@RequestMapping("/board/list")
	ModelAndView list(BoardVO vo, PageInfo pageInfo) {
		
		ModelAndView mav = new ModelAndView("board/list");
		
		pageInfo.setTotal(mapper.bbTotal());
		
		System.out.println("pageInfo : " +pageInfo);
		System.out.println("pageInfo.getTotalPage() : "+ pageInfo.getTotalPage());
		
		mav.addObject("mainData", mapper.bblist(pageInfo));
		//mav.addObject("mainData", mapper.bblist2(vo));
		
		return mav;
	}

	@RequestMapping("/board/detail")
	ModelAndView detail(BoardVO vo) {
	//ModelAndView detail(@RequestParam("no") int no) {
		
		ModelAndView mav = new ModelAndView("board/detail");
		
		mapper.addCount(vo);
		mav.addObject("mainData", mapper.bbDetail(vo));
		
		return mav;
	}
	
	

	
	@RequestMapping("/board/writeForm")
	String writeForm() {
		
		return "board/writeForm";
	}
	
	
	@RequestMapping("/board/writeListForm")
	String writeListForm() {
		
		return "board/writeListForm";
	}
	
	
	@RequestMapping("/board/writeReg")
	ModelAndView writeReg(BoardVO vo) {
		
		ModelAndView mav = new ModelAndView("alert");
		//int cnt = mapper.bbInsert(vo);
		int cnt = mapper.bbInsert2(vo);
		System.out.println("writeReg cnt : "+cnt);
		//System.out.println(vo.getNo());
		
		mav.addObject("msg","작성되었습니다.");
		//mav.addObject("url", "list");
		mav.addObject("url", "detail?no="+vo.getNo());
		
		return mav;
	}
	
	@RequestMapping("/board/writeListReg")
	ModelAndView writeListReg(BoardVOList vo) {
		
		ModelAndView mav = new ModelAndView("alert");
		System.out.println(vo);
		int cnt = mapper.bbInsertList(vo);
		System.out.println("writeReg cnt : "+cnt);
		mav.addObject("msg","작성되었습니다.");
		mav.addObject("url", "list");
		
		return mav;
	}
	
	

	@RequestMapping("/board/modifyForm")
	ModelAndView modifyForm(BoardVO vo) {
		
		ModelAndView mav = new ModelAndView("board/modifyForm");
		mav.addObject("mainData", mapper.bbDetail(vo));
		
		return mav;
	}
	
	@RequestMapping("/board/modifyReg")
	ModelAndView modifyReg(BoardVO vo) {
		
		ModelAndView mav = new ModelAndView("alert");
		int cnt = mapper.bbmodify(vo);
		
		System.out.println("modifyReg cnt : "+cnt);
		
		String msg = "암호가 일치하지 않습니다.";
		String url = "modifyForm?no="+vo.getNo();
		
		if(cnt>0) {
			msg = "수정되었습니다.";
			url = "detail?no="+vo.getNo();
		}
		
		mav.addObject("msg",msg);
		mav.addObject("url", url);
		
		return mav;
	}
	
	
	
	@RequestMapping("/board/deleteForm")
	String deleteForm(BoardVO vo) {
		
		return "board/deleteForm";
	}
	
	@RequestMapping("/board/deleteReg")
	ModelAndView deleteReg(BoardVO vo) {
		
		ModelAndView mav = new ModelAndView("alert");
		int cnt = mapper.bbdelete(vo);
		
		String msg = "비밀번호를 다시 입력해 주세요.";
		String url = "deleteForm?no="+vo.getNo();

		if(cnt>0) {
			msg = "삭제되었습니다.";
			url = "list";
		}
		
		mav.addObject("msg",msg);
		mav.addObject("url", url);
		
		return mav;
	}

}
