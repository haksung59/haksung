package fxpractice2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Form1 extends Application{
	
	private Statement stmt;
	private PreparedStatement pstmt;
	private Connection conn;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		SplitPane sp = new SplitPane(); sp.setPrefHeight(446); sp.setPrefWidth(950);
		AnchorPane apleft = new AnchorPane(); apleft.setPrefHeight(446); apleft.setPrefWidth(800);
		AnchorPane apright = new AnchorPane(); apright.setPrefHeight(446); apright.setPrefWidth(140);
		GridPane gp = new GridPane();
		
		Label lbl0 = new Label("grade");
		Label lbl1 = new Label("cclass");
		Label lbl2 = new Label("no");
		Label lbl3 = new Label("name");
		Label lbl4 = new Label("score");
		
		lbl0.setPrefWidth(75);lbl1.setPrefWidth(75);lbl2.setPrefWidth(75);
		lbl3.setPrefWidth(75);lbl4.setPrefWidth(75);
		
		gp.addColumn(0, lbl0); gp.addColumn(1, lbl1); gp.addColumn(2, lbl2);
		gp.addColumn(3, lbl3); gp.addColumn(4, lbl4);
		
		Button read = new Button("Read"); read.setLayoutX(53); read.setLayoutY(42);
		Button create = new Button("Create"); create.setLayoutX(53); create.setLayoutY(93);
		Button update = new Button("Update"); update.setLayoutX(53); update.setLayoutY(148);
		Button remove = new Button("Remove"); remove.setLayoutX(53); remove.setLayoutY(211);
		
		TextField grade = new TextField(); gp.addColumn(0, grade);
		TextField cclass = new TextField(); gp.addColumn(1, cclass);
		TextField no = new TextField(); gp.addColumn(2, no);
		TextField name = new TextField(); gp.addColumn(3, name);
		TextField score = new TextField(); gp.addColumn(4, score);
		
		List showList = new ArrayList<>();
		showList.add(new TextField[] {grade, cclass, no, name, score});
		read.setOnAction(e -> {
			try {
				
				List readList = readUser();
				int rsize = readList.size();
				
				String[] outputstr = new String[5];
				TextField[] tf = {null, null, null, null, null};
				
				for(int i=0; i<=rsize; i++) {
					if(i==0) {
						outputstr = (String[])readList.get(i);
						grade.setText(outputstr[0]);cclass.setText(outputstr[1]);no.setText(outputstr[2]);
						name.setText(outputstr[3]);score.setText(outputstr[4]);
					}else if(i==rsize){
						tf[0] = new TextField();
						tf[1] = new TextField();
						tf[2] = new TextField();
						tf[3] = new TextField();
						tf[4] = new TextField();
						gp.addColumn(0, tf[0]); gp.addColumn(1, tf[1]); gp.addColumn(2, tf[2]); gp.addColumn(3, tf[3]); gp.addColumn(4, tf[4]);
						showList.add(tf);
					}else {
						
						outputstr = (String[])readList.get(i);
						tf[0] = new TextField(); tf[0].setText(outputstr[0]);
						tf[1] = new TextField(); tf[1].setText(outputstr[1]);
						tf[2] = new TextField(); tf[2].setText(outputstr[2]);
						tf[3] = new TextField(); tf[3].setText(outputstr[3]);
						tf[4] = new TextField(); tf[4].setText(outputstr[4]);
						
						gp.addColumn(0, tf[0]); gp.addColumn(1, tf[1]); gp.addColumn(2, tf[2]); gp.addColumn(3, tf[3]); gp.addColumn(4, tf[4]);
						showList.add(tf);
					}
					
				}
				
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		create.setOnAction(e -> {
			try {
				createUser(gp, showList);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		update.setOnAction(e -> {
			try {
				updateUser(gp, showList);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		remove.setOnAction(null);
		
		apleft.getChildren().addAll(gp);
		apright.getChildren().addAll(read, create, update, remove);
		
		sp.getItems().add(0, apleft);
		sp.getItems().add(1, apright);
		
		Scene scene = new Scene(sp);
		
		primaryStage.setTitle("Form1");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	private void createUser(GridPane gp, List showList) throws Exception {
		initializeDB();
		int rowcount = gp.getRowCount();
		String query = "select count(*) from user";
		ResultSet rs = stmt.executeQuery(query);
		int cnt = 0;
		if(rs.next()) cnt = rs.getInt(1);
		
		String grade = "";
		String cclass = "";
		String no = "";
		String name = "";
		String score = "";
		
		if(rowcount==2) {
			TextField[] tf = (TextField[])showList.get(0);
			grade = tf[0].getText();
			cclass = tf[1].getText();
			no = tf[2].getText();
			name = tf[3].getText();
			score = tf[4].getText();
			
			String sql = "insert into user values (" + grade + "," + cclass + "," + no + ",'" + name + "','"+score +"')";
			pstmt = conn.prepareStatement(sql);
			
			int result = 0;
			result = pstmt.executeUpdate(sql);
			if(result>0) System.out.println("success create");
		}else if(rowcount-cnt==2) {
			TextField[] tf = (TextField[])showList.get(rowcount-2);
			
			grade = tf[0].getText();
			cclass = tf[1].getText();
			no = tf[2].getText();
			name = tf[3].getText();
			score = tf[4].getText();
			
			String sql = "insert into user values (" + grade + "," + cclass + "," + no + ",'" + name + "','"+score +"')";
			pstmt = conn.prepareStatement(sql);
			
			int result = 0;
			result = pstmt.executeUpdate(sql);
			if(result>0) {
				System.out.println("success create");
				
				for(int i=0; i<tf.length; i++) {
					tf[i] = new TextField();
				}
				showList.add(tf);
				gp.addColumn(0, tf[0]); gp.addColumn(1, tf[1]); gp.addColumn(2, tf[2]); gp.addColumn(3, tf[3]); gp.addColumn(4, tf[4]);
			}
		}
		
	}
	
	private void updateUser(GridPane gp,List showList) throws Exception {
		initializeDB();
		System.out.println("0 : " + ((TextField[])showList.get(0))[3].getText());
		System.out.println("1 : " + ((TextField[])showList.get(1))[3].getText());
		System.out.println(gp.getChildren().contains(showList));
		List dbList = new ArrayList<>();
		
		String query = "select * from user";
		ResultSet rs = stmt.executeQuery(query);
		
		while(rs.next()) {
			
			String grade = rs.getString(1);
			String cclass = rs.getString(2);
			String no = rs.getString(3);
			String name = rs.getString(4);
			String score = rs.getString(5);
			
			String[] resultArr = {grade, cclass, no, name, score};
			
			dbList.add(resultArr);
			
		}
		
		int rowcount = gp.getRowCount();
		
		TextField[]tf = new TextField[5];
		String[] dbstr = new String[5];
		int[] changeindex = null;
		System.out.println(showList.get(1));
		String sql = "";
		
		if(rowcount>2) {
//			for(int i=0; i<rowcount-2; i++) {
//				System.out.println(showList.size() + "i = " + i);
//				tf = (TextField[])showList.get(i);
//				dbstr = (String[])dbList.get(i);
//				
//				for(int j=0; j<5; j++) {
//					if(!tf[j].getText().equals(dbstr[j])) {
//						changeindex[changeindex.length] = j;
//						System.out.println(changeindex[0]);
//					}
//				}
//			}
//			
//			String[] updateColumn = {"grade", "cclass", "no", "name", "score"};
//			switch(changeindex.length) {
//			case 1 : sql = "update user set " + updateColumn[changeindex[0]] + " = " + tf[changeindex[0]].getText() + " where no = " + dbstr[2];
//			}
//			
//			pstmt = conn.prepareStatement(sql);
//			
//			int result = 0;
//			result = pstmt.executeUpdate(sql);
//			if(result>0) System.out.println("success update");
			
		}
		
	}
	
	private List readUser() throws Exception{
		initializeDB();
		List result = new ArrayList<>();
		
		String query = "select * from user";
		ResultSet rs = stmt.executeQuery(query);
		
		while(rs.next()) {
			
			String grade = rs.getString(1);
			String cclass = rs.getString(2);
			String no = rs.getString(3);
			String name = rs.getString(4);
			String score = rs.getString(5);
			
			String[] resultArr = {grade, cclass, no, name, score};
			
			result.add(resultArr);
			
		}
		
		return result;
		
	}
	
	private void initializeDB() {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded");
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost/haksung","haksung","153246");
			System.out.println("Database connected");
			
			stmt = conn.createStatement();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
