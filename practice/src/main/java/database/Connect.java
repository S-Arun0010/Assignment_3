package database;
import java.sql.*;
import java.util.logging.Logger;
public class Connect {
	static Connection con;
	static Statement stmt;
	static String pass = "S.arun2002";
	static Logger l= Logger.getLogger("com.api.jar");
	private static Connect instance = null;
	private Connect()
	{
		
	}
	 public static Connect getInstance()
	    {
	        if (instance == null)
	            instance = new Connect();
	  
	        return instance;
	    }
	public static void getconnect()
	{
		try {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root",pass);
            l.info("Database get connected:");
            l.info("Inserting records into database!!");
            String sql="Insert into student values(8,'arun',8.5)";
            stmt=con.createStatement();
            stmt.executeUpdate(sql);
        }
        catch(Exception e)
        {
        	System.out.println(e);
        }
	}
	public static void closeconnection() throws SQLException
	{
		con.close();
		l.info("Database connection closed:");
	}
     public static void main(String[] args) throws SQLException
     {
    	  Connect.getInstance();
    	 getconnect();
    	 closeconnection();
     }
}