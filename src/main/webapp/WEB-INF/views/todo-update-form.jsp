<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html lang="pl">
    <head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <meta http-equiv="X-UA-Compatible" content="ie=edge"/>
    <script src="resources/js/app.js"/></script>
    </head>
<body>
<hr>
<a href="/todo">TODO LIST</a><br/><br/>
<hr>

<form:form method="post" action="/todo/adjust/${todo.id}" modelAttribute="todo" id="todoupdateform">

    Text: <form:input path="text"/><br/><br/>

    <select name="status" id="state" form="todoupdateform">
      <option value="inProgress">inProgress</option>
      <option value="complete">complete</option>
    </select>

    <br/>
    <input type="submit" value="Update">
    <br/><br/><br/>
</form:form>
</body>
</html>