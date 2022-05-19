package aaa.controll;

import java.io.File;
import java.io.FileOutputStream;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import aaa.model.Stud;

@Controller
public class FileController {

	@RequestMapping("/fileForm")
	String form() {
		
		File ff = new File("D:\\public\\green\\2021_06\\workspace\\springWork\\mvcProj\\src\\main\\webapp\\up\\1.jpg");
		
		System.out.println(ff.exists());
		
		return "form/fileForm";
	}
	
	@RequestMapping("/file1")
	String file1(String pid, int age, MultipartFile upfile1,  MultipartFile upfile2, 
			     HttpServletRequest request,
			     Model mm) {
		
		System.out.println("param 방식:"+pid+","+age+","+upfile1+","+upfile2);
		System.out.println(upfile1.getOriginalFilename());
		System.out.println(upfile1.getName());
		System.out.println(upfile1.getContentType());
		System.out.println(upfile1.getSize());
		System.out.println(upfile1.isEmpty());
		
		fileUpload(request, upfile1);
		fileUpload(request, upfile2);
		
		//request.setAttribute();
		mm.addAttribute("zxcv", "모델 보낸다");
		mm.addAttribute("upfile1", upfile1.getOriginalFilename());
		mm.addAttribute("upfile2", upfile2.getOriginalFilename());
		
		return "form/fileComplete1";
	}
	
	
	
	@RequestMapping("/file2")
	String file2(
			MultipartHttpServletRequest mr,
			HttpServletRequest request,
		    Model mm) {
		
		MultipartFile upfile1 = mr.getFile("upfile1");
		MultipartFile upfile2 = mr.getFile("upfile2");
		
		String pid = mr.getParameter("pid");
		String age = mr.getParameter("age");
		System.out.println("MultipartHttpServletRequest 방식:"+pid+","+age+","+upfile1+","+upfile2);
		
		fileUpload(request, upfile1);
		fileUpload(request, upfile2);
		
		//request.setAttribute();
		mm.addAttribute("zxcv", "모델 보낸다");
		mm.addAttribute("upfile1", upfile1.getOriginalFilename());
		mm.addAttribute("upfile2", upfile2.getOriginalFilename());
		
		
		return "form/fileComplete1";
	}
	
	
	
	
	@RequestMapping("/file3")
	String file3(HttpServletRequest request, Stud st) {

		System.out.println(st);
		
		fileUpload(request, st.getUpfile1());
		fileUpload(request, st.getUpfile2());
		
		return "form/fileComplete3";
	}
	
	
	
	void fileUpload(HttpServletRequest request, MultipartFile ff) {
		String path = request.getRealPath("/up");
		System.out.println(path);
		//path = "D:\\public\\green\\2021_06\\workspace\\springWork\\mvcProj\\src\\main\\webapp\\up";
		
		try {
			FileOutputStream fos = new FileOutputStream(path+"/"+ff.getOriginalFilename());
			fos.write(ff.getBytes());		
			fos.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
