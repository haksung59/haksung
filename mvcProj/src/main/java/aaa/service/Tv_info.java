package aaa.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class Tv_info  implements TVInterface {

	@Override
	public Object execute() {
		ArrayList<String> res = new ArrayList<>();
		res.add("인사말");
		res.add("연혁");
		res.add("오시는 길");
		return res;
	}
}
