<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body bgcolor="pink"><form action="ModifyServlet" ><pre>

<h2>WELCOME<%out.println(" ,  "+session.getAttribute("loggedin user") );%></h2>
</pre>
<pre>
Book name :<input type="text" name="name"><br>


new price :<input type="text" name="newprice"><br>
<button type="submit">EDIT</button>

<a href="home.jsp"><h3>HOME</h3></a><br>
</form></pre></body>
</html>