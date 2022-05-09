<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<div>
    <h4>Please enter name of 2-nd player</h4>

    <form:form action="saveP2" modelAttribute="player2">
        <form:input path="name"/>
        <br><br>
        <input type="submit" value="SAVE"
               onclick="window.location.href = 'saveP2'"/>
    </form:form>
</div>
</body>
</html>