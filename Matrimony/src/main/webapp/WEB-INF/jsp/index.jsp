<!--A Design by W3layouts
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Perfect Match</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Marital Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<link href="<c:url value='/resources/css/bootstrap-3.1.1.min.css'/>" rel="stylesheet" type="text/css" />

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script type="text/javascript" src="<c:url value='/resources/js/jquery-2.0.3.min.js' />" defer="true"></script>
<script type="text/javascript" src="<c:url value='/resources/js/bootstrap.min.js' />" defer="true"></script>
<!-- Custom Theme files>
<link href="css/style.css" rel='stylesheet' type='text/css' /-->

<link href="<c:url value='/resources/css/style.css'/>" rel="stylesheet" type="text/css" />

<link href='//fonts.googleapis.com/css?family=Oswald:300,400,700' rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Ubuntu:300,400,500,700' rel='stylesheet' type='text/css'>
<!----font-Awesome----->
<link href="<c:url value='/resources/css/font-awesome.css'/>" rel="stylesheet" type="text/css" />
<!----font-Awesome----->
<script src="http://code.jquery.com/jquery-1.11.0.min.js"></script>
<link href="<c:url value='/resources/css/flexslider.css'/>" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="<c:url value='/resources/js/jquery.flexslider.js' />" defer="true"></script>
</head>
<body>
<!-- ============================  Navigation Start =========================== -->
 <div class="navbar navbar-inverse-blue navbar">
    <!--<div class="navbar navbar-inverse-blue navbar-fixed-top">-->
      <div class="navbar-inner">
        <div class="container">
           <div class="navigation">
             <nav id="colorNav">
			   <ul>
				<li class="green">
					<a href="#" class="icon-home"></a>
					<ul>
						<li><a href="loginPage">Login</a></li>
					    <li><a href="registrationPage">Register</a></li>
					    <li><a href="indexPage">Logout</a></li>
					</ul>
				</li>
			   </ul>
             </nav>
           </div>
           <a class="brand" href="index.html"><img src="<c:url value='/resources/images/logo.png' />"></a>
           <div class="pull-right">
          	<nav class="navbar nav_bottom" role="navigation">
            <!-- Brand and toggle get grouped for better mobile display -->
		  <div class="navbar-header nav_2">
		      <button type="button" class="navbar-toggle collapsed navbar-toggle1" data-toggle="collapse" data-target="#bs-megadropdown-tabs">Menu
		        <span class="sr-only">Toggle navigation</span>
		        <span class="icon-bar"></span>
		        <span class="icon-bar"></span>
		        <span class="icon-bar"></span>
		      </button>
		      <a class="navbar-brand" href="#"></a>
		   </div> 
		   <!-- Collect the nav links, forms, and other content for toggling -->
		    <div class="collapse navbar-collapse" id="bs-megadropdown-tabs">
		        <ul class="nav navbar-nav nav_1">
		            <li><a href="index.html">Home</a></li>
		            <li><a href="loginPage">Login</a></li>
					<li><a href="#">FAQ</a></li>
		            <li><a href="aboutUs">About Us</a></li>
		            <li class="last"><a href="contactPage">Contacts</a></li>
		        </ul>
		     </div><!-- /.navbar-collapse -->
		    </nav>
		   </div> <!-- end pull-right -->
          <div class="clearfix"> </div>
        </div> <!-- end container -->
      </div> <!-- end navbar-inner -->
    </div> <!-- end navbar-inverse-blue -->
