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
 * @author Tran Manh Truong
 */
@WebServlet(name = "XulyLogin", urlPatterns = {"/DemoLogin/XulyLogin"})
public class XulyLogin extends HttpServlet {

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
            String u = request.getParameter("taikhoan");
            String p = request.getParameter("matkhau");
            if(u!=null && p!=null && !u.equals("") && !p.equals("")){
                tbUser tbuser = new tbUser();
                int ketqua = tbuser.Kiemtra(u, p);
                if(ketqua==-1)
                    out.println("<h3>LỖI KẾT NỐI CSDL</h3>");
                else if(ketqua==-2)
                    out.println("<h3>LỖI Câu lệnh SQL</h3>");
                else if(ketqua ==0){
                    out.println("<h3>Sai tên đăng nhập hoặc mật khẩu</h3>");
                    request.getRequestDispatcher("Login.jsp").include(request, response);
                }
                else{
                    out.println("<h3>Đăng nhập thành công</h3>");
                    HttpSession session = request.getSession();
                    session.setAttribute("taikhoan", u);
                    response.sendRedirect("profile.jsp");
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
