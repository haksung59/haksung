package jsontestProj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MenuDAO {

	String sql;
	Connection con;
	PreparedStatement ptmt;
	ResultSet rs;
	
	public MenuDAO() {
		
		try {
			String username = "jsp";
			String pw = "1234";
			String url = "jdbc:mysql://localhost:3306/jspweb?characterEncoding=utf-8";
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url, username, pw);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<MenuVO> list(String search){
		
		ArrayList<MenuVO> res = new ArrayList<>();
		
		sql = "select * from drink where kind = ? order by id";
		
		try {
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, search);
			rs = ptmt.executeQuery();
			
			while(rs.next()) {
				
				MenuVO vo = new MenuVO();
				
				vo.setId(rs.getInt("id"));
				vo.setName(rs.getString("name"));
				vo.setKind(rs.getString("kind"));
				vo.setPrice(rs.getInt("price"));
				
				res.add(vo);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return res;
	}
	
	
	
	public void close() {
		if(rs!=null) try {rs.close();} catch (SQLException e) {e.printStackTrace();}
		if(ptmt!=null) try {ptmt.close();} catch (SQLException e) {e.printStackTrace();}
		if(con!=null) try {con.close();} catch (SQLException e) {e.printStackTrace();}
	}
}
