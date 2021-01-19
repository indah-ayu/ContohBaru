package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
    private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=Customer";
        //private static final String URL = "jdbc:microsoft:sqlserver://WMM-PC;databaseName=Customer";
	private static final String USERNAME = "sa";
	private static final String PASSWORD = "userjuga";
	
	private static Connection connection = null;
	
	public static Connection getConnection(){
		if(connection==null){
			try{
				//Loading The Driver Class
				Class.forName(DRIVER);
				
				//Getting the connection Object
				connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			}catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
		}
		
		return connection;
	}
}
