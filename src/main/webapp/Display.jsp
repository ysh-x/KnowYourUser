<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>KnowYourUser | Central Database Portal</title>
   <style>

	* {
			margin: 0;
			padding: 0;
			box-sizing: border-box;
			font-family: "Helvetica","Sans-Serif";
		}
		
		.header {
			display: flex;
			flex-direction: row;
			flex-wrap:wrap;
			padding: 0  0.2em;
			height: 10vh;
			background-color: #fdfd66;
		}
		
		.header h1 {
			margin: 0.2em;
			padding: 0.6em;
			display:inline;
			width: 80vw;
		}
		
		.handle {
			display:inline;
			text-decoration: none;
			padding: 0.6em;
			padding-top: 2vh;
			margin-left: 2vw;
			background-color:#2568fb;
			color: #fff;
		}
		
        table, th, td {
        	margin: 1em;
        	width: 90vw;
            border: 1px solid #ddd;
            border-collapse: collapse;
            text-align:center;
            padding: 0.4em;
        }
        .container {
			display: flex;
			flex-direction: column;
			width: max-content;
			margin: auto;
			padding: 0.5em;
		}
		
		button {
			width: 90vw;
			color: #fff;
			font-size: 1.2em;
			padding: 0.4em;
			margin: 0.5em;
			background-color:#2568fb;
			color: #fff;
		}
		
    </style>
</head>
<body>
<div class="header">
<h1>Display Users</h1>
</div>

<div class="container"></div>
		<table>
			<tr>
			<th>Name</th>
			<th>Email</th>
			<th>Company</th>
			<th>Edit</th>
			
			<form action="edit" method="post">
			</tr>
			<c:forEach var="user" items="${view}">
			<tr>
			<td>${user.getName()}</td>
			<td>${user.getEmail()}</td>
			<td>${user.getCountry()}</td>
			<td><input type ="radio" name="selectStudent" value=${user.getID()}>${user.getID()}</input></td>
			</tr>
			</c:forEach>
			</table>
		<button type="submit">Edit</button>
		</form>
</div>
</body>
</html>