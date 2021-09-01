module javafxPractice1 {
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	requires java.sql;
	
	opens fxpractice2 to javafx.graphics, practice.fxml;
}