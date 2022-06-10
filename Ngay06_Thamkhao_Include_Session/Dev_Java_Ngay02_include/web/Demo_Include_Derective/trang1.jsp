<%-- 
    Document   : trang1.jsp
    Created on : May 22, 2020, 7:54:10 PM
    Author     : Tran Manh Truong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
       <h1>Trang 1!</h1>
       <%
//           int x =20;
           out.println("<h3> Biến x = " + x + "</h3>");
           int y = 20;//biến y được dùng ở những trang include sau trang1.jsp
       %>