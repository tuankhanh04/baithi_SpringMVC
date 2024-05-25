<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Vehicles List</title>
</head>
<body>
<h2>Vehicles List</h2>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Model</th>
        <th>Year</th>
        <th>Color</th>
        <th>Actions</th>
    </tr>
    <c:forEach var="vehicle" items="${vehicles}">
        <tr>
            <td>${vehicle.id}</td>
            <td>${vehicle.vehicleName}</td>
            <td>${vehicle.vehicleModel}</td>
            <td>${vehicle.yearOfManufacture}</td>
            <td>${vehicle.vehicleColor}</td>
            <td>
                <a href="${pageContext.request.contextPath}/vehicles/${vehicle.id}">View</a>
                <c:if test="${isAdmin}">
                    | <a href="${pageContext.request.contextPath}/vehicles/update?id=${vehicle.id}">Edit</a>
                    | <a href="${pageContext.request.contextPath}/vehicles/delete?id=${vehicle.id}">Delete</a>
                </c:if>
            </td>
        </tr>
    </c:forEach>
</table>
<c:if test="${isAdmin}">
    <a href="${pageContext.request.contextPath}/vehicles/add">Add New Vehicle</a>
</c:if>
</body>
</html>

