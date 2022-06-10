<%-- 
    Document   : index
    Created on : Aug 6, 2019, 9:05:24 AM
    Author     : Tran Manh Truong
--%>

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
    <%
        request.setCharacterEncoding("UTF-8");
        //HashMap<Integer,Integer> cart = (HashMap<Integer,Integer>)session.getAttribute("cart");
         String module="";
        if(request.getParameter("module")!=null)
            module=request.getParameter("module");
    %>
<div id="khung">
    <%@include file="banner.jsp" %>
    <%@include file="menu_tren.jsp" %>
    <div id="noidung" class="clear_fix">
        <%@include file="noidung_trai.jsp" %>
        <div id="nd_Giua"> 
            <% if(module.equalsIgnoreCase("tintuc")){%>
                 <%@include file="noidung_tintuc.jsp" %>
            <% }else if(module.equalsIgnoreCase("sanpham")){ %>
                <%@include file="noidung_sanpham.jsp" %>
            <% }else if(module.equalsIgnoreCase("lienhe")){ %>
                <%@include file="noidung_lienhe.jsp" %>  
            <% }else if(module.equalsIgnoreCase("cart")){ %>
                <%@include file="noidung_cart.jsp" %> 
            <% }else {%>
                <%@include file="noidung_trangchu.jsp"%>
            <% } %>    
        </div>
        <%@include file="noidung_phai.jsp" %>
    </div>
        <%@include file="footer.jsp" %>
</div>
</body>
</html>	

