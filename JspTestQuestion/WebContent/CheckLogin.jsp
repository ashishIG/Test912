<%@page import="java.sql.ResultSet"%>
<%@page import="q1.DBConnection"%>
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
    String username=request.getParameter("username");
    String password=request.getParameter("password");
    
   DBConnection d=new DBConnection();
      ResultSet rs=d.checklogindetails(username, password);
      if(rs.next())
      {
    	  RequestDispatcher rd = request.getRequestDispatcher("DisplayQuiz.jsp");
    		rd.forward(request, response);
      }
      else
      {
    	  RequestDispatcher rd = request.getRequestDispatcher("HomePage.jsp");
  		rd.forward(request, response);
      }
   
%>
</body>
</html>