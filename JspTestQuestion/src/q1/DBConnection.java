package q1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.sql.DataSource;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

public class DBConnection {
	Connection con;
	DataSource ds;
	PreparedStatement ps;
	DBConnection ds1;

	public Connection getConnection() throws NamingException, SQLException {
		Context ctx = (Context) new InitialContext();
		ds = (DataSource) ((InitialContext) ctx).lookup("java:comp/env/jdbc/myTestDBCP");
		con = ds.getConnection();
		System.out.println(" ----------->> my test : "+con);
		return con;
	}

	public int insertUser(User user) throws Exception {
		System.out.println(" ----------->> my test 2 : "+con);
		Context ctx = (Context) new InitialContext();
		ds = (DataSource) ((InitialContext) ctx).lookup("java:comp/env/jdbc/myTestDBCP");
		
		System.out.println(" ->. 3c "+con);
		ps = con.prepareStatement("insert into QuizUser values(?,?,?)");
		ps.setString(1, user.getUsername());
		ps.setString(2, user.getPassword());
		ps.setInt(3, user.getAge());

		int  rs = ps.executeUpdate();
		return rs;

	}// endinsetruser

	public boolean ageValiadte(int age) {
		boolean is = false;
		if (age < 18) {
			is = true;
			}
		return is;
		}//end ageValidation
	public ResultSet checklogindetails(String username,String password) throws SQLException{
		
	Connection	con1= ds.getConnection();
		ps=con.prepareStatement("select * from QuizUser where usename=? and password=? ");
		ps.setString(1, username);
		ps.setString(2, password);
		ResultSet rs=ps.executeQuery();
		    return rs;
		
	}
}// class end
