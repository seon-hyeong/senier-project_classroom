<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="ko">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author"
	content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
<meta name="generator" content="Jekyll v4.1.1">
<title>AssignEnroll</title>

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
		<form class="form-register" method="post" action="/assign/assignRegister">
		
			<h1 class="h3 mb-3 font-weight-normal">과제등록</h1>
			<label for="assignName" class="sr-only">과제 이름 : </label> 
			<input type="text" id="assignName" name="assignName" class="form-control" placeholder="과제 이름" required autofocus> <br>
			<label for="assignDes" class="sr-only">과제 내용 : </label> 
			<input type="text" id="assignDes" name="assignDes" class="form-control" placeholder="과제 내용" required> <br>
			<label for="assignDead" class="sr-only">과제 기간 : </label> 
			<input type="text" id="assignDead" name="assignDead" class="form-control" placeholder="과제 기간" required> <br>
			<label for="classNum" class="sr-only">수업 번호 : </label> 
			<input type="text" id="classNum" name="classNum" class="form-control" placeholder="수업 번호" required> <br>
				<button class="btn btn-lg btn-secondary btn-block" type="submit">과제등록</button>
			</div>
		</form>
	</div>
</body>
</html>