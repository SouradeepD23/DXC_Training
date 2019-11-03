<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
Welcome to Find My Resturant.com
</h1>

<form action="saveRest">
<input type="text" name="name">
<input type="text" name="location">
<input type="text" name="rating">
<input type="submit" value="Save Resturant">
</form>


</body>
</html>
