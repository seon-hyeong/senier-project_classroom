<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author"
	content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
<meta name="generator" content="Jekyll v4.1.1">
<title>Login</title>

<link rel="canonical"
	href="https://getbootstrap.com/docs/4.5/examples/sign-in/">

<!-- jstl -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!-- Bootstrap core CSS -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>


<style>
.bd-placeholder-img {
	font-size: 1.125rem;
	text-anchor: middle;
	-webkit-user-select: none;
	-moz-user-select: none;
	-ms-user-select: none;
	user-select: none;
}

@media ( min-width : 768px) {
	.bd-placeholder-img-lg {
		font-size: 3.5rem;
	}
}
</style>
<!-- Custom styles for this template -->
<link href="signin.css" rel="stylesheet">
</head>
<body class="text-center">
	<div style="padding: 150px 650px">
		<form class="form-register" method="post" action="/member/register">
			<h1 class="h3 mb-3 font-weight-normal">회원가입</h1>
			<label for="userId" class="sr-only">ID : </label> 
			<input type="text" id="userId" name="userId" class="form-control" placeholder="ID" required autofocus> <br> 
			<label for="inputPassword" class="sr-only">Password : </label> 
			<input type="password" id="userPass" class="form-control" placeholder="Password" name="userPass" required> <br>
			<label for="inputName" class="sr-only">Name : </label> 
			<input type="text" id="userName" class="form-control" placeholder="Name" name="userName" required> <br>
			<label for="inputNum" class="sr-only">Student ID : </label> 
			<input type="text" id="userNum" class="form-control" placeholder="Student /Professor ID" name="userNum" required> <br>
			<label for="inputPhone" class="sr-only">Phone Number : </label> 
			<input type="text" id="userPhone" class="form-control" placeholder="Phone Number" name="userPhone" required> <br>
			
			<label>
				<input type="checkbox" name="isMaster" value="0"> Professor</label>
      		<label>
      			<input type="checkbox" name="isMaster" value="1" checked> Student</label>
			<div class="col">
				<button class="btn btn-lg btn-secondary btn-block" type="submit">Sign up</button>
			</div>		
		</form>
	</div>
</body>
</html>