package aaa.service;

import org.springframework.stereotype.Service;

@Service("detail")
public class NoticeDetail implements NoticeService{

	@Override
	public Object execute() {
		System.out.println("NoticeDetail.execute()  실행");
		return "NoticeDetail 실행 데이터";
	}

}
