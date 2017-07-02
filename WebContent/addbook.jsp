<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>save book</title>
</head>

<body bgcolor="pink"><form action="SaveController" method="get"></pre>

<pre></pre><h2>WELCOME  ,<%out.println(session.getAttribute("loggedin user") );%></h2>
</pre>
<pre>
bookname :<input type="text" name="bookname"><br>

price:<input type="text" name="price"><br>

<button type="submit">save</button>

<a href="home.jsp"><h3>HOME</h3></a><br>
</form></pre></body>

</html>