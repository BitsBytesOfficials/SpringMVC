<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Your reservation is confirmed successfully.</h3>
<p> Please, re-check the details.</p>  
First Name : ${reservationForm.firstName} <br>  
Last Name : ${reservationForm.lastName} <br>  
Gender: ${reservationForm.gender}<br>  
Meals:   
<ul>  
<c:forEach var="meal" items="${reservationForm.food}">  
<li>${meal}</li>  
</c:forEach>  
</ul>  
Leaving From : ${reservationForm.cityForm} <br>  
Going To : ${reservationForm.cityTo}  
</body>
</html>