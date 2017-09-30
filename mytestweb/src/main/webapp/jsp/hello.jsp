<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/30 0030
  Time: 16:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="header.jsp"%>
<%@page pageEncoding="utf-8" %>


<html>
<head>
    <title>hello</title>
</head>
<body>

<!-- Hello JSP <%=" hello "%> -->
<%-- Hello JSP out.print("hello %"); --%>
<%
    for (int i = 0; i < 10; i++) {
%>
       <%= "NO"+i+"Hello JSP"%><br>
<%
    }
%>




</body>
<%@ include file="footer.jsp"%>
</html>
