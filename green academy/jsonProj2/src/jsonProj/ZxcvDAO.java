package jsonProj;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Connection;

public class ZxcvDAO {

	String sql;
	Connection con;
	PreparedStatement ptmt;
	ResultSet rs;
	
	public ZxcvDAO() {
		
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
	
	public ArrayList<BoardVO> list(int start, int end){
		
		ArrayList<BoardVO> res = new ArrayList<>();
		
		sql = "select * from zxcv where no >= ? and no <= ? order by no desc";
		
		try {
			ptmt = con.prepareStatement(sql);
			ptmt.setInt(1, start);
			ptmt.setInt(2, end);
			rs = ptmt.executeQuery();
			
			while(rs.next()) {
				
				BoardVO vo = new BoardVO();
				
				vo.setNo(rs.getInt("no"));
				vo.setTitle(rs.getString("title"));
				vo.setPname(rs.getString("pname"));
				vo.setPw(rs.getString("pw"));
				vo.setContent(rs.getString("content"));
				
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
