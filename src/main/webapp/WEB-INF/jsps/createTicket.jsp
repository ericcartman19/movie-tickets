<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Crear Tickets</title>
</head>
<body>

	<form action="createTicket" method="post">
	
	<!-- si usamos los mismos nombre para los componentes que en el model, Spring hara el bindgin de manera automatica -->
	Movie Name: <input type="text" name="movie">
	Movie Screen: <input type="text" name="screen">
	Movie Seat: <input type="text" name="seat"> 
	
	<input type="submit" value="purchase"/>
	</form>

</body>
</html>