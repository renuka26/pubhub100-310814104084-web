<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>success</title>
</head>
<body bgcolor="lightgreen"><pre><center><h1>your login succeded,<%out.println(session.getAttribute("loggedin user"));
%></h1></center></pre>

<a href="home.jsp"><h3>HOME</h3></a><br>

<a href="index.jsp"><h3>OPTIONS</h3></a><br>


</body>
</html>