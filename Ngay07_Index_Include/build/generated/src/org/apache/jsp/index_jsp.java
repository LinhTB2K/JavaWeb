package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/inc/Header.jsp");
    _jspx_dependants.add("/inc/Menu.jsp");
    _jspx_dependants.add("/inc/Left.jsp");
    _jspx_dependants.add("/inc/Footer.jsp");
  }

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
      out.write("<!doctype html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<title>Trang chủ</title>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"CSS/Style.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"CSS/Menu.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"CSS/Sanpham.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("<!--nhúng file css và js của Slide show-->\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"CSS/SlideShow.css\">\n");
      out.write("<script src=\"JS/SlideShow.js\"></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<div id=\"wrapper\">\n");
      out.write("    ");
      out.write("\n");
      out.write("<div id=\"header\"> \n");
      out.write("    \tHEADER \n");
      out.write("</div>");
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("<div id=\"menu\">  \n");
      out.write("    <ul>\n");
      out.write("    <li><a href=\"index.jsp\">Trang chủ</a></li>\n");
      out.write("        <li><a href=\"?module=tintuc\">Tin tức</a>\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"thethao.htm\">Thể thao</a></li>\n");
      out.write("                <li><a href=\"kinhte.htm\">Kinh tế</a></li>\n");
      out.write("                <li><a href=\"giaoduc.htm\">Giáo dục</a></li>\n");
      out.write("                <li><a href=\"xahoi.htm\">Xã hội</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </li>\n");
      out.write("        <li><a href=\"?module=sanpham\">Sản phẩm</a>\n");
      out.write("            <ul>\n");
      out.write("                    <li><a href=\"DanhSachSP.html\">Điện thoại</a></li>\n");
      out.write("                <li><a href=\"DanhSachSP.html\">Máy tính</a></li>\n");
      out.write("                <li><a href=\"DanhSachSP.html\">Đồng hồ</a></li>\n");
      out.write("                <li><a href=\"DanhSachSP.html\">Ti vi</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </li>\n");
      out.write("        <li><a href=\"?module=lienhe\">Liên hệ</a></li>\n");
      out.write("    </ul>  \n");
      out.write("</div>");
      out.write("\n");
      out.write("    <div id=\"content\" class=\"clear_fix\">\n");
      out.write("        ");
      out.write("\n");
      out.write("<div id=\"content_left\"> \n");
      out.write("        \t<div class=\"left1\">\n");
      out.write("            \t<h3>DANH MỤC NHÓM SP</h3>\n");
      out.write("                <p><a class=\"active\" href=\"DanhSachSP.html\">cate 1</a></p>\n");
      out.write("                <p><a href=\"DanhSachSP.html\">cate 2</a></p>\n");
      out.write("                <p><a href=\"DanhSachSP.html\">cate 3</a></p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"left1\">\n");
      out.write("            \t<h3>BRANCH</h3>\n");
      out.write("                <p><a href=\"#\">Branch 1</a></p>\n");
      out.write("                <p><a href=\"#\">Branch 2</a></p>\n");
      out.write("                <p><a href=\"#\">Branch 3</a></p>\n");
      out.write("            </div>  \n");
      out.write("</div>");
      out.write("\n");
      out.write("           ");

               String module ="";
               if(request.getParameter("module")!=null)
                   module = request.getParameter("module");
               if(module.equals("tintuc"))
               {
            
      out.write("\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "inc/Tintuc.jsp", out, false);
      out.write("\n");
      out.write("            ");

               }
                else if(module.equals("sanpham"))
                {   
            
      out.write("\n");
      out.write("                 ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "inc/DanhsachSP.jsp", out, false);
      out.write("\n");
      out.write("             ");

               }
                else if(module.equals("chitietsp"))
                {   
            
      out.write("\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "inc/Chitietsp.jsp", out, false);
      out.write("\n");
      out.write("            ");

                }
                else if(module.equals("lienhe"))
                {           
            
      out.write("\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "inc/Lienhe.jsp", out, false);
      out.write("\n");
      out.write("            ");

                }
                else
                {
            
      out.write("\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "inc/Home.jsp", out, false);
      out.write("\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("    ");
      out.write("\n");
      out.write("<div id=\"footer\"> \n");
      out.write("    \tFOOTER\n");
      out.write("</div>");
      out.write("\n");
      out.write("</div>\n");
      out.write("</body>\n");
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
