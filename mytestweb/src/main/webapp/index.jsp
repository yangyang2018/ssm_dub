<%@page contentType="text/html; charset=UTF-8" language="java" %>
<html>
<head>
    <title> 开发中 。。。。。</title>
    <script type="text/javascript" src="./assets/js/jquery-1.7.2.min.js"></script>
</head>
<body>
<h2>Hello World!</h2>
<div>
    <h2>用异步请求获取学生信息</h2><br>
    请输入学生学号，如果是0则查询所有学生信息
    <input id="studentid"type="text"><button onclick="findStudentInfo()">点我查询</button>
    <div id="showMessageDiv"></div>
</div>
<script type="application/javascript">

    var findStudentInfo = function () {
        var studentid = $("#studentid").val();
        if (studentid.trim() == "") {
            alert("请输入学号");
            return;
        }
        if (isNaN(studentid)) {
            alert("请输入正确的数据格式");
            return;
        }
        $.ajax({
            type:"POST",
            url:"/studentApi/queryAll.do",
            data:{id:studentid},
            dataType:"json",
            success:function (data) {
                $("#showMessageDiv").empty();
                $("#showMessageDiv").append("<table id='table1'></table>");
                $("#table1").append("<tr><td>学生ID</td><td>姓名</td><td>性别</td><td>地址</td></tr>");
                $.each(data.data,function (i, obj) {
                    var item="<tr><td>"+obj.id+"</td><td>"+obj.name+"</td><td>"+obj.sex+"</td><td>"+obj.address+"</td>";
                    $("#table1").append(item);
                });
            },
            error:function () {
                alert("发生错误");
            }

        }

        );

    }


</script>
</body>
</html>
