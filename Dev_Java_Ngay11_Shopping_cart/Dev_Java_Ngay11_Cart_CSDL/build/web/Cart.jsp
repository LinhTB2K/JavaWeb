<%-- 
    Document   : Cart
    Created on : Jun 26, 2020, 7:58:24 PM
    Author     : Tran Manh Truong
--%>

<%@page import="CSDL.tbSanpham"%>
<%@page import="Models.clsSanpham"%>
<%@page import="java.util.TreeMap"%>
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
        	<h1 align="center" style="margin-top: 20px; font-size: 24px">GIỎ HÀNG!</h1>
            <form name="f1" id="f1" action="cart_update" method="post">
                        <%
                            TreeMap<Integer,Integer> cart = (TreeMap<Integer,Integer>)session.getAttribute("cart");
                            if(cart==null)
                            {
                                out.println("<h3> chưa có giỏ hàng</h3>");
                            }
                            else
                            {
                                int tongtien = 0;
                                for(int id : cart.keySet())
                                {
                                    clsSanpham sp = new clsSanpham();
                                    int ketqua = tbSanpham.TimSanpham(id, sp);
                                    if(ketqua>0)
                                    {
                                        int soluong = cart.get(id);
                                        int thanhtien = soluong * sp.getGiasp();
                                        tongtien += thanhtien;
                        %>
                        
                         <div style="height: 60px;display: flex;flex-direction: row;align-items: center;">   
                            <span style="width:150px;"><%=sp.getTensp()%></span>
                            <span style="width:60px"><img src="Hinhanh/sanpham/<%=sp.getHinhanh()%>" width="30"></span>
                            <span style="width:60px">Số lượng:<input type="text" name="sanpham_<%=id%>" value="<%=soluong%>" size="3"></span>
                            <span style="width:150px">Giá:<br> <%=String.format("%,d", sp.getGiasp())%> VNĐ</span>
                            <span style="width:150px">Thành tiền:<br> <%=String.format("%,d", thanhtien)%> VNĐ</span>
                            <span style="width:60px"><a href="cart_del?id=<%=id%>">Xóa</a></span>
                        </div>
                            <%
                                    }
                                }
                            
                            %>
                <div style="margin-left: 350px; margin-bottom: 10px; font-weight: bold; color: red;">
                    Tổng Tiền:<%=String.format("%,d", tongtien)%> VNĐ</div>
                <input type="submit" name="b1" id="b1" value="CẬP NHẬT SỐ LƯỢNG" 
                       style="margin-left: 200px; width: 150px">
                <%
                    }//đóng if(cart==null) 
                %>
            </form>
            <h1 align="center" style="margin-top: 20px; font-size: 18px; background-color: burlywood; 
                padding-top:5px; padding-bottom: 5px ">
                NHẬP THÔNG TIN MUA HÀNG!</h1>
            <form name="f2" id="f2" action="cart_checkout" method="post"> 
                <div style="height: 30px;display: flex;flex-direction: row;align-items: center;
                     width: 300px; margin: 10px auto;">   
                    <span style="width:100px;">Tên người mua:</span>
                    <span style="width:100px"><input type="text" name="tHoten" id="tHoten"></span>
                 </div>
                <div style="height: 30px;display: flex;flex-direction: row;align-items: center;
                     width: 300px; margin: 10px auto;">   
                    <span style="width:100px;">Điện thoại:</span>
                    <span style="width:100px"><input type="text" name="tDienthoai" id="tDienthoai"></span>
                 </div>
                <div style="height: 30px;display: flex;flex-direction: row;align-items: center;
                      width: 300px; margin: 0px auto;">   
                    <span style="width:100px;">Ngày nhận:</span>
                    <span style="width:100px"><input type="text" name="tNgaynhan" id="tNgaynhan"></span>
                 </div>
                <div style="height: 30px;width: 300px; margin: 10px auto; text-align: center">   
                   <input type="submit" name="button" id="button" value="Đồng ý Đặt hàng">
                 </div>
            </form>
            
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

