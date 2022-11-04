package aaa.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import aaa.model.URLData;

@Service
public class TVTop implements TVInterface {

	@Override
	public Object execute() {
		// TODO Auto-generated method stub
		ArrayList<URLData> res = new ArrayList<>();
		res.add(new URLData("/tv/info", "회사소개"));
		res.add(new URLData("/tv/TV", "TV"));
		res.add(new URLData("/tv/notice", "공지사항"));
		return res;
	}

}
