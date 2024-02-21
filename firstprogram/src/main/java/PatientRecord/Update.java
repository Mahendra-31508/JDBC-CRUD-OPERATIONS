package PatientRecord;

import java.sql.*;

public class Update {
	public static void main(String args[])throws Exception{
		Driver drv = new oracle.jdbc.OracleDriver();
		DriverManager.registerDriver(drv);
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","admin");
		Statement stmt = conn.createStatement();
		stmt.execute("update patientrecordd set psymptoms='Dizziness' where pid= 255 ");

		conn.close();
	}

}
