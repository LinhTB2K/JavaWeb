/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import CSDL.tblSanpham;
import Models.clsSanpham;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Hoan
 */
@WebServlet(name = "xulythem", urlPatterns = {"/xulythem"})
public class xulythem extends HttpServlet {

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
            //lấy thông tin từ form
            request.setCharacterEncoding("UTF-8");//thiết lập lấy dữ liệu Unicode
            String masp = request.getParameter("masp");
            String tensp = request.getParameter("tensp");//lấy giá trị của input có name=tensp
            int giasp = Integer.parseInt(request.getParameter("giasp"));//Float.parseFloat chuyển chuỗi thành số
            int manhom = Integer.parseInt(request.getParameter("manhom"));
            String hinhanh = request.getParameter("hinhanh");
            String tomtat = request.getParameter("tomtat");
            String noidung = request.getParameter("noidung");
            boolean trangthai;
            if(request.getParameter("trangthai")==null)//nếu không có biến trangthai trong Request (không được check)
                trangthai = false;
            else
                trangthai = true;
            out.println(" mã : "+ masp +",tên: " + tensp + ", giá: " + giasp + ", mã nhóm"+ manhom +", hình ảnh"+hinhanh+", tóm tắt"+tomtat+", nội dung"+noidung+",trạng thái:" + trangthai);
            //thêm sản phẩm vào csdl
            clsSanpham sp = new clsSanpham(0, masp, tensp, giasp, manhom,hinhanh,tomtat,noidung, trangthai);
            tblSanpham bangSanpham = new tblSanpham();
            int ketqua = bangSanpham.ThemSanpham(sp);
            if(ketqua==-1)
                out.println("<h3>Lỗi kết nối csdl</h3>");
            else if(ketqua==-2)
                out.println("<h3>lỗi sql</h3>");
            else if(ketqua==0)
                out.println("<h3>KHÔNG CÓ BẢN GHI NÀO ĐƯỢC CẬP NHẬT</h3>");
            else
            {
                out.println("<h3> thành công </h3>");
                out.println("<a href='Admin.jsp'>tiếp tục</a>");
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
