<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="icon" href="<c:url value="/assets/img/favicon.png"/>" type="image/png" sizes="16x16">
<title>Profile Service</title>

<link type="text/css" rel="stylesheet" href="<c:url value="/assets/bootstrap/css/bootstrap.css" />" />
<link type="text/css" rel="stylesheet" href="<c:url value="/assets/custom/css/custom.css" />" />

<script type="text/javascript" src="<c:url value="/assets/jquery/jquery-1.11.3.js" />"></script>
<script type="text/javascript" src="<c:url value="/assets/bootstrap/js/bootstrap.js" />"></script>

<script type="text/javascript">
	$(document).ready(function(){
		$("#add-new-button").click(function(){
			$("#existing").fadeOut(function(){
				$("#add-new-org").fadeIn();
			});
		});
		$("#existing-button").click(function(){
			$("#add-new-org").fadeOut(function(){
				$("#existing").fadeIn();
			});			
		});
	});
</script>
</head>
<body>
	<c:if test="${not empty auth_msg}">
		<p style="color:red">${auth_msg}</p>
	</c:if>
	<c:if test="${not empty added_org}">
		<p style="color:green">${added_org}</p>
	</c:if>
	<div class="container text-center">
		<div id="existing">
			<h1 style="color:white;font-size: 5em;">Welcome :)</h1>
			<div>
				<form:form class="form-inline" method="POST" action="${pageContext.request.contextPath}/check-org" modelAttribute="organization">
					<div class="form-group">
						<select id="org-select" name="id" class="form-control">
						  <option value="-1">---</option>
						  <c:forEach var="organization" items="${orgs}">
					        <option value="${organization.id}">${organization.name}</option>
					      </c:forEach>
						</select>
					</div>
					<div class="form-group">
						<input type="text" class="form-control" placeholder="private access key" name="password"/>
					</div>
					<input type="submit" class="btn btn-default" value="GO"/>
				</form:form>
				<br/>
				<a href="#" id="forgot-password"><b>forgot password</b></a>
			</div>
			<div>
				<br/>
				<a href="#" class="addbutton" id="add-new-button" title="add new"><img alt="add button" class="add-image" width="40"  src="<c:url value="/assets/img/add.png" />"></a>
			</div>
		</div>
		<div style="display:none" id="add-new-org">
			<form:form class="form-inline" method="POST" action="${pageContext.request.contextPath}/add-org" modelAttribute="organization">
				<input type="text" class="form-control" placeholder="Name" name="name"/>
				<input type="submit" class="btn btn-default" value="GO"/>
			</form:form>
			<a href="#" id="existing-button"><b>use an existing organization</b></a>
		</div>
	</div>
</body>
</html>