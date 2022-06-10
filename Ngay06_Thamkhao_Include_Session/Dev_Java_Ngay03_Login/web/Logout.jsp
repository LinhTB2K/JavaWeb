<%-- 
    Document   : Logout
    Created on : Aug 17, 2019, 10:29:13 AM
    Author     : Tran Manh Truong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Đăng xuất</title>
    </head>
    <body>
        <h1>Bạn đã đăng xuất khỏi hệ thống</h1>
        <%
            session.removeAttribute("taikhoan");
        %>
        <a href="profile.jsp"> vào lại trang Profile</a>
    </body>
</html>
