<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h2>Login</h2>
<form action="${pageContext.request.contextPath}/members/login" method="post">
    <label for="userId">User ID:</label>
    <input type="text" id="userId" name="userId" required><br><br>
    <label for="password">Password:</label>
    <input type="password" id="password" name="password" required><br><br>
    <button type="submit">Login</button>
</form>
<c:if test="${not empty message}">
    <p>${message}</p>
</c:if>
</body>
</html>

