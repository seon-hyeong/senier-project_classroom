<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">

<head>
  <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title>Class Room</title>
  <meta content="" name="description">
  <meta content="" name="keywords">

  <!-- Favicons -->
  <link href="/resources/assets/img/favicon.png" rel="icon">

<!-- jstl -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

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

  <!-- ======= Header ======= -->
	<header id="header" class="fixed-top ">
		<div class="container d-flex align-items-center">

			<h1 class="logo">
				<a href="/">ClassRoom</a>
			</h1>
			<nav class="nav-menu d-none d-lg-block">
				<c:if test="${userName == null}">
					<ul>
						<li class="active"><a href="/">Home</a></li>
						<li><a href="/member/myRoom">MyRoom</a></li>
						<li><a href="Calendar">Calendar</a></li>
						<li><a href="Chart">Chart</a></li>
					</ul>
				</c:if>
				<c:if test="${userName != null && isMaster=='0'}">
					<ul>
						<li class="active"><a href="/">Home</a></li>
						<li><a href="/member/myRoom">MyRoom</a></li>
						<li><a href="Calendar">Calendar</a></li>
					</ul>
				</c:if>
				<c:if test="${userName != null && isMaster=='1'}">
					<ul>
						<li class="active"><a href="/">Home</a></li>
						<li><a href="/class/classList">Course</a></li>
						<li><a href="/member/myRoom">MyRoom</a></li>
						<li><a href="Calendar">Calendar</a></li>
					</ul>
				</c:if>
			</nav>
			<!-- .nav-menu -->

			<c:if test="${userName == null}">
				<a href="login" class="get-started-btn ml-auto">Login</a>

			</c:if>
			<c:if test="${userName != null}">
				<a class="get-started-btn ml-auto">${userId}님</a>
				<a href="/member/logout" class="get-started-btn ml-auto">Logout</a>
			</c:if>
		</div>
	</header>
	<!-- End Header -->
	<!-- ======= Hero Section ======= -->
  <section id="hero">
    <div id="heroCarousel" class="carousel slide carousel-fade" data-ride="carousel">

      <ol class="carousel-indicators" id="hero-carousel-indicators"></ol>

        <div class="carousel-item active" style="background-image: url(/resources/assets/img/slide/slide-3.jpg)">
          <div class="carousel-container">
            <div class="container">
            <c:if test="${userName == null}">
              <h2 class="animate__animated animate__fadeInDown">Welcome to <span>ClassRoom</span></h2> 
             </c:if>
              <c:if test="${userName != null}"> 
              	<h2 class="animate__animated animate__fadeInDown">Welcome to <span>ClassRoom</span></h2> 
             		<a href="/class/classRegister?userId=${userName}" class="btn-get-started animate__animated animate__fadeInUp scrollto">수업 등록하기</a>
              </c:if>            
            </div>
          </div>
        </div>
      </div>

    </div>
  </section><!-- End Hero -->

<!-- ======= Services Section ======= -->
    <section id="services" class="services">
      <div class="container">

        <div class="section-title">
          <h2>Service</h2>
          <p>The Services We Offer</p>
        </div>

        <div class="row">
          <div class="col-md-6">
            <div class="icon-box">
              <i class="icofont-computer"></i>
              <h4><a href="#">Manage</a></h4>
              <p>Simplify teaching and learning</p>
            </div>
          </div>
          <div class="col-md-6 mt-4 mt-md-0">
            <div class="icon-box">
              <i class="icofont-chart-bar-graph"></i>
              <h4><a href="#">Measure</a></h4>
              <p>Move students forward</p>
            </div>
          </div>
          <div class="col-md-6 mt-4 mt-md-0">
            <div class="icon-box">
              <i class="icofont-settings"></i>
              <h4><a href="#">Collaborate</a></h4>
              <p>Strengthen student connections</p>
            </div>
          </div>
          <div class="col-md-6 mt-4 mt-md-0">
            <div class="icon-box">
              <i class="icofont-earth"></i>
              <h4><a href="#">Secure</a></h4>
              <p>Keep your data protected</p>
            </div>
          </div>
        

      </div>
    </section><!-- End Services Section -->

  <!-- ======= Footer ======= -->
  <footer id="footer">
    <div class="footer-top">
      <div class="container">
        <div class="row">

          <div class="col-lg-3 col-md-6">
            <div class="footer-info">
              <h3>Park</h3>
              <p>
                Seocho-gu, Seoul<br><br>
                <strong>Phone:</strong> 010 - 4902 - 4580<br>
                <strong>Email:</strong> qkrtjsgud347@skuniv.ac.kr<br>
              </p>
              <div class="social-links mt-3">            
                <a href="#" class="facebook"><i class="bx bxl-facebook"></i></a>
                <a href="#" class="instagram"><i class="bx bxl-instagram"></i></a>
              </div>
            </div>
          </div>

          <div class="col-lg-2 col-md-6 footer-links">
            <h4>Useful Links</h4>
            <ul>
              <li><i class="bx bx-chevron-right"></i> <a href="/">Home</a></li>
              <li><i class="bx bx-chevron-right"></i> <a href="/class/classList">Course</a></li>
              <li><i class="bx bx-chevron-right"></i> <a href="myRoom">My Room</a></li>
              <li><i class="bx bx-chevron-right"></i> <a href="calendar">Calendar</a></li>
            </ul>
          </div>

          <div class="col-lg-3 col-md-6 footer-links">
            <h4>Our Services</h4>
            <ul>
              <li><i class="bx bx-chevron-right"></i> <a href="#">Manage</a></li>
              <li><i class="bx bx-chevron-right"></i> <a href="#">Measure</a></li>
              <li><i class="bx bx-chevron-right"></i> <a href="#">Collaborate</a></li>
              <li><i class="bx bx-chevron-right"></i> <a href="#">Secure</a></li>
            </ul>
          </div>

          <div class="col-lg-4 col-md-6 footer-newsletter">
            <h3>Get more time to teach and inspire learners with Classroom</h3>
            <p>A free and easy tool helping educators efficiently manage and assess progress, while enhancing connections with learners from school, from home, or on the go.</p>
          </div>

        </div>
      </div>
    </div>

    <div class="container">
      <div class="copyright">
        &copy; Copyright <strong><span>Park</span></strong>. 
      </div>
      <div class="credits">
        <!-- All the links in the footer should remain intact. -->
        <!-- You can delete the links only if you purchased the pro version. -->
        <!-- Licensing information: https://bootstrapmade.com/license/ -->
        <!-- Purchase the pro version with working PHP/AJAX contact form: https://bootstrapmade.com/sailor-free-bootstrap-theme/ -->
        Designed by <a href="https://bootstrapmade.com/">BootstrapMade</a>
      </div>
    </div>
  </footer><!-- End Footer -->


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