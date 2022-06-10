<%-- 
    Document   : Home
    Created on : Nov 29, 2021, 10:07:28 AM
    Author     : vanli
--%>

<%@page import="Model.Sinhvien"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Ví dụ JSP - Java Web!</h1>
        <%
            Sinhvien sv = new Sinhvien("Sv4","Huy",21);
            out.println("<h3>Thông tin sinh viên</h3>");
            out.println("<p>Mã sinh viên :"+ sv.mavs + "</p>");
            out.println("<p>Tên sinh viên :"+ sv.hoten + "</p>");
            out.println("<p>Tuổi sinh viên :"+ sv.tuoi + "</p>");
        %>
        <p style="color: pink"> Cách 2 :</p>
        <p style="color: red">Mã Sinh Viên :<%=sv.mavs%></p>
        <p style="color: green">Tên Sinh Viên :<%=sv.hoten%></p>
    </body>
</html>
