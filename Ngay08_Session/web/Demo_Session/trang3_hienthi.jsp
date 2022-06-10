<%-- 
    Document   : trang3_hienthi
    Created on : 30-Dec-2021, 21:22:11
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trang 3 - hiển thị biến hoten</title>
    </head>
    <body>
        <h1>Trang 3 - Hiển thị biến họ tên từ SESSION!</h1>
        <%
            if(session.getAttribute("a")==null)
            {
                out.println("Chưa nhập thông tin");
                //request.getRequestDispatcher("trang1_nhaptt.jsp").forward(request, response);
                response.sendRedirect("trang1_nhaptt.jsp");
            }
            //lấy hoten từ session để sử dụng
            String hoten = (String)session.getAttribute("a");
        %>
        <H3>Hello: <%=hoten%></H3>
        <h3>Hellos (sử dụng cú pháp $ {} ): ${sessionScope.a}</h3>
    </body>
</html>
