import java.sql.*;

public  class Retrievepatient{
	 
     public static void main(String arg[]) throws Exception{
   
    Class.forName("oracle.jdbc.driver.OracleDriver");
 
  Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","admin");
	Statement stmt = conn.createStatement( );

    ResultSet rs = stmt.executeQuery("select * from patientrecord ");
          while(rs.next()){
        	  
              int id = rs.getInt(1);
              String name = rs.getString(2);
              String symptoms = rs.getString(3);
              int phonenumber = rs.getInt(4);
              System.out.println(id);
    
}
      conn.close();
}
  }