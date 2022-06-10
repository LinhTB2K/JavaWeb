<%-- 
    Document   : main_page
    Created on : May 22, 2020, 8:16:42 PM
    Author     : Tran Manh Truong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trang chính</title>
    </head>
    <body>
        <h1>Trang chính!</h1>
        <%
            int x = 10;//x sẽ không tồn tại ở trang con được include
            out.println("<h3> biến x của trang main = " + x + "</h3>");
        %>
        <jsp:include page="trang1.jsp"></jsp:include>
        <jsp:include page="trang2.jsp"></jsp:include>
        <%
            //include bằng lệnh java thay vì thẻ <jsp>
            //request.getRequestDispatcher("trang2.jsp").include(request, response);
        %>
    </body>
</html>
