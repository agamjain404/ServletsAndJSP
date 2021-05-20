<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

    <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
</head>
<body>
	<h1>SIGN UP</h1>
	<div class = "container">
		<div class="row">
			<div class = "col m6 offset-m3">
				<div class = "card">
					<div class = "card-content">
						<h3>Register Here !!</h3>
						<div class = "form">
							<form action="RegisterServlet" method="post">
								<input type="text" name="user_name" placeholder="Enter your name" />
								<input type="password" name="user_password" placeholder="Enter your password" />
								<input type="email" name="user_email" placeholder="Enter your email" />
							
								<button type="submit" class="btn red">Submit</button>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>