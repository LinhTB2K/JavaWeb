<%@page contentType="text/html" pageEncoding="UTF-8"%>
<h3 style="text-align: center; margin-top: 5px">SẢN PHẨM</h3>
<%
    String masp="";
    if(request.getParameter("masp")!=null)
        masp=request.getParameter("masp");
    if(masp.equals("")){
%>
    <%@include file="DanhSachSP.jsp" %>
<%
    }else{
%>
    <%@include file="ChitietSP.jsp" %>
<%
    }
%>
