<!--<%@ page isELIgnored="false" %>-->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Result Page</title>
</head>
<body>
    <h2>Result Page</h2>
    <p>Sum: <%= request.getAttribute("sum") %></p>
    <p>Sum: ${sum}</p>
</body>
</html>
