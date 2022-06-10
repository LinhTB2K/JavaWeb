<%-- 
    Document   : profile
    Created on : May 29, 2020, 8:53:04 PM
    Author     : Tran Manh Truong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trang cá nhân</title>
    </head>
    <body>
        <h1>Trang cá nhân - cần đăng nhập!</h1>
        <h3>Xin chào: ${sessionScope.taikhoan}</h3>
        <a href="Logout.jsp">Đăng xuất</a>
    </body>
</html>
