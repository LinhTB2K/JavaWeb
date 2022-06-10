<%-- 
    Document   : Logout.jsp
    Created on : 09-Jan-2022, 16:08:00
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Logout Page</title>
    </head>
    <body>
        <%
            //hủy biến session username
            session.removeAttribute("username");
        %>
        <h1>Bạn đã đăng xuất!</h1>
        <a href="Profile.jsp">Quay về trang Profile.jsp</a>
    </body>
</html>
