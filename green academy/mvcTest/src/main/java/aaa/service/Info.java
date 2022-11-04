package aaa.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service("info")
public class Info implements TVService{

	@Override
	public Object execute() {
		ArrayList<String> info = new ArrayList<>();
		info.add("인사말");
		info.add("연혁");
		info.add("오시는길");
		return info;
	}
}

