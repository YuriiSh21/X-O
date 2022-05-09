<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Players</title>
</head>
<body>
Player 1 - ${p1Name}
<input type="button" value="EDIT"
       onclick="window.location.href = 'nameP1'"/>
<br>
Player 2 - ${p2Name}
<input type="button" value="EDIT"
       onclick="window.location.href = 'nameP2'"/>
<br>
<br>
<br>
<input type="button" value="MENU"
       onclick="window.location.href = '/exchange/'"/>

<input type="button" value="New GAME"
       onclick="window.location.href = 'newGame'"/>
</body>
</html>
