<%--
  Created by IntelliJ IDEA.
  User: _Franky_
  Date: 2022/2/16
  Time: 21:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="testRest/10" method="get">
    <input type="submit" value="GET">
</form>

<form action="testRest/10" method="post">
    <input type="submit" value="POST">
</form>

<form action="testRest/10" method="post">
    <%--请求中携带一个特殊的参数 _method 用该参数表述PUT 和 DELETE--%>
    <input type="hidden" name="_method" value="PUT">
    <input type="submit" value="PUT">
</form>

<form action="testRest/10" method="post">
    <%--请求中携带一个特殊的参数 _method 用该参数表述PUT 和 DELETE--%>
    <input type="hidden" name="_method" value="DELETE">
    <input type="submit" value="DELETE">
</form>

</body>
</html>
