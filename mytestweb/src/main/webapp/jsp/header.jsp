<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/30 0030
  Time: 16:30
  To change this template use File | Settings | File Templates.
--%>
<%@page import="java.util.*,java.text.SimpleDateFormat" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page pageEncoding="utf-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Date date1 = new Date();
    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh--mm-ss");
%>
当前系统时间：<%= sdf1.format(date1) %>
<% out.print("header page<br>"); %>


</body>
</html>
