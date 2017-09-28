<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/28 0028
  Time: 9:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${students}" var="s">
    <table>
        <tr>
            <td>id:${s.id}</td>
            <td>name:${s.name}</td>
            <td>set:${s.sex}</td>
            <td>address:${s.address}</td>
        </tr>
    </table>
</c:forEach>

</body>
</html>
