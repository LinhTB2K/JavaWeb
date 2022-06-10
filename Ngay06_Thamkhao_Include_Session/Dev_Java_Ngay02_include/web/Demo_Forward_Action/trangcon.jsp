<%-- 
    Document   : trangcon.jsp
    Created on : May 22, 2020, 9:03:42 PM
    Author     : Tran Manh Truong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

        <h1>Hello World!</h1>
        <%
            String s = (String)request.getAttribute("noidung");
            out.println(s);
        %>