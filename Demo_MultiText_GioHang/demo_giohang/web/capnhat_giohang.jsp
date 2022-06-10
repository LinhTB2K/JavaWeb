<%-- 
    Document   : xuly_multi_text
    Created on : Mar 15, 2019, 11:37:52 AM
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
        <h1>Giỏ hàng!</h1>
        <%
            request.setCharacterEncoding("UTF-8");
            HashMap<String,Integer> cart = (HashMap<String,Integer>)session.getAttribute("cart");
            for(String id : cart.keySet())
            {
                String str_soluong = request.getParameter("sanpham_"+id);
                int soluong = Integer.parseInt(str_soluong);
                cart.put(id, soluong);
                //out.println("<h3>số lượng của sản phẩm " + id + " là : " + soluong + "</h3>");
            }
            session.setAttribute("cart", cart);//lưu lại giỏ hàng vào session
            out.println("Giỏ hàng sau khi cập nhật:");
            for(String id:cart.keySet())
            {
                int soluong = cart.get(id);
                out.println("<h3>số lượng của sản phẩm " + id + " là : " + soluong + "</h3>");
            }
        %>
    </body>
</html>
