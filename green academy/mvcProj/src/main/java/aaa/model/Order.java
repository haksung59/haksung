package aaa.model;

import java.util.ArrayList;

import lombok.Data;

@Data
public class Order {

	ArrayList<Product> product;
	
	Address addr;
}
