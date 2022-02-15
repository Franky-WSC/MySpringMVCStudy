<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello World!</title>
    <link rel="stylesheet" type="text/css" href="static/css/aaa.css">
    <script src="static/js/bbb.js"></script>
</head>
<body>
    <h2>Hello World!</h2>
<%--    <img src="static/img/mountain.jpg">--%>
    <div>form表单1</div>
    <form action="testRequest" method="get">
        <input type="submit" value="提交">
    </form>
    <div>form表单2</div>
    <form action="testRequest2" method="get">
        <input type="text" name="username">
        <input type="submit" value="测试params">
    </form>
    <div>form表单3</div>
    <form action="testRequest3" method="get">
        <input type="text" name="username">
        <input type="submit" value="测试header">
    </form>
</body>
</html>
