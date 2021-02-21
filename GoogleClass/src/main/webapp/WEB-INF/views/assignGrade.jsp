<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">

<head>
  <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title>Assign Grade</title>
  <meta content="" name="description">
  <meta content="" name="keywords">

  <!-- Favicons -->
  <link href="/resources/assets/img/favicon.png" rel="icon">
  <link href="/resources/assets/img/apple-touch-icon.png" rel="apple-touch-icon">

  <!-- jstl -->
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
  <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootswatch/4.5.2/litera/bootstrap.min.css" integrity="sha384-enpDwFISL6M3ZGZ50Tjo8m65q06uLVnyvkFO3rsoW0UC15ATBFz3QEhr3hmxpYsn" crossorigin="anonymous">
  
  <!-- Google Fonts -->
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Raleway:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">

  <!-- Vendor CSS Files -->
  <link href="/resources/assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="/resources/assets/vendor/icofont/icofont.min.css" rel="stylesheet">
  <link href="/resources/assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
  <link href="/resources/assets/vendor/animate.css/animate.min.css" rel="stylesheet">
  <link href="/resources/assets/vendor/remixicon/remixicon.css" rel="stylesheet">
  <link href="/resources/assets/vendor/venobox/venobox.css" rel="stylesheet">
  <link href="/resources/assets/vendor/owl.carousel/assets/owl.carousel.min.css" rel="stylesheet">

  <!-- Template Main CSS File -->
  <link href="/resources/assets/css/style.css" rel="stylesheet">

  <!-- =======================================================
  * Template Name: Sailor - v2.2.0
  * Template URL: https://bootstrapmade.com/sailor-free-bootstrap-theme/
  * Author: BootstrapMade.com
  * License: https://bootstrapmade.com/license/
  ======================================================== -->

</head>

<body>

	<main id="main"> <!-- ======= Portfolio Details Section ======= -->
	<section id="portfolio-details" class="portfolio-details">
		<div class="container">
			<div class="row">
			<div class="col-lg-8">
					<h2 class="portfolio-title">Assign Grade</h2>
					<div class="owl-carousel portfolio-details-carousel">
						<img src="/resources/assets/img/portfolio/portfolio-details-1.jpeg"
							class="img-fluid" alt="">
					</div>
				</div>
				
				<div class="col-lg-4 portfolio-info">
					<ul>
						<c:if test="${detail.userId == null}">
							<script>
								alert("과제 미제출")
								location.href = "/";
							</script>
						</c:if>
						<c:if test="${isMaster == '0'&&detail.assignFile != null}">
						<h3>과제 이름 : ${detail.assignName}</h3>
							<h3>과제 점수 : ${detail.assignGrade}</h3>
							<c:choose>
								<c:when test="${detail.assignGrade >= 90}">
									<h3>A학점</h3>
								</c:when>
								<c:when test="${detail.assignGrade < 90 && detail.assignGrade >= 65 }">
									<h3>B학점</h3>
								</c:when>
								<c:otherwise>
									<h3>C학점</h3>
								</c:otherwise>
							</c:choose>
						</c:if>
						<c:if test="${isMaster == '1'&&detail.assignFile != null}">
						<h3>과제 이름 : ${detail.assignName}</h3>
							<h3>과제 점수 : ${detail.assignGrade}</h3>
							<c:choose>
								<c:when test="${detail.assignGrade >= 90 && detail.assignGrade != null}">
									<h3>A학점</h3>
								</c:when>
								<c:when test="${detail.assignGrade < 90 && detail.assignGrade >= 65 && detail.assignGrade !=null}">
									<h3>B학점</h3>
								</c:when>
								<c:when test="${detail.assignGrade < 65 && detail.assignGrade >0 && detail.assignGrade !=null}">
									<h3>C학점</h3>
								</c:when>
							</c:choose>
							<h3><a href="/assign/fileDownload?assignFile=${detail.assignFile}">과제 파일 : ${detail.assignFile}</a></h3>
						</c:if>
					</ul>
				</div>
			</div>
		</div>
	</section>
	<!-- End Portfolio Details Section --> </main>
	<!-- End #main -->
	<a href="#" class="back-to-top"><i class="icofont-simple-up"></i></a>

  <!-- Vendor JS Files -->
  <script src="/resources/assets/vendor/jquery/jquery.min.js"></script>
  <script src="/resources/assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <script src="/resources/assets/vendor/jquery.easing/jquery.easing.min.js"></script>
  <script src="/resources/assets/vendor/php-email-form/validate.js"></script>
  <script src="/resources/assets/vendor/isotope-layout/isotope.pkgd.min.js"></script>
  <script src="/resources/assets/vendor/venobox/venobox.min.js"></script>
  <script src="/resources/assets/vendor/waypoints/jquery.waypoints.min.js"></script>
  <script src="/resources/assets/vendor/owl.carousel/owl.carousel.min.js"></script>

  <!-- Template Main JS File -->
  <script src="/resources/assets/js/main.js"></script>

</body>

</html>