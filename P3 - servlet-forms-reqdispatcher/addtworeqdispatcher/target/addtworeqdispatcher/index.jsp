<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Adding Two Numbers</title>
</head>
<body>
    <h2>Adding Two Numbers</h2>
    
    <form action="addition" method="post">
        Enter 1st Number: <input type="text" name="number1"><br>
        Enter 2nd Number: <input type="text" name="number2"><br>
        <input type="submit" value="Add">
    </form>
    
    <%-- Display the result if available --%>
    <!--<c:if test="${not empty result}">
        <p>Result: ${result}</p>
    </c:if>-->
    
</body>
</html>
