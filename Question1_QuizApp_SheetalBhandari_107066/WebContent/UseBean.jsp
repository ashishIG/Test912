<%@page import="java.sql.ResultSet"%>
<%@page import="userBeanClass.Database"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
String btn=request.getParameter("login");
if(btn.equalsIgnoreCase("login")){
String username=request.getParameter("username");
String password=request.getParameter("password");
String age=request.getParameter("age");
String arr[] =request.getParameterValues("topic");
String topic=arr[0];

Database db = new Database();
boolean  check= db.checkingUser(username, password);
if(check==true)
{
	if(topic.equalsIgnoreCase("gk"))
	{
		RequestDispatcher rd = request.getRequestDispatcher("QuizPage.jsp");
		rd.forward(request,response);
	}
	if(topic.equalsIgnoreCase("movies"))
	{
		RequestDispatcher rd = request.getRequestDispatcher("Quiz.jsp");
		rd.forward(request,response);
	}
}
else
{
	   out.println("credential Mismatch");
}

}
	%>

	if(btn.equalsIgnoreCase("Register")) { %>
	<jsp:useBean id="user" class="userBeanClass.User" scope="session" />
	<jsp:setProperty property="username" name="user" />
	<jsp:setProperty property="password" name="user" />
	<jsp:setProperty property="age" name="user" />
	<jsp:setProperty property="topic" name="user" />
	<% 

Database db=new Database();
boolean a=db.addUser(user.getUsername(),user.getPassword(),user.getAge(),user.getTopic());
if(a)
response.sendRedirect("HomePage.jsp");
else 
	response.sendRedirect("errorPage.jsp");

%>
</body>
</html>