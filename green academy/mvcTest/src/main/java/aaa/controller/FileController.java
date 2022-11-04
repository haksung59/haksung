package aaa.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import aaa.model.Applicant;
import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;


@Controller
@RequestMapping
public class FileController {

	@RequestMapping("/fileForm")
	@GetMapping
	String form() {
		
		return "form/fileForm";
	}
	
	
	@RequestMapping("/file")
	@PostMapping
	String file(
			HttpServletRequest request, Applicant ap, Model mm) {
		
		ArrayList<String> imgExt = new ArrayList<>();
		imgExt.add("image/jpeg");
		imgExt.add("image/jpg");
		imgExt.add("image/bmp");
		imgExt.add("image/gif");
		imgExt.add("image/png");
		
		if(!imgExt.contains(ap.getUpfile2().getContentType().toLowerCase().trim())) {
			mm.addAttribute("msg", "이미지 파일만 업로드 해주세요");
			mm.addAttribute("url", "/jobAppForm");
			return "alert";
		}
		
		if(ap.getUpfile2().getSize() > 100000) {
			mm.addAttribute("msg", "파일 용량이 너무 큽니다.");
			mm.addAttribute("url", "/jobAppForm");
			return "alert";
		}

//		fileUpload(request, ap.getUpfile1());
//		fileUpload(request, ap.getUpfile2());
		
		ap.setUp2(fileUpload(request, ap.getUpfile2()));
		
		
		return "form/fileComplete";
	}
	
	
	
	String fileUpload(HttpServletRequest request, MultipartFile ff) {
		
		String res = ff.getOriginalFilename();
		
		int pos = res.lastIndexOf(".");
		String fName = res.substring(0,pos);
		String ext = res.substring(pos);
		System.out.println(fName);
		System.out.println(ext);
		
		int cnt = 1;
		
		String path = request.getRealPath("/up") + "/";
		System.out.println(path);
		//path = "C:\\workspace\\Springwork\\mvcTest\\src\\main\\webapp\\up";
		
		File file = new File(path + res);
		while(file.exists()) {
			System.out.println("파일 존재");
			
			res = fName + "_" + cnt + ext;
			cnt++;
			
			System.out.println(res);
			
			file = new File(path+res);
		}
		
		try {
			FileOutputStream fos = new FileOutputStream(path + res);
			fos.write(ff.getBytes());
			fos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return res;
	}
}