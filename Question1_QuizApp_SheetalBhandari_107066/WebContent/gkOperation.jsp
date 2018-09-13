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
if(btn.equalsIgnoreCase("login"))
{  String arr[] =request.getParameterValues("t1");
String topic=arr[0];
Database db = new Database();
db.addUser("mike","test",100,new String[]{"",""});

}
%>
</body>
</html>