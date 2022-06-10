<%-- 
    Document   : test_multi_text
    Created on : Mar 15, 2019, 11:35:17 AM
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
        <h1>Multiple text!</h1>
        <form name="f1" id="f1" action="xuly_multi_text.jsp" method="post">
            <!-- tạo mảng các input cùng name -->
            Tên 1: <input type="text" name="Tens">
            <br>
            Tên 2: <input type="text" name="Tens">
            <br>
            Tên 3: <input type="text" name="Tens">
            <br>
            Tên 4: <input type="text" name="Tens">
            <br>
            <%
                //String[] arr = new String[] {"1","3","5"};
                ArrayList<String> arr = new ArrayList<String>();
                arr.add("sp1");arr.add("sp3");arr.add("sp5");
                session.setAttribute("arr", arr);
                //tạo các input với tên là sanhpam_i (trong đó i là giá trị từ mảng)
                for(String id : arr)
                {
            %>
                sản phẩm <%=id%>: <input type="text" name="sanpham_<%=id%>">
                <br>
            <%
                }
            %>
            <input type="submit" name="b1" id="b1" value="Đồng ý">
        </form>
    </body>
</html>
