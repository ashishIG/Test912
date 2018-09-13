<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="QuizPage.jsp" method="get">
<h1>Quiz Login</h1>
Username:<input type="text" name="username"><br>
Password:<input type="password" name="password"><br>
<input type="submit" name="login" value="login"><br>

----------------------------------------------------------------------

<form action="UseBean.jsp" method="get">
<h1>Quiz User Registration</h1>
Username:<input type="text" name="username"><br>
Password:<input type="text" name="password"><br>
Age:<input type="text" name="age"><br>
Topic:<select name="Select">
<option value="movies">Movies</option>
<option value="gk">GK</option>
</select>
<input type="submit" name="login" value="Register">
</form>
</body>
</html>