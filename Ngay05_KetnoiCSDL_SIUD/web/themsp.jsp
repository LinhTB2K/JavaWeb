<%-- 
    Document   : themsp
    Created on : 18-Dec-2021, 15:02:20
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Thêm sản phẩm mới</title>
    </head>
    <body>
        <h1>Thêm sản phẩm!</h1>
        <!--action="xulythem" là tên của Servlet-->
        <form name="f1" id="f1" method="post" action="xulythem">
            <table width="400">
                <tr>
                    <td>Tên sản phẩm</td>
                    <td><input type="text" name="tensp" id="tensp"></td>
                </tr>
                <tr>
                    <td>Giá sản phẩm</td>
                    <td><input type="text" name="giasp" id="giasp"></td>
                </tr>
                <tr>
                    <td>Trạng thái</td>
                    <td><input type="checkbox" name="trangthai" id="trangthai" value="1"></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" name="b1" id="b1" value="Cập nhật">
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
