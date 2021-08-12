package aaa.model;

import lombok.Data;

@Data
public class Product {

	String name;
	
	Integer price, cnt;
	
	public Integer getTot() {
		return price * cnt;
	}
}
