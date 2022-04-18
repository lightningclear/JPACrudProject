<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

${RedRocks.id}
		${RedRocks.name}
		${RedRocks.showDate}
		${RedRocks.genre}
		${RedRocks.price}$
		${RedRocks.showTime}
		
		<form action="update.do" method="POST">
			<input type="hidden" id="id" name="id" value="${RedRocks.id}">
				<label for="name" class="form-label">Name:</label> <input
					type="text" class="form-control" name="name" id="name"
					value="${RedRocks.name}">
				<label for="genre" class="form-label">Genre</label>
				<input type="text" class="form-control" name="genre"
					id="genre" value="${RedRocks.genre}">
			<input type="submit" class="btn btn-primary">
		</form>
		
		
		<form action="delete.do" method="post" >
			<button name="id" type="submit" value="${RedRocks.id}">Delete</button>
		</form>
		
		<a href="home"><button name="home" type="submit">Home</button></a>
</body>
</html>