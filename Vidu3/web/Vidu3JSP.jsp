<%-- 
    Document   : Vidu3JSP
    Created on : Nov 29, 2021, 10:23:15 AM
    Author     : vanli
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Vi du 3</title>
    </head>
    <body>
        <h1>Hello JSP - Java Server Pages!</h1>
        <h2>Demo JSP! </h2>
        <%
            String hoten = "Nguyễn Văn Linh";
            int tuoi = 21;
        %>
        <p style="color: blue"> Họ Tên :<% out.println(hoten); %> </p>
        <p> Tuổi : <%=tuoi%></p>
    </body>
</html>
