package CreationalDesignpattern.SingletonPattern;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class dbSingletonDemo {
public static void main(String[] args) throws SQLException {
	
	dbSingleton firstobject=dbSingleton.getInstance();
	System.out.println(firstobject);
	dbSingleton secondobject=dbSingleton.getInstance();
	System.out.println(secondobject);
	
	
	Connection conn=firstobject.getConnection();
	Statement statement;
	statement=conn.createStatement();
	int count=statement.executeUpdate("create table demo(Id INT,Streetname VARCHAR(20))");
	System.out.println("table created sucessfully");
	statement.close();
	
}
}
