<%@page import="java.sql.ResultSet"%>
<%@page import="q1.DBConnection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" errorPage="Error.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Login</h1>

	<form action="Checklogin" method="post">
		Username:<input type="text" name="username"> Password:<input
			type="password" name="password"> <input type="submit"
			value="login">
	</form>
	</br>

	<form action="HomePage.jsp" method="post">
		Username: <input type="text" name="username"> Password:<input
			type="password" name="password"> Age:<input type="text"
			name="age"> Topic : <SELECT name="topic">
			<option value="Movies">Movies</option>
			<option value="GK">GK</option>
		</SELECT> <input type="submit" value="Register">
	</form>

	<jsp:useBean id="user" class="q1.User" scope="session"></jsp:useBean>

	<jsp:setProperty property="username" name="user"></jsp:setProperty>
	<jsp:setProperty property="password" name="user"></jsp:setProperty>
	<jsp:setProperty property="age" name="user"></jsp:setProperty>
	<jsp:setProperty property="username" name="user"></jsp:setProperty>

	<%
		int age = user.getAge();
		DBConnection db = new DBConnection();
		boolean check = db.ageValiadte(age);
		if (check == true) {
			RequestDispatcher rd = request.getRequestDispatcher("InvalidAgeException.jsp");
			rd.forward(request, response);
		} //end if
		else {

			int rs = db.insertUser(user);
			if (rs != 0) {
				out.print("Successfully registered");
				RequestDispatcher rd = request.getRequestDispatcher("HomePage.jsp");
				rd.forward(request, response);

			} //end if
			else {
				RequestDispatcher rd = request.getRequestDispatcher("Error.jsp");
				rd.forward(request, response);
	%>

	<%
		} //end else

		} //nested if
	%>



</body>
</html>