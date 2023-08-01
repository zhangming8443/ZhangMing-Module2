<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 7/28/2023
  Time: 09:34
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/students?action=create">
    <input name="nameStudent">
    <input name="point">
    <input name="idCard">
    <select name="codeClass">
       <c:forEach items="${classrooms}" var="classroom">
           <option value="${classroom.codeClass}">${classroom.nameClass}</option>
       </c:forEach>
    </select>
    <button type="submit">Create</button>
</form>
</body>
</html>
