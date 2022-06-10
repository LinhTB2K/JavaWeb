package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Models.clsTaikhoan;
import Data.QLTaikhoan;

public final class Demo_005fMang_005fDong_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Demo mảng động</title>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            tr:nth-child(1) {background-color: yellow !important}\n");
      out.write("            tr:nth-child(odd) {background-color: bisque}\n");
      out.write("            tr:nth-child(even) {background-color:darkgrey}\n");
      out.write("            table{border-collapse: collapse}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Quản lý tài khoản!</h1>\n");
      out.write("        <table width=\"400\" border=\"1\" align=\"center\">\n");
      out.write("            <tr>\n");
      out.write("                <th>Số TK</th><th>Số dư</th><th>Tiền lãi</th>\n");
      out.write("            </tr>\n");
      out.write("            ");

                QLTaikhoan qltk = new QLTaikhoan();
                qltk.getData();//khởi tạo dữ liệu
                out.println("<h3 style='color:red'> Lãi suất: " + clsTaikhoan.Laisuat + "</h3>");
                //for(KieuDL bien : bienmang) {} để lặp từng phần tử của mảng
                for(clsTaikhoan tk : qltk.List)
                {
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(tk.getSoTK());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(tk.getSodu());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(tk.getSodu() * clsTaikhoan.Laisuat);
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            ");

                }// đóng for(clsTaikhoan tk : qltk.List)
            
      out.write("\n");
      out.write("        </table>\n");
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
