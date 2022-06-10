package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Models.clsSanpham;
import CSDL.tblSanpham;

public final class suasp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Sửa sản phẩm</h1>\n");
      out.write("        ");

            int id = Integer.parseInt(request.getParameter("id"));
            tblSanpham bangSanpham = new tblSanpham();
            int ketqua = bangSanpham.TimSanpham(id);
            if(ketqua==-1)
                out.println("<h3>LỖI KẾT NỐI CSDL</h3>");
            else if(ketqua==1)
                out.println("<h3>LỖI SQL</h3>");
            else
            {
                clsSanpham sp = bangSanpham.list.get(0);//lấy sản phẩm từ danh sách
        
      out.write("\n");
      out.write("        <!--action=\"xulysua\" là tên của Servlet-->\n");
      out.write("        <form name=\"f1\" id=\"f1\" method=\"post\" action=\"xulysua\">\n");
      out.write("            <input type=\"hidden\" name=\"id\" id=\"id\" value=\"");
      out.print(id);
      out.write("\">\n");
      out.write("            <table width=\"400\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>Mã sản phẩm</td>\n");
      out.write("                    <td><input type=\"text\" name=\"masp\" id=\"masp\" value=\"");
      out.print(sp.getMasp());
      out.write("\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Tên sản phẩm</td>\n");
      out.write("                    <td><input type=\"text\" name=\"tensp\" id=\"tensp\" value=\"");
      out.print(sp.getTensp());
      out.write("\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Giá sản phẩm</td>\n");
      out.write("                    <td><input type=\"text\" name=\"giasp\" id=\"giasp\" value=\"");
      out.print(sp.getGiasp());
      out.write("\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Mã Nhóm</td>\n");
      out.write("                    <td><input type=\"text\" name=\"manhom\" id=\"manhom\" value=\"");
      out.print(sp.getManhom());
      out.write("\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Hình ảnh</td>\n");
      out.write("                    <td><input type=\"text\" name=\"hinhanh\" id=\"hinhanh\" value=\"");
      out.print(sp.getHinhanh());
      out.write("\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Tóm Tắt</td>\n");
      out.write("                    <td><input type=\"text\" name=\"tomtat\" id=\"tomtat\" value=\"");
      out.print(sp.getTomtat());
      out.write("\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Nội Dung</td>\n");
      out.write("                    <td><input type=\"text\" name=\"noidung\" id=\"noidung\" value=\"");
      out.print(sp.getNoidung());
      out.write("\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Trạng thái</td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"checkbox\" name=\"trangthai\" id=\"trangthai\" \n");
      out.write("                        value=\"1\" ");
      out.print(sp.isTrangthai()?"checked":"");
      out.write(" >\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"2\">\n");
      out.write("                        <input type=\"submit\" name=\"b1\" id=\"b1\" value=\"Cập nhật\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("        ");

            }//đóng if(ketqua==-1)
        
      out.write("\n");
      out.write("    \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
