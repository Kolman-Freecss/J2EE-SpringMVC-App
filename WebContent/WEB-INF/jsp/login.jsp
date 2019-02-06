<html>
<head>
<title>Login</title>
</head>
<body>

	${message}
	<br>
	<br>
	
	<div style="font-family: verdana; padding: 10px; border-radius: 10px; font-size: 12px; text-align: center;">

		Anime Library <br/><br/>
		
		There you have two pages where you could see anime <br/><br/>
		<a href="https://animeflv.net/" target='_blank'>AnimeFlv</a> <br/>
		<a href="https://jkanime.net/" target='_blank'>JkAnime</a> <br/><br/>
		
		<!-- Post Request -->
		<form action="videos/videoTable" method="GET">
		
			Enter your name: <input type="text" name="name" /> 
			Password <input type="password" name="password" /> 
			
			<input type="submit" value="Login" />
		</form>
		
	</div>
	
</body>
</html>