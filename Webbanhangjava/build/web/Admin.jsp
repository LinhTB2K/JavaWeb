<%-- 
    Document   : Admin
    Created on : Jan 17, 2022, 10:35:31 PM
    Author     : Hoan
--%>

<%@page import="Models.clsSanpham"%>
<%@page import="CSDL.tblSanpham"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <meta charset="UTF-8">
    <title>Admin</title>
    <meta name="description" content="Thanks for purchasing Huge. If you need any support, please contact with us.">
    <meta name="author" content="uttaraitpark">
    <meta name="copyright" content="uttaraitpark">
    <link rel="shortcut icon" type="image/png" href="css/img/favicon.ico">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/tree-viewer.css">
    <link rel="stylesheet" href="css/styles.css">
    </head>
    <body>
        <div class="wrapper">
            <div class="left-side">
                <div class="logo">
                    <img src="img/logo.png" alt="" />
                </div>
                <div class="left-content">
                    <ul role="tablist">
                        <li role="presentation" class="active"><a href="#one" aria-controls="home" role="tab" data-toggle="tab"><span><i class="fa fa-home"></i></span>Welcome</a></li>
                        <li role="presentation"><a href="#two" aria-controls="home" role="tab" data-toggle="tab"><span><i class="fa fa-folder"></i></span>Main File Structure</a></li>
                        <li role="presentation"><a href="#three" aria-controls="home" role="tab" data-toggle="tab"><span><i class="fa fa-code"></i></span>HTML Structure</a></li>
                        <li role="presentation"><a href="#six" aria-controls="home" role="tab" data-toggle="tab"><span><i class="fa fa-slideshare"></i></span>Plugins stractures</a></li>
                        <li role="presentation"><a href="#source" aria-controls="home" role="tab" data-toggle="tab"><span><i class="fa fa-thumbs-up"></i></span>Sources & Credits</a></li>
                        <li role="presentation"><a href="#support" aria-controls="home" role="tab" data-toggle="tab"><span><i class="fa fa-support"></i></span>Support</a></li>
                    </ul>
                </div>
                <div class="copyright">
                <p>Copyright &#169; 2018 <a href="https://colorlib.com/wp/templates/" >Colorlib</a></p>
                </div>
            </div>
            <div class="right-side">
                <div class="right-content">
                    <div id="one" class="content active fade in">
                        <h1 align="center">Danh s??ch s???n ph???m!</h1>
                <h3 align="center"><a href="themsp.jsp">Th??m S???n ph???m</a></h3>
                <table>
                    <tr>
                        <th>ID</th>
                        <th>M?? s???n ph???m</th>
                        <th>T??n s???n ph???m</th>
                        <th>Gi?? s???n ph???m</th>
                        <th>M?? Nh??m</th>
                        <th>H??nh ???nh</th>
                        <th>T??m t???t</th>
                        <th>N???i dung</th>
                        <th>Tr???ng th??i</th>
                    </tr>
                    <%
                        tblSanpham bangSanpham = new tblSanpham();
                        int ketqua = bangSanpham.LayDSSanpham();
                        if(ketqua==-1)
                            out.println("<h3>L???I K???T N???I CSDL</h3>");
                        else if(ketqua==-2)
                            out.println("<h3>L???I SQL</h3>");
                        else
                        {
                            for(clsSanpham sp : bangSanpham.list)//l???p m???ng s???n ph???m
                            {
                    %>
                    <tr>
                            <td><%=sp.getId()%></td>
                            <td><%=sp.getMasp()%></td>
                            <td><%=sp.getTensp()%></td>
                            <td><%=String.format("%,d",sp.getGiasp())%> VN??</td>
                            <td><%=sp.getManhom()%></td>
                            <td><img src="hinhanh/<%=sp.getHinhanh()%>" style="width: 120px;height: 100px"></td>
                            <td><%=sp.getTomtat()%></td>
                            <td><%=sp.getNoidung()%></td>
                            <td><%=sp.isTrangthai()?"C??":"Kh??ng"%></td>
                            <td>
                                <a href="suasp.jsp?id=<%=sp.getId()%>">S???a</a>
                                -----
                                <a href="xoasp?id=<%=sp.getId()%>" onclick="return confirm('ch???c ch???n x??a?');">X??a</a>
                            </td>
                        </tr>
                    <%
                            }
                        }//????ng else
                    %>
                </table>
                    </div>
                </div>
            </div>
               
        </div>
    <script src="js/jquery-3.1.0.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jstree.min.js"></script>
    <script src="js/jstree.active.js"></script>
    <script src="js/main.js"></script>
    </body>
</html>
