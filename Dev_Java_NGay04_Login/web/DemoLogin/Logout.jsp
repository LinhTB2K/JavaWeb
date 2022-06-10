<%-- 
    Document   : Logout
    Created on : May 29, 2020, 9:06:49 PM
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
        <h1>Bạn đã đăng xuất!</h1>
        <%
            session.removeAttribute("taikhoan");//hủy biến Session taikhoan
        %>
        <a href="profile.jsp">Quay về trang Profile</a>
    </body>
</html>
