<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en">
<head>
 <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
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
			background-color: #fdfd66;
		}
		
		.header h1 {
			padding-top: 2vh;
			padding-bottom: 2vh;
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
		.container {
			display: flex;
			flex-direction: column;
			width: max-content;
			margin: auto;
			margin-top: 15vh;
			padding: 0.5em;
		}
		
		input {
			font-size: 1.2em;
			padding: 0.4em;
			font-weight: 800;
			width: 30vw;
			margin: 0.5em;
			
		}
		button {
			width: 30vw;
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
		<h1>KnowYourUser</h1>
		<a class = "handle" href="display" target="_blank">View Users</a>
	</div>
	<div class="container">
		<form action="insert" method="post">
		<h2>Feed</h2>
		<input type = "text" name="name" required placeholder="Name"><br>
		<input type = "text" name="email" required placeholder="email"><br>
		<input type = "text" name="country" required placeholder="country"><br>
		<button type="submit">Submit</button>
	    </form>
    </div>
</body>
</html>