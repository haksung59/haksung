package fxpractice2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Form1 extends Application{
	
	private Statement stmt;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		initializeDB();
		
		SplitPane sp = new SplitPane();
		AnchorPane apleft = new AnchorPane();
		AnchorPane apright = new AnchorPane();
		GridPane gp = new GridPane();
		
		Label lbl0 = new Label("grade");
		Label lbl1 = new Label("cclass");
		Label lbl2 = new Label("no");
		Label lbl3 = new Label("name");
		Label lbl4 = new Label("score");
		
		lbl0.setPrefWidth(75);lbl1.setPrefWidth(75);lbl2.setPrefWidth(75);
		lbl3.setPrefWidth(75);lbl4.setPrefWidth(75);
		
		gp.addColumn(0, lbl0);
		gp.addColumn(1, lbl1);
		gp.addColumn(2, lbl2);
		gp.addColumn(3, lbl3);
		gp.addColumn(4, lbl4);
		
		Button read = new Button("Read"); read.setLayoutX(53); read.setLayoutY(42);
		Button create = new Button("Create"); create.setLayoutX(53); create.setLayoutY(93);
		Button update = new Button("Update"); update.setLayoutX(53); update.setLayoutY(148);
		Button remove = new Button("Remove"); remove.setLayoutX(53); remove.setLayoutY(211);
		
		apleft.getChildren().addAll(gp);
		apright.getChildren().addAll(read, create, update, remove);
		
		sp.getItems().add(0, apleft);
		sp.getItems().add(1, apright);
		
		Scene scene = new Scene(sp);
		
		primaryStage.setTitle("Form1");
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

	
	public static void main(String[] args) {
		launch(args);
	}

}
