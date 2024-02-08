<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="Easy to buy Your most liked Products">
<meta name="keywords" content="HTML, CSS, meta tags, example">
<meta name="author" content="Harish&RajaRam">
<title>Forgot Password</title>
<style type="text/css">
@charset "ISO-8859-1";
@import url('https://fonts.googleapis.com/css?family=Poppins:200,300,400,500,600,700,800,900&display=swap');

*{
	margin : 0;
	padding: 0;
	box-sizing: border-box;
	font-family: 'Poppins', sans-serif;
}
body{
	display: flex;
	height: 100vh;
	justify-content: center;
	align-item: center;
	padding: 10px;
	background: linear-gradient( #9b59b6, #71b7e6)
	}
.box {
	background-color: white;
  	height: 400px;
  	width: 550px;
  	margin:75px 0 15px 0;
  	border: 2px;
  	border-radius: 15px;
  	text-align: center;
}
.box h1 {
	margin: 15px
}
.email {
	margin: 45px 0px 5px 65px;
	width:75%;
    max-width:500px;
    display:flex;
    border-radius: 60px;
    padding:10px 20px;
}
.button {
	width:250px;
	margin: 35px 0px 5px 0px;
	outline: none;
	color: #fff;
	border: 0px solid white;
	border-radius: 50px;
	background: linear-gradient(135deg, #71b7e6, #9b59b6);
	color: black;
	font-weight: 500;
	padding: 15px;
	cursor: pointer;
}
</style>
</head>
<body>
<div class="box">
	<h1>Forgot password</h1>
	<p>Enter your email address and we'll send you an email with link to reset your password.</p>
	<form action="forgot">
	<input type="email" name="email" placeholder="Enter your MailID" class="email">
	<button type="button" class="button"><a href="#" style="text-decoration: none; color:black">proceed</a></button>
	<p><a href="login.html" style="margin:0 0 0 0; text-decoration: none; color:black">&#8592;<br>Back to Home</a></p>
	</form>
	</div>
	
	<% %>
</body>
</html>