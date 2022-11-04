package aaa.controll;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import aaa.model.URLData;

@Controller
public class ModelShopController {
	
	
	@ModelAttribute("topData")
	Object topData() {
		ArrayList<URLData> res = new ArrayList<>();
		res.add(new URLData("/model/shop/info/hello?cate=info", "회사소개"));
		res.add(new URLData("/model/shop/productList?cate=product", "제품정보"));
		
		res.add(new URLData("/model/shop/galleryList?cate=gallery", "갤러리"));
		res.add(new URLData("/model/shop/center/notice?cate=center", "고객센터"));
		return res;
	}
	
	
	
	@ModelAttribute("menuData")
	Object menuList(@RequestParam(value="cate", defaultValue = "info")String cate) {
		
		ArrayList<String> info = new ArrayList<>();
		info.add("인사말");
		info.add("연혁");
		info.add("오시는 길");
		
		ArrayList<String> product = new ArrayList<>();
		product.add("제품목록");
		
		ArrayList<String> gallery = new ArrayList<>();
		gallery.add("갤러리목록");
		
		ArrayList<String> center = new ArrayList<>();
		center.add("공지사항");
		center.add("자주찾는질문");
		center.add("질문및답변");
		
		
		HashMap<String, ArrayList<String>>res = new HashMap<>();
		res.put("info", info);
		res.put("product", product);
		res.put("gallery", gallery);
		res.put("center", center);
		
		return res.get(cate);
	}

	
	@RequestMapping("/model/shop/info/hello")
	String infoHello(Model mm) {
		
		mm.addAttribute("main","info/hello");
		return "model/shop/template";
	}
	
	@RequestMapping("/model/shop/productList")
	String productList(Model mm) {
		
		mm.addAttribute("main","product/productList");
		
		return "model/shop/template";
	}
	
	@RequestMapping("/model/shop/galleryList")
	String galleryList(Model mm) {
		
		mm.addAttribute("main","gallery/galleryList");
		
		return "model/shop/template";
	}

	@RequestMapping("/model/shop/center/notice")
	String centerNotice(Model mm) {
		
		mm.addAttribute("main","center/notice");
		
		return "model/shop/template";
	}
}
