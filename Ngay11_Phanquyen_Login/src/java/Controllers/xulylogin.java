/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import CSDL.tbUser;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Admin
 */
@WebServlet(name = "xulylogin", urlPatterns = {"/xulylogin"})
public class xulylogin extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String user = request.getParameter("tUser");
            String pass = request.getParameter("tPass");
            tbUser bangUser = new tbUser();
            int ketqua = bangUser.Kiemtra(user, pass);
            if(ketqua==-1)
                out.println("<h3>Lỗi kết nối CSDL</h3>");
            else if(ketqua==-2)
                out.println("<h3>lỗi SQL</h3>");
            else if(ketqua==0)
            {
                out.println("<h3> sai username hoặc password<h3>");
                //đặt nội dung tragn Login vào đây
                request.getRequestDispatcher("Login.jsp").include(request, response);
            }
            else//thành công
            {
                //tạo biến session để lưu username
                HttpSession session = request.getSession();
                if(bangUser.role==0)
                {
                    out.println("<h3> Tài khoản đã bị khóa<h3>");
                    request.getRequestDispatcher("Login.jsp").include(request, response);
                }
                else
                {
                //tạo ra biến session username để thông qua kiểm tra đăng nhập ở Filter
                //lưu các thông tin tài khoản vừa đăng nhập từ CSDL vào session 
                session.setAttribute("username", bangUser.user);
                session.setAttribute("fullname", bangUser.fullname );
                session.setAttribute("role", bangUser.role);
                if(bangUser.role==1)
                    response.sendRedirect("QuanlyTaikhoan.jsp");
                 else
                    response.sendRedirect("Profile.jsp");
                }
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
