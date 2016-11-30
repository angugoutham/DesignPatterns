package CreationalDesignpattern.SingletonPattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbSingleton {

	//eager  loading 
	//we make it static and private varaible beacuse it can created only one and instantiaed only by this class
	//private static dbSingleton instance =new dbSingleton();
	
	
	//this code is to demonstrate lazy 
	private static dbSingleton instance=null;
	
	private Connection conn=null;
	 private   dbSingleton() throws SQLException {
		//register driver for the derby database 
	 DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
		
	}
	 //method to involve that varaiable 
	 public static dbSingleton getInstance() throws SQLException{
		 //if the instance is not intialized this will go inside the loop and other wise it will return the instance 	
		 if(instance==null)  //single checked
		 {
			 //to make thread safe
			 synchronized (dbSingleton.class)
			 {
				 //checks whether this null or not to 
if(instance==null){  //double checked 
			//instantiate only needed :lazy oadinf  
			 instance=new dbSingleton();
		 }
		 }
		 }
		return instance;
		 
		 
	 }
	 
	 
	 public Connection getConnection(){
		 
		 
		 if(conn==null){
			synchronized (dbSingleton.class) {
				if(conn==null){
					
					String dbUrl="jdbc:derby://localhost:1527/dbname;create=true";
					try {
						conn=DriverManager.getConnection(dbUrl);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			} 
			 
			 
		 }
		 return conn;
	 }
}	
