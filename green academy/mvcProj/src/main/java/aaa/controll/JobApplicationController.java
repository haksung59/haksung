package aaa.controll;

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

import aaa.model.Stud;


@Controller
@RequestMapping("/jobAppForm")
public class JobApplicationController {

	@GetMapping
	String form() {
		
		return "form/jobAppForm";
	}
	
	
	@PostMapping
	String complete(Stud st, HttpServletRequest request, Model mm) {
		
		ArrayList<String> imgExt = new ArrayList<>();
		imgExt.add("image/jpeg");
		imgExt.add("image/jpg");
		imgExt.add("image/gif");
		imgExt.add("image/png");
		imgExt.add("image/bmp");
		
		System.out.println(st.getUpfile1().getOriginalFilename());
		System.out.println(st.getUpfile1().getSize());
		
		if(!imgExt.contains(st.getUpfile1().getContentType().toLowerCase().trim() )) {
			mm.addAttribute("msg","이미지 파일만 업로드 해주세요");
			mm.addAttribute("url","/jobAppForm");
			return "alert";
		}
		

		if(st.getUpfile1().getSize() > 100000) {
			mm.addAttribute("msg","파일 용량이 너무 큽니다.");
			mm.addAttribute("url","/jobAppForm");
			return "alert";
		}
		
		st.setUp1(fileUpload(request, st.getUpfile1()));
		
		return "form/jobAppComplete";
	}
	
	
	String fileUpload(HttpServletRequest request, MultipartFile ff) {
		
		String res = ff.getOriginalFilename();
		int pos = res.lastIndexOf(".");
		String fName = res.substring(0,pos);
		String ext = res.substring(pos);
		System.out.println(fName);
		System.out.println(ext);
		int cnt = 1;
		
		String path = request.getRealPath("/up")+"/";
		//path = "D:\\public\\green\\2021_06\\workspace\\springWork\\mvcProj\\src\\main\\webapp\\up/";
		
		System.out.println(path);
		
		File file = new File(path+res);
		while(file.exists()) {
			System.out.println("파일 존재");
			
			res = fName+"_"+cnt+ext;
			cnt++;
			
			System.out.println(res);
			
			file = new File(path+res);
		}
		
		
		
		try {
			FileOutputStream fos = new FileOutputStream(path+res);
			fos.write(ff.getBytes());		
			fos.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return res;
	}
}
