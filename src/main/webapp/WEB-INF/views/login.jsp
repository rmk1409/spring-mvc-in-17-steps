<%--
  Created by IntelliJ IDEA.
  User: roman.pogorelov
  Date: 08.12.2019
  Time: 12:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
${badCreds}
<form action="/login.do" method="post">
    Enter your name <input type="text" name="name"/>
    Enter your password <input type="password" name="password"/>
    <input type="submit"/>
</form>
</body>
</html>
