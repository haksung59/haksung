package com.hk.jsp.dao;

import java.sql.*;
import java.util.*;

import com.hk.jsp.vo.BoardVo;

public class BoardDao {
	
	static String driveName = "oracle.jdbc.driver.OracleDriver";
	static String url = "jdbc:oracle:thin:@localhost:1521:XE";
	static String user = "java";
	static String password = "1234";
	
	private static Connection conn = null;
	private static Statement stmt = null;
	private static PreparedStatement pstmt = null;
	private static ResultSet rs = null;
	private static BoardDao instance = new BoardDao();	//자신의 클래스에 대한 참조변수
	
	private BoardDao() {}	//생성자
	
	public static BoardDao getInstance() {
		return instance;
	}
	
	private void ConnectDB() throws Exception {
		Class.forName(driveName);
		System.out.println("오라클 드라이버 로딩 성공");
		if(conn==null) {	//접속 안된 상태
			conn  = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			System.out.println("오라클 접속 성공");
		}
	}
	
	private void closeDB() {
		
		try {
			if(conn!=null) {conn.close(); conn=null;}
			if(stmt!=null) {stmt.close(); stmt=null;}
			if(pstmt!=null) {pstmt.close(); pstmt=null;}
			if(rs!=null) {rs.close(); rs=null;}
			System.out.println("오라클 접속 종료 완료");
		}catch(Exception e) {
			System.out.println("오라클 접속 종료 오류");
		}
	}
	//noticelist.jsp
	public List<BoardVo> getBoardList(String sort, String keyword) throws Exception {
		//정렬변수
		//검색어변수
		List<BoardVo> rst = new ArrayList<BoardVo>();
		ConnectDB();
		//sql
		String sql = "select no, title, contents, write_id, " +
				"write_name, to_char(regdate,'YYYY.MM.DD') as regdate, " +
				"votes, views from board where title like '%"+keyword+"%' order by "+sort+" desc";
		rs = stmt.executeQuery(sql);
		while(rs.next()) {
			BoardVo row = new BoardVo();
			row.setNo(rs.getInt("no"));
			row.setTitle(rs.getString("title"));
			row.setContents(rs.getString("contents"));
			row.setWrite_id(rs.getString("write_id"));
			row.setWrite_name(rs.getString("write_name"));
			row.setRegdate(rs.getString("regdate"));
			row.setVotes(rs.getInt("votes"));
			row.setViews(rs.getInt("views"));
			rst.add(row);
		}
		
		closeDB();
		return rst;
	}
	
	//noticeshow.jsp 게시물읽기
	public BoardVo getBoardByNo(String no) throws Exception {
		BoardVo rst = new BoardVo();
		ConnectDB();
		String sql = String.format("select no, title, contents, "+ 
						"write_name, to_char(regdate,'YYYY.MM.DD HH:mm') as regdate, "+ 
							"views, attatch1 from board where no='%s'", no);
		rs = stmt.executeQuery(sql);
		while(rs.next()) {
			rst.setNo(rs.getInt("no"));
			rst.setTitle(rs.getString("title"));
			rst.setWrite_name(rs.getString("write_name"));
			rst.setRegdate(rs.getString("regdate"));
			rst.setViews(rs.getInt("views"));
			rst.setContents(rs.getString("contents"));
			rst.setAttatch1(rs.getString("attatch1"));
		}
		closeDB();
		return rst;
	}
	
	//noticeshow.jsp 조회 1증가
	public void increaseBoardNo(String no) throws Exception {
		ConnectDB();
		String sql = String.format("update board set views=views+1 where no='%s'", no);
		int res = stmt.executeUpdate(sql);
		closeDB();
	}
	
	// noticewrtpro.jsp 데이터vo 저장
	public int saveBoard(BoardVo brdvo) throws Exception {
		int rst=0;
		ConnectDB();
		StringBuffer sb = new StringBuffer("");
		sb.append("insert into board (no,title,write_name,contents,attatch1,write_id,regdate)");
		sb.append("\n values (seq_board.nextval, ?, ?, ?, ?, 'admin', sysdate) ");
		String sql = sb.toString();
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, brdvo.getTitle());
		pstmt.setString(2, brdvo.getWrite_name());
		pstmt.setString(3, brdvo.getContents());
		pstmt.setString(4, brdvo.getAttatch1());
		rst = pstmt.executeUpdate();
		closeDB();
		return rst;
	}
	
	//noticevote.jsp 추천 증가
	public int increaseBoardVote(String no) throws Exception {
		int rst = 0;
		//String no = "1"; // 1번게시물 추천
		ConnectDB();
		String sql = "update board set votes = votes+1 where no=" + no;
		rst = stmt.executeUpdate(sql);
		closeDB();
		return rst;
	}

}