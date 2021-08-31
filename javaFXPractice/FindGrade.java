package javaFXPractice;

import java.sql.*;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class FindGrade extends Application{

	private Statement stmt;
	private TextField tfSSN = new TextField();
	private TextField tfCourseId = new TextField();
	private Label lblStatus = new Label();
	
	@Override
	public void start(Stage primaryStage) {
		
		initializeDB();
		
		Button btShowGrade = new Button("Show Grade");
		HBox hbox = new HBox(5);
		hbox.getChildren().addAll(new Label("SSN"), tfSSN, 
				new Label("Course ID"), tfCourseId, (btShowGrade));
		
		VBox vBox = new VBox(10);
		vBox.getChildren().addAll(hbox, lblStatus);
		
		tfSSN.setPrefColumnCount(6);
		tfCourseId.setPrefColumnCount(6);
		btShowGrade.setOnAction(e -> showGrade());
		
		Scene scene = new Scene(vBox, 420, 80);
		primaryStage.setTitle("FindGrade");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	private void initializeDB() {
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded");
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/haksung","haksung","153246");
			System.out.println("Database connected");
			
			stmt = connection.createStatement();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private void showGrade() {
		String ssn = tfSSN.getText();
		String courseId = tfCourseId.getText();
		try {
			String queryString = "select firstName, mi, "
					+ "lastName, title, grade from student, enrollment, course"+
					"where student.ssn = '"+ssn + "' and enrollment.courseId"+
					"= '" + courseId + "' and enrollment.courseId = Course.courseId " +
					" and Enrollment.ssn = student.ssn";
			ResultSet rs = stmt.executeQuery(queryString);
			
			if(rs.next()) {
				String lastName = rs.getString(1);
				String mi = rs.getString(2);
				String firstName = rs.getString(3);
				String title = rs.getString(4);
				String grade = rs.getString(5);
				
				lblStatus.setText(firstName + " " + mi + " " + lastName +
						"'s grade on course " + title + " is " + grade);
			}else {
				lblStatus.setText("Not found");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
}
