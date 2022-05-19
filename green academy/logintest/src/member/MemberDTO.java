package member;

import java.util.HashMap;

public class MemberDTO {
	
	public int Idpwcheck(String id, String pw) {
		HashMap<String, String> idpw = new HashMap<String, String>(); 
		
		idpw.put("haksung","1234");
		
		int result = 0;
		
		String chkpw = idpw.get(id);
		
		if(pw.equals(chkpw)) {
			result = 1;
		}
		
		
		return result;
	}
	
	public String getName(String id) {
		HashMap<String, String> idname = new HashMap<String, String>();

		idname.put("haksung", "김학성");
		
		String res = "";
		
		res = idname.get(id);
		
		
		return res;
	}

}
