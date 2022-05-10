<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Congratulations</title>
</head>
<body>
<h1>CONGRATULATIONS!!!</h1>

<H4>Player ${winner} - win!</H4>
<p><img src="images/board.jpg" alt="Imagens"></p>
<%--<p><img src="images/Salute.jpg" alt="Image"></p>--%>


<input type="button" value="New GAME"
       onclick="window.location.href = 'newGame'"/>
<br>
<br>
<input type="button" value="SHOW PLAYERS"
       onclick="window.location.href = 'showPlayers'"/>
<br>
<br>
<input type="button" value="MENU"
       onclick="window.location.href = '/exchange/'"/>
</body>
</html>


