<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>

<title>Video Section</title>

</head>
<body>

	<br>
	<p>Table of your films and series</p>
	<table>
<!-- TODO Add boostrap -->
		<c:forEach items="${videos}" var="video">
			<tr>
				<td>${video.name}</td>
				<td>${video.gender}</td>
			
			</tr>
		</c:forEach>
		<tr>
			<th></th>
		</tr>
	</table>
	
</body>
</html>