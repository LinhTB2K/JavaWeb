<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Trang chủ</title>
<link rel="stylesheet" type="text/css" href="CSS/Style.css">
<link rel="stylesheet" type="text/css" href="CSS/Menu.css">
<link rel="stylesheet" type="text/css" href="CSS/Sanpham.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<!--nhúng file css và js của Slide show-->
<link rel="stylesheet" type="text/css" href="CSS/SlideShow.css">
<script src="JS/SlideShow.js"></script>
</head>

<body>
<div id="wrapper">
    <%@include file="inc/Header.jsp" %>
    <%@include file="inc/Menu.jsp" %>
    <div id="content" class="clear_fix">
        <%@include file="inc/Left.jsp" %>
           <%
               String module ="";
               if(request.getParameter("module")!=null)
                   module = request.getParameter("module");
               if(module.equals("tintuc"))
               {
            %>
                <jsp:include page="inc/Tintuc.jsp"></jsp:include>
            <%
               }
                else if(module.equals("sanpham"))
                {   
            %>
                 <jsp:include page="inc/DanhsachSP.jsp"></jsp:include>
             <%
               }
                else if(module.equals("chitietsp"))
                {   
            %>
            <jsp:include page="inc/Chitietsp.jsp"></jsp:include>
            <%
                }
                else if(module.equals("lienhe"))
                {           
            %>
                <jsp:include page="inc/Lienhe.jsp"></jsp:include>
            <%
                }
                else
                {
            %>
                <jsp:include page="inc/Home.jsp"></jsp:include>
            <%
                }
            %>
        
    </div>
    <%@include file="inc/Footer.jsp" %>
</div>
</body>
</html>
