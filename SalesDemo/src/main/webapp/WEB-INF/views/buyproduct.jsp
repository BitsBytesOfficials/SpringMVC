<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sales Demo</title>
</head>
<body background="<c:url value="/resources/img/back.jpg"/>">
<h1>Welcome ${username}</h1>
Buying Date:- ${sellDate}<br>
Product :-${name}<br>
Quantity:- ${quant}<br>

${total}
</body>
</html>