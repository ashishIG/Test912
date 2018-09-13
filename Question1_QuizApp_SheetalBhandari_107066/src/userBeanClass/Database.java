package userBeanClass;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class Database {
	Connection con;
	PreparedStatement ps;

	public Database() throws NamingException, SQLException 
	{
		Context ctx = new InitialContext();
		DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/myTestDBCP");
		con = ds.getConnection();
	}

	public boolean addUser(String username, String password, int age, String[] topic) throws SQLException {
		boolean isInserted = false;

		ps = con.prepareStatement("insert into QuizUser values(?,?,?,?)");
		ps.setString(1, username);
		ps.setString(2, password);
		ps.setInt(3, age);
		String str = "";
		for (String string : topic) {
			str = " " + string + ",";
		}
		ps.setString(4, str);

		int x = ps.executeUpdate();
		if (x > 0)
			isInserted = true;

		System.out.println("--------->> " + isInserted);
		return isInserted;
	}

	public boolean checkingUser(String username, String password) throws SQLException {
		ps = con.prepareStatement("select * from QuizUser where username=? and password=?");
		ps.setString(1, username);
		ps.setString(2, password);
		String str = "";
		int i = 0;
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			i++;
		}
		if (i > 0) {
			return true;
		} else {
			return false;
		}
	}

	public ResultSet showQuizUser() throws SQLException {
		ps = con.prepareStatement("select * from QuizUser");
		ResultSet rs = ps.executeQuery();
		return rs;
	}

}
