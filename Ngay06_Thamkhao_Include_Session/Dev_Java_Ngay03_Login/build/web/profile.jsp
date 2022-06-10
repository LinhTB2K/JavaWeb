<%-- 
    Document   : profile
    Created on : Aug 17, 2019, 9:56:01 AM
    Author     : Tran Manh Truong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TRANG CÁ NHÂN</title>
    </head>
    <body>
        <h1>TRANG CÁ NHÂN</h1>
        <%
            String taikhoan = (String)session.getAttribute("taikhoan");
            if(taikhoan==null){//chưa có biến session tên là taikhoan => chưa đăng nhập
        %>
            <h3>BẠN CHƯA ĐĂNG NHẬP</h3>
            <A href="Login.jsp">Nhấn vào đây để đăng nhập</A>
        <%
            }else{
        %>    
            <h3>Xin chào: <%=taikhoan%></h3>
            <a href="Logout.jsp">Thoát</a>
        <%
            }
        %>    
    </body>
</html>
