<%-- 
    Document   : main_page
    Created on : May 22, 2020, 7:50:47 PM
    Author     : Tran Manh Truong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trang Chính</title>
    </head>
    <body>
        <h1>Trang chính!</h1>
        <%
            int x = 10;//biến khai báo ở trang chính (sẽ sử dụng ở trang con inlude
        %>
        <%@include file="trang1.jsp" %>
        <%@include file="trang2.jsp" %>
    </body>
</html>
