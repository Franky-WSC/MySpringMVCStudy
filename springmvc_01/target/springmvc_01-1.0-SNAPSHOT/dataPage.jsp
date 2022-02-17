<%--
  Created by IntelliJ IDEA.
  User: _Franky_
  Date: 2022/2/17
  Time: 10:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>DataPage</title>
</head>
<body>
<form action="getParamByRequest.do" method="get">
    用户名:
    <input type="text" name="username">
    密码:
    <input type="text" name="password">
    <input type="submit" value="byRequest">
</form>
<div></div>
<form action="getParamByArgName.do" method="get">
    用户名:
    <input type="text" name="username">
    密码:
    <input type="text" name="pwd">
    <input type="submit" value="noRequest">
</form>
</body>
</html>
