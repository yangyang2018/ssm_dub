<%--
  Created by IntelliJ IDEA.
  User: yangyang
  Date: 2017/9/29
  Time: 下午10:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加学生信息</title>
</head>
<body>
     <form action="add.do" method="get">
         Name:<br><input type="text" name="name"/><br>
         Sex:
         </br>男<input type="checkbox" name="sex" value="1"/>
         </br>女<input type="checkbox" name="sex" value="0"/>
         </br>
         地址：<input name="address" type="text">
         </br>
         <input type="submit" value="提交">
     </form>

</body>
</html>
