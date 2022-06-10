<%-- 
    Document   : xuly_multi_text
    Created on : Mar 15, 2019, 11:37:52 AM
    Author     : Tran Manh Truong
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Xử lý Multiple text!</h1>
        <%
            request.setCharacterEncoding("UTF-8");
            //String ten = request.getParameter("Tens");
            //out.println("<h3>Tên: " + ten + "</h3>");
            
            //lấy các giá trị của input cùng tên
            String[] tens = request.getParameterValues("Tens");
            for(String ten : tens)
            {
                out.println("<h3>Tên : " + ten + "</h3>");
            }
            
            /*String[] lops = request.getParameterValues("Lops");
            for(String lop : lops)
            {
                out.println("<h3>Lớp : " + lop + "</h3>");
            }*/
            
            //lấy giá tri từng input bằng các ghép tên
            //String[] arr = new String[] {"1","3","5"};
            ArrayList<String> arr = (ArrayList<String>)session.getAttribute("arr");
            for(String id : arr)
            {
                String soluong = request.getParameter("sanpham_"+id);
                out.println("<h3>số lượng của sản phẩm " + id + " là : " + soluong + "</h3>");
            }
        %>
    </body>
</html>
