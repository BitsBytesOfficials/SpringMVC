<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Resersvation Page</h2>

	<h3>Railway Reservation Form</h3> 
		<form:form action="submitForm" modelAttribute="reservationForm">  
        First name: <form:input path="firstName" />         
        <br><br>  
        Last name: <form:input path="lastName" />  
        <br><br>  
        Gender:   
        Male<form:radiobutton path="gender" value="Male"/>  
        Female<form:radiobutton path="gender" value="Female"/>  
        <br><br>  
        Meals:  
        BreakFast<form:checkbox path="food" value="BreakFast"/>  
        Lunch<form:checkbox path="food" value="Lunch"/>  
        Dinner<form:checkbox path="food" value="Dinner"/>  
        <br><br>  
        Leaving from: <form:select path="cityForm">  
        <form:option value="Bangalore" label="Bangalore"/>  
        <form:option value="Delhi" label="Delhi"/>  
        <form:option value="Chennai" label="Chennai"/>  
        <form:option value="Mumbai" label="Mumbai"/>  
        </form:select>  
        <br><br>  
        Going to: <form:select path="cityTo">  
         <form:option value="Bangalore" label="Bangalore"/>  
        <form:option value="Delhi" label="Delhi"/>  
        <form:option value="Chennai" label="Chennai"/>  
        <form:option value="Mumbai" label="Mumbai"/>    
        </form:select>  
        <br><br>  
        <input type="submit" value="Submit" />  
    </form:form>  
</body>
</html>