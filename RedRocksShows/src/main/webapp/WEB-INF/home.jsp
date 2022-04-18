<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Red Rocks Shows</title>
</head>
<body>

	<h1>Welcome to Red Rocks</h1>
	<br>
	<br>

	<p>Following the Pandemic of the 21st, Colorado's Premiere Music
		Venue turned out an insane 134 shows booked from April through
		November 2021. Grossing over $60 million dollars with an attendance of
		996,570 attendees Red Rocks
	<p>
		
		${RedRocks.id}
		${RedRocks.name}
		${RedRocks.showDate}
		${RedRocks.genre}
		${RedRocks.price}$
		${RedRocks.showTime}
		
</body>
</html>