<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>home</title>
</head>
<body bgcolor="pink"><pre>
<center><h2><b>WELCOME TO PUBHUB 100 APPLICATION   ,<%out.println(session.getAttribute("loggedin user") );%></b></h2></center>


<a href="addbook.jsp"><h3>SAVE</h3></a><br><a href="modifyprice.jsp"><h3>EDIT PRICE</h3></a><br>

<a href="findallbook.jsp"><h3>FIND BY BOOK NAME</h3></a><br><a href="remove.jsp"><h3>REMOVE</h3></a><br>

<a href="home.jsp"><h3>RETURN TO HOME</h3></a><br>

<a href="/pubhub100-310814104084-web/ViewServlet"> VIEW ALL BOOKS</a>
</pre>
</body>
</html>