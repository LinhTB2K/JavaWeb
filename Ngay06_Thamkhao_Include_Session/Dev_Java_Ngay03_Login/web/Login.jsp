<%-- 
    Document   : Login.jsp
    Created on : Aug 17, 2019, 10:02:13 AM
    Author     : Tran Manh Truong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Form đăng nhập</title>
    </head>
    <body>
        <h1>Đăng nhập hệ thống</h1>
        <form name="f1" id="f1" action="XulyLogin" method="post">
            Tài khoản: <input type="text" name="taikhoan" id="taikhoan">
            <br>
            Mật khẩu: <input type="password" name="matkhau" id="matkhau">
            <br>
            <input type="submit" name="b1" id="b1" value="Đăng nhập">
        </form>
    </body>
</html>
