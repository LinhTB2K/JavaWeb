package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Models.clsSanpham;
import CSDL.tblSanpham;

public final class Admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            <meta charset=\"UTF-8\">\n");
      out.write("    <title>Admin</title>\n");
      out.write("    <meta name=\"description\" content=\"Thanks for purchasing Huge. If you need any support, please contact with us.\">\n");
      out.write("    <meta name=\"author\" content=\"uttaraitpark\">\n");
      out.write("    <meta name=\"copyright\" content=\"uttaraitpark\">\n");
      out.write("    <link rel=\"shortcut icon\" type=\"image/png\" href=\"css/img/favicon.ico\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/tree-viewer.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/styles.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("            <div class=\"left-side\">\n");
      out.write("                <div class=\"logo\">\n");
      out.write("                    <img src=\"img/logo.png\" alt=\"\" />\n");
      out.write("                </div>\n");
      out.write("                <div class=\"left-content\">\n");
      out.write("                    <ul role=\"tablist\">\n");
      out.write("                        <li role=\"presentation\" class=\"active\"><a href=\"#one\" aria-controls=\"home\" role=\"tab\" data-toggle=\"tab\"><span><i class=\"fa fa-home\"></i></span>Welcome</a></li>\n");
      out.write("                        <li role=\"presentation\"><a href=\"#two\" aria-controls=\"home\" role=\"tab\" data-toggle=\"tab\"><span><i class=\"fa fa-folder\"></i></span>Main File Structure</a></li>\n");
      out.write("                        <li role=\"presentation\"><a href=\"#three\" aria-controls=\"home\" role=\"tab\" data-toggle=\"tab\"><span><i class=\"fa fa-code\"></i></span>HTML Structure</a></li>\n");
      out.write("                        <li role=\"presentation\"><a href=\"#six\" aria-controls=\"home\" role=\"tab\" data-toggle=\"tab\"><span><i class=\"fa fa-slideshare\"></i></span>Plugins stractures</a></li>\n");
      out.write("                        <li role=\"presentation\"><a href=\"#source\" aria-controls=\"home\" role=\"tab\" data-toggle=\"tab\"><span><i class=\"fa fa-thumbs-up\"></i></span>Sources & Credits</a></li>\n");
      out.write("                        <li role=\"presentation\"><a href=\"#support\" aria-controls=\"home\" role=\"tab\" data-toggle=\"tab\"><span><i class=\"fa fa-support\"></i></span>Support</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"copyright\">\n");
      out.write("                <p>Copyright &#169; 2018 <a href=\"https://colorlib.com/wp/templates/\" >Colorlib</a></p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"right-side\">\n");
      out.write("                <div class=\"right-content\">\n");
      out.write("                    <div id=\"one\" class=\"content active fade in\">\n");
      out.write("                        <h1 align=\"center\">Danh sách sản phẩm!</h1>\n");
      out.write("                <h3 align=\"center\"><a href=\"themsp.jsp\">Thêm Sản phẩm</a></h3>\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>ID</th>\n");
      out.write("                        <th>Mã sản phẩm</th>\n");
      out.write("                        <th>Tên sản phẩm</th>\n");
      out.write("                        <th>Giá sản phẩm</th>\n");
      out.write("                        <th>Mã Nhóm</th>\n");
      out.write("                        <th>Hình ảnh</th>\n");
      out.write("                        <th>Tóm tắt</th>\n");
      out.write("                        <th>Nội dung</th>\n");
      out.write("                        <th>Trạng thái</th>\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                        tblSanpham bangSanpham = new tblSanpham();
                        int ketqua = bangSanpham.LayDSSanpham();
                        if(ketqua==-1)
                            out.println("<h3>LỖI KẾT NỐI CSDL</h3>");
                        else if(ketqua==-2)
                            out.println("<h3>LỖI SQL</h3>");
                        else
                        {
                            for(clsSanpham sp : bangSanpham.list)//lặp mảng sản phẩm
                            {
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                            <td>");
      out.print(sp.getId());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(sp.getMasp());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(sp.getTensp());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(String.format("%,d",sp.getGiasp()));
      out.write(" VNĐ</td>\n");
      out.write("                            <td>");
      out.print(sp.getManhom());
      out.write("</td>\n");
      out.write("                            <td><img src=\"hinhanh/");
      out.print(sp.getHinhanh());
      out.write("\" style=\"width: 120px;height: 100px\"></td>\n");
      out.write("                            <td>");
      out.print(sp.getTomtat());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(sp.getNoidung());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(sp.isTrangthai()?"Có":"Không");
      out.write("</td>\n");
      out.write("                            <td>\n");
      out.write("                                <a href=\"suasp.jsp?id=");
      out.print(sp.getId());
      out.write("\">Sửa</a>\n");
      out.write("                                -----\n");
      out.write("                                <a href=\"xoasp?id=");
      out.print(sp.getId());
      out.write("\" onclick=\"return confirm('chắc chắn xóa?');\">Xóa</a>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                    ");

                            }
                        }//đóng else
                    
      out.write("\n");
      out.write("                </table>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("               \n");
      out.write("        </div>\n");
      out.write("    <script src=\"js/jquery-3.1.0.min.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"js/jstree.min.js\"></script>\n");
      out.write("    <script src=\"js/jstree.active.js\"></script>\n");
      out.write("    <script src=\"js/main.js\"></script>\n");
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
