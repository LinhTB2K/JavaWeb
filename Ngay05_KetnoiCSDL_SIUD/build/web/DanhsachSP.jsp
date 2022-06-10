<%-- 
    Document   : DanhsachSP
    Created on : 16-Dec-2021, 21:57:20
    Author     : Admin
--%>

<%@page import="Models.clsSanpham"%>
<%@page import="CSDL.tblSanpham"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Danh sách sản phẩm</title>
        <style>
            table {border-collapse: collapse;}
            tr {height: 30px}
            tr:first-child{background-color: orange !important; color: white}
            tr:nth-child(odd) {background-color: white}
            tr:nth-child(even) {background-color: bisque}
        </style>
    </head>
    <body>
        <h1 align="center">Danh sách sản phẩm!</h1>
        <h3 align="center"><a href="themsp.jsp">Thêm Sản phẩm</a></h3>
        <table width="500" align="center" border="1">
            <tr>
                <th>ID</th>
                <th>Tên sản phẩm</th>
                <th>Giá sản phẩm</th>
                <th>Trạng thái</th>
                <th>Action</th>
            </tr>
            <%
                tblSanpham bangSanpham = new tblSanpham();
                int ketqua = bangSanpham.LayDSSanpham();
                if(ketqua==-1)
                    out.println("<h3>LỖI KẾT NỐI CSDL</h3>");
                else if(ketqua==-2)
                    out.println("<h3>LỖI SQL</h3>");
                else
                {
                    for(clsSanpham sp : bangSanpham.list)//lặp mảng sản phẩm
                    {
                        
            %>
                <tr>
                    <td><%=sp.getId()%></td>
                    <td><%=sp.getTensp()%></td>
                    <td><%=String.format("%,.2f",sp.getGia())%> VNĐ</td>
                    <td><%=sp.isTrangthai()?"Có":"Không"%></td>
                    <td>
                        <a href="suasp.jsp?id=<%=sp.getId()%>">Sửa</a>
                        -
                        <a href="xoasp?id=<%=sp.getId()%>" onclick="return confirm('chắc chắn xóa?');">Xóa</a>
                    </td>
                </tr>
                
            <%
                    }
                    
                }//đóng else
            %>
        </table>
               
    </body>
</html>
