<%-- 
    Document   : test_insert_get_last_id
    Created on : Sep 3, 2019, 9:30:37 AM
    Author     : Tran Manh Truong
--%>

<%@page import="Models.clsNhomSP"%>
<%@page import="CSDL.tbNhomSP"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Demo insert get last ID!</h1>
        <%
        tbNhomSP bangNhomSP = new tbNhomSP();
        clsNhomSP nhomsp = new clsNhomSP(0, "test 3", 1, true);
        int lastID = bangNhomSP.ThemNhomSP(nhomsp);
        if(lastID<=0)
            out.println("<h3>Lỗi thêm dữ liệu</h3>");
        else
            out.println("<h3> Last ID: " + lastID + "</h3>");
        %>
    </body>
</html>
