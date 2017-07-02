<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>failure</title>
</head>
<body bgcolor="red"><pre>
<center><h1>please check your credentials,<%out.println(session.getAttribute("registered user"));
%></h1></center>

<a href="home.jsp"><h3>HOME</h3></a><br>
</pre>
</body>
</html>