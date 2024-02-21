package PatientRecord;

import java.sql.*;

public class jfsdcreate {
	public static void main(String args[])throws Exception {
		 Driver drv = new oracle.jdbc.driver.OracleDriver();
		 DriverManager.registerDriver(drv);
		 Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","admin");
		 Statement stmt = conn.createStatement( );
		 stmt.execute("create table charannn(pid number(10),pname varchar(20),psymptoms varchar(20),pcontactnumber number(10))");
		 conn.close();
		
	}

}
