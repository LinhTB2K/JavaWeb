<%-- 
    Document   : QuanlyTaikhoan
    Created on : 16-Jan-2022, 15:34:30
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    int role = (Integer) session.getAttribute("role");
    if(role!=1)
        response.sendRedirect("Login.jsp");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Quản lý tài khoản - dành cho Admin</title>
    </head>
    <body>
        <h1>Quản lý tài khoản!</h1>
        <h3>Hello: ${sessionScope.fullname}</h3>
        <h3><a href="Profile.jsp">Vào trang Profile</a></h3>
        <a href="Logout.jsp">Thoát</a>
    </body>
</html>
