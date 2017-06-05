<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Marital an Wedding Category Flat Bootstarp Resposive Website Template | Login :: w3layouts</title>
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
<script src="http://code.jquery.com/jquery-1.11.0.min.js"></script>
<link href="<c:url value='/resources/css/font-awesome.css'/>" rel="stylesheet" type="text/css" />
<!----font-Awesome----->

</head>
<body>
 <div class="navbar navbar-inverse-blue navbar">
    <!--<div class="navbar navbar-inverse-blue navbar-fixed-top">-->
      <div class="navbar-inner navbar-inner_1">
        <div class="container">
           <div class="navigation">
             <nav id="colorNav">
			   <ul>
				<li class="green">
				  <a href="#" class="icon-home"></a>
				  <ul>
					<li><a href="loginPage">Login</a></li>
					<li><a href="registrationPage">Register</a></li>
					<li><a href="logout">Logout</a></li>
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
		            <li class="last"><a href="contact.html">Contacts</a></li>
		        </ul>
		     </div>
		    </nav>
		   </div> <!-- end pull-right -->
          <div class="clearfix"> </div>
        </div> <!-- end container -->
      </div> <!-- end navbar-inner -->
    </div> <!-- end navbar-inverse-blue -->
	<div class="grid_3">
		<div class="container">
			<div class="breadcrumb1">
				<ul>
					<a href="index"><i class="fa fa-home home_1"></i></a>
					<span class="divider">&nbsp;|&nbsp;</span>
					<li class="current-page">Register</li>
				</ul>
			</div>

			<div class="about">
				<div class="jb-accordion-title" style="background-color: #c32143">Personal
					Details</div>
				<div>
					<br />
				</div>
				<form action="addUser">
				<div class="basic_1">
					<div class="col-md-6 basic_1-left">
						<table class="table_working_hours">
							<tbody>
								<tr class="opened_1">
									<td class="day_label">First Name :</td>
									<td class="day_value"><input placeholder="First Name"
										type="text" id="firstName"></td>
								</tr>
								<tr class="opened">
									<td class="day_label">Middle Name :</td>
									<td class="day_value"><input placeholder="Middle Name"
										type="text" id="middleName"></td>
								</tr>
								<tr class="opened">
									<td class="day_label">Last Name :</td>
									<td class="day_value"><input placeholder="Last Name"
										type="text" id="lastName"></td>
								</tr>
								<tr class="opened">
									<td class="day_label">Gender :</td>
									<td class="day_value">
										<div class="select-block1"
											style="max-width: 100%; display: inline-block;">
											<select id="gender">
												<option value="0">Please Select</option>
												<option value="male">Male</option>
												<option value="female">Female</option>
											</select>
										</div>
									</td>
								</tr>
								<tr class="opened">
									<td class="day_label">Birth Date :</td>
									<td class="day_value">
										<div class="age_grid">
											<div class="col-sm-3 form_box">
												<div class="select-block1">
													<select id="date">
														<option value="00">Date</option>
														<option value="01">1</option>
														<option value="02">2</option>
														<option value="03">3</option>
														<option value="04">4</option>
														<option value="05">5</option>
														<option value="06">6</option>
														<option value="07">7</option>
														<option value="08">8</option>
														<option value="09">9</option>
														<option value="10">10</option>
														<option value="11">11</option>
														<option value="12">12</option>
														<option value="13">13</option>
														<option value="14">14</option>
														<option value="15">15</option>
														<option value="16">16</option>
														<option value="17">17</option>
														<option value="18">18</option>
														<option value="19">19</option>
														<option value="20">20</option>
														<option value="21">21</option>
														<option value="22">22</option>
														<option value="23">23</option>
														<option value="24">24</option>
														<option value="25">25</option>
														<option value="26">26</option>
														<option value="27">27</option>
														<option value="28">28</option>
														<option value="29">29</option>
														<option value="30">30</option>
														<option value="31">31</option>
													</select>
												</div>
											</div>
											<div class="col-sm-3 form_box2">
												<div class="select-block1">
													<select id="month">
														<option value="00">Month</option>
														<option value="01">January</option>
														<option value="02">February</option>
														<option value="03">March</option>
														<option value="04">April</option>
														<option value="05">May</option>
														<option value="06">June</option>
														<option value="07">July</option>
														<option value="08">August</option>
														<option value="09">September</option>
														<option value="10">October</option>
														<option value="11">November</option>
														<option value="12">December</option>
													</select>
												</div>
											</div>
											<div class="col-sm-3 form_box1">
												<div class="select-block1">
													<select id="year">
														<option value="0000">Year</option>
														<option value="1980">1980</option>
														<option value="1981">1981</option>
														<option value="1982">1982</option>
														<option value="1983">1983</option>
														<option value="1984">1984</option>
														<option value="1985">1985</option>
														<option value="1986">1986</option>
														<option value="1987">1987</option>
														<option value="1988">1988</option>
														<option value="1989">1989</option>
														<option value="1990">1990</option>
														<option value="1991">1991</option>
														<option value="1992">1992</option>
														<option value="1993">1993</option>
														<option value="1994">1994</option>
														<option value="1995">1995</option>
														<option value="1996">1996</option>
														<option value="1997">1997</option>
														<option value="1998">1998</option>
														<option value="1999">1999</option>
														<option value="2000">2000</option>
													</select>
												</div>
											</div>
										</div>
									</td>
								</tr>
							</tbody>
						</table>
					</div>
					<div class="col-md-6 basic_1-left">
						<table class="table_working_hours">
							<tbody>
								<tr class="opened">
									<td class="day_label">Location :</td>
									<td class="day_value"><input placeholder="Location"
										id="location" type="text"></td>
								</tr>
								<tr class="opened">
									<td class="day_label">Email id :</td>
									<td class="day_value"><input placeholder="Email Id"
										id="email" type="text"></td>
								</tr>
								<tr class="opened">
									<td class="day_label">Mobile :</td>
									<td class="day_value"><input placeholder="Mobile Number"
										type="text" id="contact"></td>
								</tr>
								<tr class="opened">
									<td class="day_label">Password :</td>
									<td class="day_value"><input placeholder="Enter Password"
										id="password" type="password"></td>
								</tr>
								<tr class="closed">
									<td class="day_label">Confirm Password :</td>
									<td class="day_value"><input
										placeholder="Re-enter Password" id="rePassword"
										type="password"></td>
								</tr>
							</tbody>
						</table>
					</div>

					<div class="clearfix"></div>

					<div  id="register" style="margin-top: 20px"
						class="btn button btn_1 submit">Register</div>
				</div>
				</form>
			</div>
		</div>
	</div>

	<div class="clearfix"></div>

	<div>
		<%@include file="footer.jsp"%>
	</div>

	<script>
		$(document).ready(function(){
			$("#register").click(function(){
			
		var firstName = $("#firstName").val().trim();
		var middleName = $("#middleName").val().trim();
		var lastName = $("#lastName").val().trim();
		var gender = $("#gender").val().trim();
		var email = $("#email").val().trim();
		var contact = $("#contact").val().trim();
		var location = $("#location").val().trim();
		var mobile = $("#contact").val().trim();
		var password = $("#password").val().trim();
		var dob=$("#year").val().trim()+"-"+$("#month").val().trim()+"-"+$("#date").val().trim();
		
			var requestData = {
			firstName : firstName,
			middleName : middleName,
			lastName : lastName,
			gender : gender,
			dateOfBirth : dob,
			email : email,
			mobile : mobile,
			landline : contact,
			currentAddress : location,
			password : password		
		};
			if(password == $("#rePassword").val().trim()){
				$.ajax({
					type : "POST",
					contentType : "application/json",
					url : "addUser",
					data : JSON.stringify(requestData),
					dataType : "json",
					success : function(data) {
						
						if(data.status == "200"){
						window.location.href = "loginPage"
						alert(data.message);
						}
					},
					error : function(e) {
						console.log("ERROR: ", e);
					}
				});
			} else {
				alert("Password and confirm password are not matching.");
			}
		
			});
		});
	</script>
</body>
</html>
