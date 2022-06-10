<%-- 
    Document   : Logout
    Created on : Jan 12, 2022, 8:20:08 PM
    Author     : vanli
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Đăng xuất</title>
    </head>
    <body>
        <%
            session.removeAttribute("username");
        %>
        <h1>Bạn đã đăng xuất</h1>
        <a href="profile.jsp">Quay về trang profile</a>
    </body>
</html>
