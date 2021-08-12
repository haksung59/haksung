package aaa.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service("notice")
public class Notice implements TVService{

	@Override
	public Object execute() {
		ArrayList<String> notice = new ArrayList<>();
		notice.add("목록");
		notice.add("상세");
		notice.add("수정");
		notice.add("삭제");
		notice.add("글쓰기");
		return notice;
	}
}

