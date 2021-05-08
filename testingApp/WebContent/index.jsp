<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
	.container{
		width: 30%;
		border: 1px solid black;
		margin: auto;
		padding: 20px;
		font-size: 20px;
	}
	
	#myform table tr td input{
		font-size: 20px;
	}
</style>
</head>
<body>
	<div class = "container">
		<h1>My Form</h1>
		
		<form id = "myform" action="DemoForm" method="post">
		<table>
			<tr>
				<td>Enter your name:</td>
				<td><input type="text" name="user_name" placeholder = "Enter here"/></td>
			</tr>
			
			<tr>
				<td>Enter your password:</td>
				<td><input type="password" name="user_password" placeholder = "Enter here"/></td>
			</tr>
			
			<tr>
				<td>Enter your email:</td>
				<td><input type="email" name="user_email" placeholder = "Enter here"/></td>
			</tr>
			
			<tr>
				<td>Select your gender:</td>
				<td><input type="radio" name="user_gender" value = "male"/>&nbsp; Male &nbsp;&nbsp;<input type="radio" name="user_gender" value = "female"/>&nbsp;Female </td>
			</tr>
			
			<tr>
				<td>Select your course:</td>
				<td>
					<select name = "user_course">
						<option value="Java">JAVA</option>
						<option value="Python">PYTHON</option>
						<option value="Php">PHP</option>
						<option value="Sql">SQL</option>
					</select>
				</td>
			</tr>
			
			<tr>
				<td style = "text-align: right">
					<input type="checkbox" value="checked" name="condition"/>
				</td>
				<td>
					Agree terms and condition.	
				</td>
			</tr>
			
			<tr>
				<td>
					<button type ="submit">Submit</button>	
					<button type ="reset">Reset</button>
				</td>
			</tr>
		</table></form>
	</div>
</body>
</html>