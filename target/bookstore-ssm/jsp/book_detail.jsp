<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<h1>${book.name}</h1>
<ul class="list-group">
    <li class="list-group-item">${book.author}</li>
    <li class="list-group-item">${book.price}</li>
    <li class="list-group-item">${book.press}</li>
</ul>
<a href="<c:url value="/book/list" />">返回主页面</a>

</body>
</html>
