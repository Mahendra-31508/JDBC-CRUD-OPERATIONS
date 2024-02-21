package PatientRecord;

import java.sql.*;

public class deletepatient {
	public static void main(String args[])throws Exception {
		Driver drv = new oracle.jdbc.OracleDriver();
	    DriverManager.registerDriver(drv);
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","admin");
		Statement stmt = conn.createStatement( );
		stmt.execute("delete from patientrecord where pid=244 ");
		
		conn.close();
		
	}

}
