<%-- 
    Document   : trang2_xuly
    Created on : 30-Dec-2021, 21:16:44
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Nhận họ tên từ form và lưu vào biến SESSION!</h1>
        <%
            request.setCharacterEncoding("UTF-8");
            String hoten = request.getParameter("hoten");
        %>
        <H3>Hello: <%=hoten%></H3>
        <%
            //Lưu hoten vào SESSION với tên là a để các trang khác cùng truy cập
            session.setAttribute("a", hoten);
        %>
        <a href="trang3_hienthi.jsp">Trang 3 - Hiển thị họ tên</a>
    </body>
</html>
