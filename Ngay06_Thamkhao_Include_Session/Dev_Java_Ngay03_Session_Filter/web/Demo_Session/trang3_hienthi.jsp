<%-- 
    Document   : trang3_hienthi
    Created on : May 25, 2020, 7:30:58 PM
    Author     : Tran Manh Truong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hiển thị thông tin từ Session</title>
    </head>
    <body>
        <h1>Trang 3 - Hiển thị thông tin từ Session!</h1>
        <%
            if(session.getAttribute("hoten")==null){
        %>
                <h3>Bạn chưa Nhập thông tin</h3>
                <a href="trang1_NhapTT.jsp">Nhập thông tin</a>
        <%    
            }
            else{
            String sHoten = (String)session.getAttribute("hoten");
        %>
            <h3>Hello : <%=sHoten%></h3>
            <h3>Hello : ${sessionScope.hoten}</h3>
        <%
            }
        %>
    </body>
</html>
