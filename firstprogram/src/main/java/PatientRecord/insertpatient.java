package PatientRecord;

import java.sql.*;

public class insertpatient {
	public static void main(String args[])throws Exception {
		Driver drv = new oracle.jdbc.OracleDriver();
	    DriverManager.registerDriver(drv);
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","admin");
		Statement stmt = conn.createStatement( );
		stmt.execute("Insert into charannn values(244,'Prakash','fatigue',8635975621)");
		stmt.execute("Insert into charannn values(255,'Amara','loss of appetite',9635871124)");
		stmt.execute("Insert into charannn values(269,'bhavya','head ache',7598643125)");
		conn.close();
		
	}

}
