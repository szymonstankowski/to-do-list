<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<body>

<br/>
<h2>
<a href="/todo/create/">ADD TODO</a><br/><br/>
</h2>
<hr>
<a href="/todo">TODO LIST</a><br/><br/>
<hr>


<c:forEach items="${todolist}" var="todo">
    <b>Id</b> ${todo.id}
    <a href="/todo/update/${todo.id}">UPDATE</a>
    <a href="/todo/delete/${todo.id}">DELETE</a>
    <br/>

    Text: ${todo.text}
    <br/>

    Status: ${todo.status}
    <br/><hr><br/>
</c:forEach>



<br/>
</body>
</html>