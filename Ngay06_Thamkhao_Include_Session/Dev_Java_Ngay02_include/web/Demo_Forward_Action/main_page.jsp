<%-- 
    Document   : main_page
    Created on : May 22, 2020, 9:01:04 PM
    Author     : Tran Manh Truong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trang main</title>
    </head>
    <body>
        <h1>Trang main!</h1>
        <%
            String s = "Nội dung của biến từ trang main page";
            request.setAttribute("noidung", s);
            //request.getRequestDispatcher("trangcon.jsp").forward(request, response);
        %>
        
        <jsp:forward page="trangcon.jsp"></jsp:forward>
        
    </body>
</html>
