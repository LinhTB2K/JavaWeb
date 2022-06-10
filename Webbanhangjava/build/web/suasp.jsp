<%-- 
    Document   : suasp
    Created on : Jan 18, 2022, 9:38:01 PM
    Author     : Hoan
--%>

<%@page import="Models.clsSanpham"%>
<%@page import="CSDL.tblSanpham"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Sửa sản phẩm</h1>
        <%
            int id = Integer.parseInt(request.getParameter("id"));
            tblSanpham bangSanpham = new tblSanpham();
            int ketqua = bangSanpham.TimSanpham(id);
            if(ketqua==-1)
                out.println("<h3>LỖI KẾT NỐI CSDL</h3>");
            else if(ketqua==-2)
                out.println("<h3>LỖI SQL</h3>");
            else
            {
                clsSanpham sp = bangSanpham.list.get(0);//lấy sản phẩm từ danh sách
        %>
        <!--action="xulysua" là tên của Servlet-->
        <form name="f1" id="f1" method="post" action="xulysua">
            <input type="hidden" name="id" id="id" value="<%=id%>">
            <table width="400">
                <tr>
                    <td>Mã sản phẩm</td>
                    <td><input type="text" name="masp" id="masp" value="<%=sp.getMasp()%>"></td>
                </tr>
                <tr>
                    <td>Tên sản phẩm</td>
                    <td><input type="text" name="tensp" id="tensp" value="<%=sp.getTensp()%>"></td>
                </tr>
                <tr>
                    <td>Giá sản phẩm</td>
                    <td><input type="text" name="giasp" id="giasp" value="<%=sp.getGiasp()%>"></td>
                </tr>
                <tr>
                    <td>Mã Nhóm</td>
                    <td><input type="text" name="manhom" id="manhom" value="<%=sp.getManhom()%>"></td>
                </tr>
                <tr>
                    <td>Hình ảnh</td>
                    <td><input type="text" name="hinhanh" id="hinhanh" value="<%=sp.getHinhanh()%>"></td>
                </tr>
                <tr>
                    <td>Tóm Tắt</td>
                    <td><input type="text" name="tomtat" id="tomtat" value="<%=sp.getTomtat()%>"></td>
                </tr>
                <tr>
                    <td>Nội Dung</td>
                    <td><input type="text" name="noidung" id="noidung" value="<%=sp.getNoidung()%>"></td>
                </tr>
                <tr>
                    <td>Trạng thái</td>
                    <td>
                        <input type="checkbox" name="trangthai" id="trangthai" 
                        value="1" <%=sp.isTrangthai()?"checked":""%> >
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" name="b1" id="b1" value="Cập nhật">
                    </td>
                </tr>
            </table>
        </form>
        <%
            }//đóng if(ketqua==-1)
        %>
    
    </body>
</html>
