<%-- 
    Document   : trang2_xuly
    Created on : May 25, 2020, 7:23:10 PM
    Author     : Tran Manh Truong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Xử lý thông tin</title>
    </head>
    <body>
        <h1>Trang 2 - Nhận dữ liệu từ form và lưu vào Session!</h1>
        <%
            request.setCharacterEncoding("UTF-8");
            String sHoten = request.getParameter("hoten");//lấy dữ liệu từ input name=hoten
            //Tạo biến session có tên là hoten và lưu nội dung họ tên vừa lấy từ form vào
            session.setAttribute("hoten", sHoten);
        %>
        <h3>Xin chào: ${sessionScope.hoten} </h3>
        <a href="trang3_hienthi.jsp">Chuyển tới trang 3</a>
    </body>
</html>
