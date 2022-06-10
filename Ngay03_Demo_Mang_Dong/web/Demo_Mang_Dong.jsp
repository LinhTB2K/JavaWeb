<%-- 
    Document   : Demo_Mang_Dong
    Created on : 11-Dec-2021, 15:00:35
    Author     : Admin
--%>

<%@page import="Models.clsTaikhoan"%>
<%@page import="Data.QLTaikhoan"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Demo mảng động</title>
        <style type="text/css">
            tr:nth-child(1) {background-color: yellow !important}
            tr:nth-child(odd) {background-color: bisque}
            tr:nth-child(even) {background-color:darkgrey}
        </style>
    </head>
    <body>
        <h1>Quản lý tài khoản!</h1>
        <table width="400" border="1" align="center">
            <tr>
                <th>Số TK</th><th>Số dư</th><th>Tiền lãi</th>
            </tr>
            <%
                QLTaikhoan qltk = new QLTaikhoan();
                qltk.getData();//khởi tạo dữ liệu
                out.println("<h3 style='color:red'> Lãi suất: " + clsTaikhoan.Laisuat + "</h3>");
                //for(KieuDL bien : bienmang) {} để lặp từng phần tử của mảng
                for(clsTaikhoan tk : qltk.List)
                {
            %>
            <tr>
                <td><%=tk.getSoTK()%></td>
                <td><%=tk.getSodu()%></td>
                <td><%=tk.getSodu() * clsTaikhoan.Laisuat%></td>
            </tr>
            <%
                }// đóng for(clsTaikhoan tk : qltk.List)
            %>
        </table>
    </body>
</html>
