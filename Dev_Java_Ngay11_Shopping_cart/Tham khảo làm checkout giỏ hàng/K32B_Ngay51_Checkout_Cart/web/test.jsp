<%-- 
    Document   : test
    Created on : Aug 29, 2019, 11:12:03 AM
    Author     : Tran Manh Truong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            request.setCharacterEncoding("UTF-8");
        String tukhoa="";
        int gia1=0,gia2=0;
        //if(request.getParameter("timkiem")!=null){
           tukhoa = request.getParameter("tukhoa");
           out.println("<p>Từ khóa: " + tukhoa + "</p>");
           if(request.getParameter("gia1")!=null&&!request.getParameter("gia1").equals(""))
            gia1 = Integer.parseInt(request.getParameter("gia1"));
           if(request.getParameter("gia2")!=null&&!request.getParameter("gia2").equals(""))
            gia2 = Integer.parseInt(request.getParameter("gia2"));
           //dsSP = bangSanpham.TimDSSanpham(tukhoa, gia1, gia2);
        //}
        %>
    </body>
</html>
