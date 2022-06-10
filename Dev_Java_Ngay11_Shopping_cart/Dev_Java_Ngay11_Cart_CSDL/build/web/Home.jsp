<%-- 
    Document   : Home
    Created on : Jun 26, 2020, 7:20:00 PM
    Author     : Tran Manh Truong
--%>

<%@page import="CSDL.tbSanpham"%>
<%@page import="Models.clsSanpham"%>
<%@page import="java.util.Vector"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Giao diện</title>
<link rel="stylesheet" type="text/css" href="Style.css">
<link rel="stylesheet" type="text/css" href="Menu.css">
</head>

<body>
<div id="khung">
	<div id="header">  
    </div>
    <div id="menu">
      <ul>
        <li><a href="Home.jsp">Trang chủ</a></li>
        <li><a href="#">Tin tức</a>
            <ul>
                <li><a href="#">Thể thao</a></li>
                <li><a href="#">Giáo dục</a></li>
                <li><a href="#">Kinh tế</a></li>
            </ul>
        </li>
        <li><a href="#">Sản phẩm</a>
            <ul>
                <li><a href="#">Máy tính</a></li>
                <li><a href="#">Điện thoại</a></li>
                <li><a href="#">Điện gia dụng</a></li>
            </ul>
        </li>
        <li><a href="#">Liên hệ</a></li>
      </ul>
    </div>
    <div id="noidung" class="clear_fix">
    	<div id="nd_Trai">
        	<H2> SẢN PHẨM</H2>
            <ul>
                <li><a href="#">Máy tính</a></li>
                <li><a href="#">Điện thoại</a></li>
                <li><a href="#">Điện gia dụng</a></li>
            </ul>
        </div>
        <div id="nd_Giua"> 
            <%
                Vector<clsSanpham> dssp = new Vector<clsSanpham>();
                int ketqua = tbSanpham.TimDSSanpham(0, dssp);
                if(ketqua>0)
                {
                    for(clsSanpham sp:dssp)
                    {
            %>
            <div class="sanpham">
            	<p><%=sp.getTensp()%></p>
                <img src="Hinhanh/sanpham/<%=sp.getHinhanh()%>">
                <p><%=String.format("%,d", sp.getGiasp())%> VNĐ</p>
                <p><a style="color: black; text-decoration: none" href="cart_add?id=<%=sp.getId()%>">Add to cart</a></p>
            </div>
            <%
                    }
                }
            %>
        </div>
        <div id="nd_Phai">
        <iframe width="200" src="https://www.youtube.com/embed/Y29OrOVJUKs?rel=0" frameborder="0" allow="autoplay; encrypted-media" allowfullscreen></iframe>
        </div>
    </div>
    <div id="footer"> 
    	<p>Liên Hệ: Ths. Trần Mạnh Trường</p>
        <p>Mobile: 0912356004 | Email/Fb: Truongtm@gmail.com</p>
        </div>
</div>
</body>
</html>	

