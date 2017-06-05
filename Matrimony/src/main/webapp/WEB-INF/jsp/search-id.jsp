<!--A Design by W3layouts

Author: W3layout

Author URL: http://w3layouts.com

License: Creative Commons Attribution 3.0 Unported

License URL: http://creativecommons.org/licenses/by/3.0/

-->

<!DOCTYPE HTML>

<html>

<head>

<title>Marital an Wedding Category Flat Bootstarp Resposive

	Website Template | Search-id :: w3layouts</title>

<meta name="viewport" content="width=device-width, initial-scale=1">

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<meta name="keywords"
	content="Marital Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 

Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />

<script type="application/x-javascript">
	






addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 












</script>



<script>
	
</script>

</head>

<body>

	<%@include file="header.jsp"%>

	<div class="grid_3" ng-app="searchApp" ng-controller="searchCtrl">

		<div class="container">

			<div class="breadcrumb1">

				<ul>

					<a href="index.html"><i class="fa fa-home home_1"></i></a>

					<span class="divider">&nbsp;|&nbsp;</span>

					<li class="current-page">Search By Profile ID</li>

					<li class="current-page">

						<div class="profile_search1">

							<form>

								<input type="text" class="m_1" name="ne" id="profileId"
									size="60" required placeholder="Enter Profile ID :"> <input
									type="submit" ng-click="onSearch();" value="Go">

							</form>

						</div>

					</li>

				</ul>

			</div>

			<div class="container">

				<div class="profile_top" ng-show="searchDiv">

					

						<h2>{{match.profileId}}</h2>

						<div class="col-sm-3 profile_left-top">

							<img src="http://localhost:8080/matrimony/resources/images/3.jpg" class="img-responsive" alt="" />

						</div>

						<div class="col-sm-6">

							<table class="table_working_hours">

								<tbody>

									<tr class="opened_1">

										<td class="day_label1">Full Name :</td>

										<td class="day_value">{{match.fullName}}</td>

									</tr>

									<tr class="opened_1">

										<td class="day_label1">Date of birth :</td>

										<td class="day_value">{{match.birthDate}}</td>

									</tr>

									<tr class="opened_1">

										<td class="day_label1">Height:</td>

										<td class="day_value">{{match.height}}</td>

									</tr>

									<tr class="opened">

										<td class="day_label1">Religion :</td>

										<td class="day_value">{{match.religion}}</td>

									</tr>

									<tr class="closed">

										<td class="day_label1">Qualification :</td>

										<td class="day_value closed"><span>{{match.qualification}}</span></td>

									</tr>

									<tr class="opened">

										<td class="day_label1">Location :</td>

										<td class="day_value">{{match.workLocation}}</td>

									</tr>

									<tr class="opened">

										<td class="day_label1">Last Login :</td>

										<td class="day_value">{{match.lastLogin}}</td>

									</tr>

								</tbody>

							</table>

							<div class="buttons">

								<div id = "showDetails" class="vertical">Show Details</div>

							</div>

						</div>

						<div class="clearfix"></div>

					</a>

				</div>



			</div>

			<div class="footer">

				<%@include file="footer.jsp"%>

			</div>

			<!-- FlexSlider -->

		</div>

	</div>

	<script type="text/javascript">
		angular.module("searchApp", []).controller("searchCtrl",

		function($scope) {

			$scope.searchDiv = false;

			$scope.onSearch = function() {

				var id = $("#profileId").val();

				var requestData = {

					profileId : id

				}

				$.ajax({

					type : "GET",

					contentType : "application/json",

					url : "searchById",

					data : requestData,

					dataType : "json",

					success : function(data) {


						if (data.status == "200") {

							$scope.match = data.data;
							$scope.searchDiv = true;
							$scope.$digest();
						}

					},

					error : function(e) {

						console.log("ERROR: ", e);

					}

				});

			};

		});

		$(document).ready(function() {

			$("#showDetails").click(function() {

				debugger;

				window.location.href = "viewProfilePage"

			});

		});

		$(function() {

			//SyntaxHighlighter.all();

		});

		$(window).load(function() {

			$('.flexslider').flexslider({

				animation : "slide",

				start : function(slider) {

					$('body').removeClass('loading');

				}

			});

		});
	</script>

	<!-- FlexSlider -->

</body>

</html>

