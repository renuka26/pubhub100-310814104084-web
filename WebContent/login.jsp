<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>

<body bgcolor="pink"><form action="LoginController" method="post"></pre>

<pre></pre><h2>WELCOME<%out.println(" ,  "+session.getAttribute("registered user") );%></h2>
</pre>
<pre>
email_id :<input type="email" name="email_id"><br>


password :<input type="password" name="password"><br>
<button type="submit">LOGIN</button>

<a href="home.jsp"><h3>HOME</h3></a><br>
</form></pre></body>

</html>