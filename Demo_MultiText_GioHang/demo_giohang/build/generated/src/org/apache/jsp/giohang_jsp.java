package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.HashMap;
import java.util.ArrayList;

public final class giohang_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <h1>giỏ hàng!</h1>\n");
      out.write("        <form name=\"f1\" id=\"f1\" action=\"capnhat_giohang.jsp\" method=\"post\">\n");
      out.write("            ");

                HashMap<String,Integer> cart = new HashMap<String,Integer>();
                cart.put("sp1", 1);
                cart.put("sp3", 2);
                cart.put("sp5", 3);
                session.setAttribute("cart", cart);
                //tạo các input với tên là sanhpam_i (trong đó i là giá trị từ mảng)
                for(String id : cart.keySet())//lặp từng key trong mảng các key của hashmap
                {
                    int soluong = cart.get(id);
            
      out.write("\n");
      out.write("            sản phẩm ");
      out.print(id);
      out.write(": <input type=\"text\" name=\"sanpham_");
      out.print(id);
      out.write("\" value=\"");
      out.print(soluong);
      out.write("\">\n");
      out.write("                <br>\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("            <input type=\"submit\" name=\"b1\" id=\"b1\" value=\"Đồng ý\">\n");
      out.write("        </form>\n");
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
