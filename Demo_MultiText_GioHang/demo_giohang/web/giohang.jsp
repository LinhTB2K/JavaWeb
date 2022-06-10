<%-- 
    Document   : test_multi_text
    Created on : Mar 15, 2019, 11:35:17 AM
    Author     : Tran Manh Truong
--%>

<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>giỏ hàng!</h1>
        <form name="f1" id="f1" action="capnhat_giohang.jsp" method="post">
            <%
                HashMap<String,Integer> cart = new HashMap<String,Integer>();
                cart.put("1", 1);
                cart.put("3", 2);
                cart.put("5", 3);
                session.setAttribute("cart", cart);
                //tạo các input với tên là sanhpam_i (trong đó i là giá trị từ mảng)
                for(String id : cart.keySet())//lặp từng key trong mảng các key của hashmap
                {
                    int soluong = cart.get(id);
            %>
            sản phẩm <%=id%>: <input type="text" name="sanpham_<%=id%>" value="<%=soluong%>">
                <br>
            <%
                }
            %>
            <input type="submit" name="b1" id="b1" value="Đồng ý">
        </form>
    </body>
</html>
