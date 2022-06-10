<%-- 
    Document   : Login
    Created on : May 29, 2020, 8:30:58 PM
    Author     : Tran Manh Truong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Đăng nhập</title>
    </head>
    <body>
        <h1>Đăng nhập hệ thống!</h1>
        <form name="f1" id="f1" method="post" action="XulyLogin">
            Tài khoản: <input type="text" name="taikhoan" id="taikhoan">
            <br><br>
            Mật khẩu: <input type="password" name="matkhau" id="matkhau">
            <br><br>
            <input type="submit" name="b1" id="b1" value="Đăng nhập">
        </form>
    </body>
</html>
