<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>

<title>Anime Section</title>

</head>
<body>

	<br>
	<p>Table of your animes</p>
	<table>
		<c:forEach items="${animes}" var="anime">
			<tr>
				<td>${anime.name}</td>
				<td>${anime.gender}</td>
			
			</tr>
		</c:forEach>
		<tr>
			<th></th>
		</tr>
	</table>
	
</body>
</html>