<%-- 
    Document   : trang1
    Created on : May 22, 2020, 8:19:58 PM
    Author     : Tran Manh Truong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

        <h1>Trang 1!</h1>
       <%
           int x = 20;//biến x trong trang1 là riêng biệt không liên quan trang cấp trên
           out.println("<h3> Biến x của trang 1 = " + x + "</h3>");
           int y = 30;//biến y ở trang1.jsp sẽ không tồn tại ở trang2.jsp
       %>