<!-- ============================  Navigation End ============================ -->
<div class="banner">
  <div class="container">
    <div class="banner_info">
      <h3>Millions of verified Members</h3>
      <a href="registrationPage" class="hvr-shutter-out-horizontal">Create your Profile</a>
    </div>
  </div>
  <div class="profile_search">
  	<div class="container wrap_1">
	  <form>
	  	<div class="search_top">
		 <div class="inline-block">
		  <label class="gender_1">I am looking for :</label>
			<div class="age_box1" style="max-width: 100%; display: inline-block;">
				<select>
					<option value="">* Select Gender</option>
					<option value="Male">Bride</option>
					<option value="Female">Groom</option>
				</select>
		   </div>
	    </div>
        <div class="inline-block">
		  <label class="gender_1">Located In :</label>
			<div class="age_box1" style="max-width: 100%; display: inline-block;">
				<select>
					<option value="">* Select State</option>
					<option value="Washington">Washington</option>
					<option value="Texas">Texas</option>
					<option value="Georgia">Georgia</option>
					<option value="Virginia">Virginia</option>
					<option value="Colorado">Colorado</option>
               </select>
          </div>
        </div>
        <div class="inline-block">
		  <label class="gender_1">Interested In :</label>
			<div class="age_box1" style="max-width: 100%; display: inline-block;">
				<select><option value="">* Select Interest</option>
					<option value="Sports &amp; Adventure">Sports &amp; Adventure</option>
					<option value="Movies &amp; Entertainment">Movies &amp; Entertainment</option>
					<option value="Arts &amp; Science">Arts &amp; Science</option>
					<option value="Technology">Technology</option>
					<option value="Fashion">Fashion</option>
               </select>
          </div>
       </div>
     </div>
	 <div class="inline-block">
	   <div class="age_box2" style="max-width: 220px;">
	   	<label class="gender_1">Age :</label>
	    <input class="transparent" placeholder="From:" style="width: 34%;" type="text" value="">&nbsp;-&nbsp;<input class="transparent" placeholder="To:" style="width: 34%;" type="text" value="">
	   </div>
	 </div>
       <div class="inline-block">
		  <label class="gender_1">Status :</label>
			<div class="age_box1" style="max-width: 100%; display: inline-block;">
				<select>
					<option value="">* Select Status</option>
					<option value="Single">Single</option>
					<option value="Married">Married</option>
					<option value="In a Relationship">In a Relationship</option>
					<option value="It's Complicated">It's Complicated</option>
				</select>
		  </div>
	    </div>
		<div class="submit inline-block">
		   <input id="submit-btn" class="hvr-wobble-vertical" type="submit" value="Find Matches" >
		</div>
     </form>
    </div>
  </div> 
</div> 
<div class="grid_1">
      <center>
      <h3>Guest Messages</h3> </center>
		<div class="heart-divider">
			<span class="grey-line"></span>
			<i class="fa fa-heart pink-heart"></i>
			<i class="fa fa-heart grey-heart"></i>
			<span class="grey-line"></span>
        </div>

   <div class="bg">
	<div class="container"> 
		
           <div class="col-sm-6">
           	<div class="bg_left">
           		<h4>But I must explain</h4>
           		<h5>Friend of Bride</h5>
           		<p>"Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo.</p>
           	   <ul class="team-socials">
                   <li><a href="#"><span class="icon-social "><i class="fa fa-facebook"></i></span></a></li>
                   <li><a href="#"><span class="icon-social "><i class="fa fa-twitter"></i></span></a></li>
                   <li><a href="#"><span class="icon-social"><i class="fa fa-google-plus"></i></span></a></li>
                  </ul>
           	</div>
           </div>
           <div class="col-sm-6">
           	<div class="bg_left">
           		<h4>But I must explain</h4>
           		<h5>Friend of Groom</h5>
           		<p>"Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo.</p>
           	   <ul class="team-socials">
                   <li><a href="#"><span class="icon-social "><i class="fa fa-facebook"></i></span></a></li>
                   <li><a href="#"><span class="icon-social "><i class="fa fa-twitter"></i></span></a></li>
                   <li><a href="#"><span class="icon-social"><i class="fa fa-google-plus"></i></span></a></li>
                  </ul>
           	</div>
           </div>
           <div class="clearfix"> </div>
	</div>
</div>	
</div>

   <div class="footer">
   	<div class="container">
   		<div class="col-md-4 col_2">
   			<h4>About Us</h4>
   			<p>"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris."</p>
   		</div>
   		<div class="col-md-2 col_2">
   			<h4>Help & Support</h4>
   			<ul class="footer_links">
   				<li><a href="#">24x7 Live help</a></li>
   				<li><a href="contact.html">Contact us</a></li>
   				<li><a href="#">Feedback</a></li>
   				<li><a href="faq.html">FAQs</a></li>
   			</ul>
   		</div>
   		<div class="col-md-2 col_2">
   			<h4>Quick Links</h4>
   			<ul class="footer_links">
   				<li><a href="privacy.html">Privacy Policy</a></li>
   				<li><a href="terms.html">Terms and Conditions</a></li>
   				<li><a href="services.html">Services</a></li>
   			</ul>
   		</div>
   		<div class="col-md-2 col_2">
   			<h4>Social</h4>
   			<ul class="footer_social">
			  <li><a href="#"><i class="fa fa-facebook fa1"> </i></a></li>
			  <li><a href="#"><i class="fa fa-twitter fa1"> </i></a></li>
			  <li><a href="#"><i class="fa fa-google-plus fa1"> </i></a></li>
			  <li><a href="#"><i class="fa fa-youtube fa1"> </i></a></li>
		    </ul>
   		</div>
   		<div class="clearfix"> </div>
   	</div>
  </div>
  <script>

$(document).ready(function(){
    $(".dropdown").hover(            
        function() {
            $('.dropdown-menu', this).stop( true, true ).slideDown("fast");
            $(this).toggleClass('open');        
        },
        function() {
            $('.dropdown-menu', this).stop( true, true ).slideUp("fast");
            $(this).toggleClass('open');       
        }
    );
});
</script>
</body>
</html>	