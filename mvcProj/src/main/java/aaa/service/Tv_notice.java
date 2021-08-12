package aaa.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;
/*
회사소개        TV           공지사항
 --------------------------------------
인사말           목록          목록 
 연혁            상세         상세
오시는길        구매            수정
                            삭제
                            글쓰기
* */

@Service
public class Tv_notice  implements TVInterface {

	@Override
	public Object execute() {
		ArrayList<String> res = new ArrayList<>();
		res.add("목록");
		res.add("상세");
		res.add("수정");
		res.add("삭제");
		res.add("글쓰기");
		return res;
	}
}
