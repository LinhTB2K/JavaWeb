<%-- 
    Document   : trang1_NhapTT
    Created on : May 25, 2020, 7:17:04 PM
    Author     : Tran Manh Truong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nhập thông tin</title>
    </head>
    <body>
        <h1>Nhập thông tin!</h1>
        <form name="f1" id="f1" method="get" action="trang2_xuly.jsp">
            Họ tên <input type="text" name="hoten" id="hoten">
            <br>
            <input type="submit" name="b1" id="b1" value="Gửi tới trang 2">
        </form>
    </body>
</html>
