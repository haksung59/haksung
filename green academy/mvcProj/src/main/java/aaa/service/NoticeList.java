package aaa.service;

import org.springframework.stereotype.Service;

@Service("list")
public class NoticeList implements NoticeService{

	@Override
	public Object execute() {
		System.out.println("NoticeList.execute()  실행");
		return "NoticeList 실행 데이터";
	}
}
