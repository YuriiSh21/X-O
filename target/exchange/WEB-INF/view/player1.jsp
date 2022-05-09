<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<body>
<div>
    <h4>Please enter name of 1-st player</h4>

    <form:form action="saveP1" modelAttribute="player">
        <form:input path="name"/>
        <br><br>
        <input type="submit" value="SAVE"
               onclick="window.location.href = 'saveP1'"/>
    </form:form>

</div>
</body>
</html>