<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
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

<form:form method="post" action="/todo/create/" modelAttribute="todo" id="todoform">
    Text: <form:input path="text"/>
          <form:errors path="text"/><br/><br/>
    <form:select path="status" id="state" form="todoform">
      <option value="inProgress">inProgress</option>
      <option value="complete">complete</option>
    </form:select>

    <br/>
    <input type="submit" id="submit" value="Add TODO">
    <br/><br/><br/>
</form:form>



</body>
</html>