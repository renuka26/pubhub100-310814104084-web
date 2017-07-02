<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search result</title>
</head>
<body bgcolor="pink"></pre>

<pre></pre><h2>WELCOME  ,<%out.println(session.getAttribute("loggedin user") );%></h2>
<table border=1>
<thead>
<tr>
<th>name</th>
<th>price</th>
</tr>
</thead>
<tbody>
<c:forEach var="book1" items="${SEARCHALL_RESULT}">
<tr>
<td>${book1.name}</td>
<td>${book1.price}</td>
</tr></c:forEach>
</tbody>
<a href="home.jsp"><h3>HOME</h3></a><br>

<a href="index.jsp"><h3>OPTIONS</h3></a><br>


</table>  
</body>
</html>