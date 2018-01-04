package com.javatpoint;
import java.sql.*;
public class ConProvider {

	public static Connection getConnection(){
	Connection con=null;
	try{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://10.10.242.22:3306/ashish","ashish","ashish");
	}catch(Exception e){System.out.println(e);}
	return con;
    }
}
