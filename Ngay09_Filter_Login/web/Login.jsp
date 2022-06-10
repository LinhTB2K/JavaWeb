<%-- 
    Document   : Login.jsp
    Created on : 09-Jan-2022, 15:41:04
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Đăng nhập</title>
    </head>
    <body>
        <h1>Đăng nhập trang cá nhân!</h1>
        <form name="f1" id="f1" action="xulylogin">
            <p>Username: <input type="text" name="tUser" id="tUser"></p>
            <p>Password: <input type="password" name="tPass" id="tPass"></p>
            <p><input type="submit" name="b1" id="b1" value="Đăng nhập"</p>
        </form>
    </body>
</html>
