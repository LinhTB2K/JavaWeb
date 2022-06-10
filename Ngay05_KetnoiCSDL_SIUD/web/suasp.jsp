<%-- 
    Document   : themsp
    Created on : 18-Dec-2021, 15:02:20
    Author     : Admin
--%>

<%@page import="Models.clsSanpham"%>
<%@page import="CSDL.tblSanpham"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sửa sản phẩm</title>
    </head>
    <body>
        <h1>Sửa sản phẩm!</h1>
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
                    <td>Tên sản phẩm</td>
                    <td><input type="text" name="tensp" id="tensp" value="<%=sp.getTensp()%>"></td>
                </tr>
                <tr>
                    <td>Giá sản phẩm</td>
                    <td><input type="text" name="giasp" id="giasp" value="<%=String.format("%.2f",sp.getGia())%>"></td>
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
