<!DOCTYPE html>
<html>
<head>
    <title>Vehicle Detail</title>
</head>
<body>
<h2>Vehicle Detail</h2>
<p>ID: ${vehicle.id}</p>
<p>Name: ${vehicle.vehicleName}</p>
<p>Model: ${vehicle.vehicleModel}</p>
<p>Year: ${vehicle.yearOfManufacture}</p>
<p>Color: ${vehicle.vehicleColor}</p>
<a href="${pageContext.request.contextPath}/vehicles">Back to List</a>
</body>
</html>

