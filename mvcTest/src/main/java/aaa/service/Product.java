package aaa.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service("product")
public class Product implements TVService{

	@Override
	public Object execute() {
		ArrayList<String> product = new ArrayList<>();
		product.add("목록");
		product.add("상세");
		product.add("구매");
		return product;
	}
}

