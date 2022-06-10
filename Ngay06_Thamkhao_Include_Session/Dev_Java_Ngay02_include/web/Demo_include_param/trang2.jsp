<%-- 
    Document   : trang2
    Created on : May 22, 2020, 8:29:24 PM
    Author     : Tran Manh Truong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

        <h1>Trang 2!</h1>
        <%
            String s;
            s = (String)request.getAttribute("a1");//lấy giá trị của Attribute a1 từ trang trước 
            out.println("<h3>s = " + s + "</h3>");
        %>