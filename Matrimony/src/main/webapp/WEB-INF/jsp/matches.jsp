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
	Website Template | Matches :: w3layouts</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords"
	content="Marital Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript">
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 
</script>
</head>

<body>
	<%@include file="header.jsp"%>
	<script>
		angular.module('newMatchApp', []).controller("newMatchCtrl", function ($scope) {
			debugger;
			
			$scope.onLoad=function(){
				$.ajax({
		type : "GET",
		contentType : "application/json",
		url : "getRecentLoginProfile",
		dataType : "json",
		success : function(data) {
			debugger;
			
			if(data.status == "200"){
			$scope.matches = data.data;
			$scope.$digest();
			}
		},
		error : function(e) {
			debugger;
			console.log("ERROR: ", e);
		}
	});
			};
			
			
		    
		});
	</script>
	<div class="grid_3" ng-app="newMatchApp" ng-controller="newMatchCtrl" ng-init="onLoad();">
		<div class="container">
			<div class="breadcrumb1">
				<ul>         <a href="view_profile.html"> </tr>
									<tr class="opened_1">
										<td class="day_label1">Date of birth :</td>
										<td class="day_value">{{match.birthDate}}</td>
									</tr>
									<tr class="opened_1">
										<td class="day_label1">Height :</td>
										<td class="day_value">{{match.height}}</td>
									</tr>
									<tr class="closed">
										<td class="day_label1">Qualification :</td>
										<td class="day_value closed"><span>{{match.qualification}}</span></td>
									</tr>
									<tr class="opened">
										<td class="day_label1">Location :</td>
										<td class="day_value">{{match.workLocation}}</td>
						j7			</tr>
									<tr class="opened">
										<td class="day_label1">Last Login :</td>
										<td class="day_value">{{match.lastLogin}}</td>
									</tr>
								</tbody>
							</table>
							<div class="buttons">
								<div class="vertical">Show Details</div>
							</div>
						</div>
						<div class="clearfix"></div>
					</a>
				</div>
				<ul class="pagination">
					<li class="active"><a href="#">1</a></li>
					<li><a href="#">2</a></li>
					<li><a href="#">3</a></li>
					<li><a href="#">4</a></li>
				</ul>
			</div>
			<div class="clearfix"></div>
		</div>
	</div>
	<div>
		<%@include file="footer.jsp"%>
	</div>
</body>
</html>
