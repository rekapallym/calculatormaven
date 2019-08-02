package com.manic.project;
import java.sql.*;

public class Calculator {
	
	public static void main(String[] args) {
	
		
		
//		System.out.println("hi " + Sum(1,2));
//		System.out.println(multiply(5,5));
		
		try {
			//1.get a connection to database
			Connection myconn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_hr?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "navsmani");
			
			//2.create a statement
			Statement mystat = myconn.createStatement();
			
			//3.Enter sql query
			ResultSet myres= mystat.executeQuery("select * from employees");
			
			//4.process the requests
			while(myres.next()) {
				System.out.println(myres.getString("last_name")+", " + myres.getString("first_name"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static Integer Sum(Integer x, Integer y) {
		if(x == null || y == null) {
			return null;
		}
			
		return x+y;
	}
	public static Integer Subtraction(Integer x, Integer y) {
		if(x == null || y == null) {
			return null;
		}
			
		return x-y;
	}
	
	public static Integer multiply(Integer x, Integer y) {
		if(x == null || y == null) {
			return null;
		}
		return x*y;
	}
	public static Integer sqrt(Integer x) {
		if(x == null ) {
			return null;
		}
		return x*x;
	}
	
	public static Integer countA(String word) {
		int count = 0;
		for(int i=0; i < word.length(); i++) {
			if( word.charAt(i)=='a' || word.charAt(i) == 'A') {
				count++;
			}
		}
		return count;
	

	}
}
// manikanat test1
