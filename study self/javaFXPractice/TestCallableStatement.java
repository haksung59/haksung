package javaFXPractice;

import java.sql.*;
import java.util.Scanner;

public class TestCallableStatement {

	public static void main(String[] args){
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost/haksung", "haksung", "153246");
		
		CallableStatement callableStatement = connection.prepareCall(
				"{? = call studentFound(?)");
		
		Scanner input = new Scanner(System.in);
		System.out.print("first name을 입력하시오.");
		String firstName = input.nextLine();
		
		callableStatement.setString(2, firstName);
		callableStatement.registerOutParameter(1, Types.INTEGER);
		callableStatement.execute();
		
		if(callableStatement.getInt(1) >= 1)
			System.out.println(firstName +" is in the database");
		else
			System.out.println(firstName + " is not in the database");
		}catch (SQLException e) {
			e.printStackTrace();
		}catch(Exception e2) {
			e2.printStackTrace();
		}
	}

}
