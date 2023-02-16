 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Consultancy Form</h1>
	<form action="insert" method="post">
	<input type = "text" name="name" placeholder="Name"><br>
	<input type = "text" name="email"placeholder="email"><br>
	<input type = "text" name="Country" placeholder="Country"><br>
	<h2>Available types</h2>
	<button type="submit">Submit</button>
	
	
    </form>
</body>
</html>