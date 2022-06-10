package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import CSDL.tbSanpham;
import Models.clsSanpham;
import java.util.TreeMap;

public final class Cart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<title>Giao diện</title>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"Style.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"Menu.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<div id=\"khung\">\n");
      out.write("\t<div id=\"header\">  \n");
      out.write("    </div>\n");
      out.write("    <div id=\"menu\">\n");
      out.write("      <ul>\n");
      out.write("        <li><a href=\"Home.jsp\">Trang chủ</a></li>\n");
      out.write("        <li><a href=\"#\">Tin tức</a>\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"#\">Thể thao</a></li>\n");
      out.write("                <li><a href=\"#\">Giáo dục</a></li>\n");
      out.write("                <li><a href=\"#\">Kinh tế</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </li>\n");
      out.write("        <li><a href=\"#\">Sản phẩm</a>\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"#\">Máy tính</a></li>\n");
      out.write("                <li><a href=\"#\">Điện thoại</a></li>\n");
      out.write("                <li><a href=\"#\">Điện gia dụng</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </li>\n");
      out.write("        <li><a href=\"#\">Liên hệ</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"noidung\" class=\"clear_fix\">\n");
      out.write("    \t<div id=\"nd_Trai\">\n");
      out.write("        \t<H2> SẢN PHẨM</H2>\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"#\">Máy tính</a></li>\n");
      out.write("                <li><a href=\"#\">Điện thoại</a></li>\n");
      out.write("                <li><a href=\"#\">Điện gia dụng</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"nd_Giua\"> \n");
      out.write("        \t<h1 align=\"center\" style=\"margin-top: 20px; font-size: 24px\">GIỎ HÀNG!</h1>\n");
      out.write("            <form name=\"f1\" id=\"f1\" action=\"cart_update\" method=\"post\">\n");
      out.write("                        ");

                            TreeMap<Integer,Integer> cart = (TreeMap<Integer,Integer>)session.getAttribute("cart");
                            if(cart==null)
                            {
                                out.println("<h3> chưa có giỏ hàng</h3>");
                            }
                            else
                            {
                                int tongtien = 0;
                                for(int id : cart.keySet())
                                {
                                    clsSanpham sp = new clsSanpham();
                                    int ketqua = tbSanpham.TimSanpham(id, sp);
                                    if(ketqua>0)
                                    {
                                        int soluong = cart.get(id);
                                        int thanhtien = soluong * sp.getGiasp();
                                        tongtien += thanhtien;
                        
      out.write("\n");
      out.write("                        \n");
      out.write("                         <div style=\"height: 60px;display: flex;flex-direction: row;align-items: center;\">   \n");
      out.write("                            <span style=\"width:150px;\">");
      out.print(sp.getTensp());
      out.write("</span>\n");
      out.write("                            <span style=\"width:60px\"><img src=\"Hinhanh/sanpham/");
      out.print(sp.getHinhanh());
      out.write("\" width=\"30\"></span>\n");
      out.write("                            <span style=\"width:60px\">Số lượng:<input type=\"text\" name=\"sanpham_");
      out.print(id);
      out.write("\" value=\"");
      out.print(soluong);
      out.write("\" size=\"3\"></span>\n");
      out.write("                            <span style=\"width:150px\">Giá:<br> ");
      out.print(String.format("%,d", sp.getGiasp()));
      out.write(" VNĐ</span>\n");
      out.write("                            <span style=\"width:150px\">Thành tiền:<br> ");
      out.print(String.format("%,d", thanhtien));
      out.write(" VNĐ</span>\n");
      out.write("                            <span style=\"width:60px\"><a href=\"cart_del?id=");
      out.print(id);
      out.write("\">Xóa</a></span>\n");
      out.write("                        </div>\n");
      out.write("                            ");

                                    }
                                }
                            
                            
      out.write("\n");
      out.write("                <div style=\"margin-left: 350px; margin-bottom: 10px; font-weight: bold; color: red;\">\n");
      out.write("                    Tổng Tiền:");
      out.print(String.format("%,d", tongtien));
      out.write(" VNĐ</div>\n");
      out.write("                <input type=\"submit\" name=\"b1\" id=\"b1\" value=\"CẬP NHẬT SỐ LƯỢNG\" \n");
      out.write("                       style=\"margin-left: 200px; width: 150px\">\n");
      out.write("                ");

                    }//đóng if(cart==null) 
                
      out.write("\n");
      out.write("            </form>\n");
      out.write("            <h1 align=\"center\" style=\"margin-top: 20px; font-size: 18px; background-color: burlywood; \n");
      out.write("                padding-top:5px; padding-bottom: 5px \">\n");
      out.write("                NHẬP THÔNG TIN MUA HÀNG!</h1>\n");
      out.write("            <form name=\"f2\" id=\"f2\" action=\"cart_checkout\" method=\"post\"> \n");
      out.write("                <div style=\"height: 30px;display: flex;flex-direction: row;align-items: center;\n");
      out.write("                     width: 300px; margin: 10px auto;\">   \n");
      out.write("                    <span style=\"width:100px;\">Tên người mua:</span>\n");
      out.write("                    <span style=\"width:100px\"><input type=\"text\" name=\"tHoten\" id=\"tHoten\"></span>\n");
      out.write("                 </div>\n");
      out.write("                <div style=\"height: 30px;display: flex;flex-direction: row;align-items: center;\n");
      out.write("                     width: 300px; margin: 10px auto;\">   \n");
      out.write("                    <span style=\"width:100px;\">Điện thoại:</span>\n");
      out.write("                    <span style=\"width:100px\"><input type=\"text\" name=\"tDienthoai\" id=\"tDienthoai\"></span>\n");
      out.write("                 </div>\n");
      out.write("                <div style=\"height: 30px;display: flex;flex-direction: row;align-items: center;\n");
      out.write("                      width: 300px; margin: 0px auto;\">   \n");
      out.write("                    <span style=\"width:100px;\">Ngày nhận:</span>\n");
      out.write("                    <span style=\"width:100px\"><input type=\"text\" name=\"tNgaynhan\" id=\"tNgaynhan\"></span>\n");
      out.write("                 </div>\n");
      out.write("                <div style=\"height: 30px;width: 300px; margin: 10px auto; text-align: center\">   \n");
      out.write("                   <input type=\"submit\" name=\"button\" id=\"button\" value=\"Đồng ý Đặt hàng\">\n");
      out.write("                 </div>\n");
      out.write("            </form>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        <div id=\"nd_Phai\">\n");
      out.write("        <iframe width=\"200\" src=\"https://www.youtube.com/embed/Y29OrOVJUKs?rel=0\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"footer\"> \n");
      out.write("    \t<p>Liên Hệ: Ths. Trần Mạnh Trường</p>\n");
      out.write("        <p>Mobile: 0912356004 | Email/Fb: Truongtm@gmail.com</p>\n");
      out.write("        </div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\t\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
