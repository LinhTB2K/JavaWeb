<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trang cá nhân - cần đăng nhập</title>
    </head>
    <body>
        <h1>Trang thông tin cá nhân!</h1>
        <h3>Hello: ${sessionScope.fullname}</h3>
        <h3><a href="QuanlyTaikhoan.jsp">Vào trang Quản lý tài khoản</a></h3>
        <a href="Logout.jsp">Thoát</a>
    </body>
</html>
