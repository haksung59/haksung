package aaa.model;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class Applicant {

	String id, name, up2;
	
	MultipartFile upfile1;
	MultipartFile upfile2;
	
	
//	public String getUp2() {
//			
//		if(upfile2!=null) {
//			
//			String filename = upfile2.getOriginalFilename();
//			//System.out.println(filename);
//			String[] file2sp = filename.split("");
//			String file_extension = "";
//			
//			
//			for(int i=file2sp.length-4; i<file2sp.length; i++) {
//				file_extension += file2sp[i];
//			}
//			//System.out.println(file_extension);
//			
//			if(file_extension.equals(".png")||file_extension.equals(".jpg")||file_extension.equals("jpeg")||file_extension.equals(".gif")||
//					file_extension.equals(".bmp")) {
//				return upfile2.getOriginalFilename();
//			}
//			
//		}else {
//		return null;
//		}
//		return null;
//	}
	
	
	
	
	
}
