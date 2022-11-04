package aaa.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class Tv_TV  implements TVInterface {

	@Override
	public Object execute() {
		ArrayList<String> res = new ArrayList<>();
		res.add("목록");
		res.add("상세");
		res.add("구매");
		return res;
	}
}
