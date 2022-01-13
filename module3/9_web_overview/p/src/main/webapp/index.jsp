<%--
  Created by IntelliJ IDEA.
  User: quocgunner
  Date: 12/28/21
  Time: 8:21 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Login</title>
  </head>
  <body>
  <form method="post" action="/login">
  <div>
    Username: <input name="username">
  </div>
  <div>
    Password: <input type="password" name="password">
  </div>
  <div>
    <button>Login</button>
  </div>
  </form>
  </body>
</html>
