package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("       <title>Login Page</title>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.3.1/css/all.css\" integrity=\"sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU\" crossorigin=\"anonymous\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("\t<div class=\"d-flex justify-content-center h-100\">\n");
      out.write("\t\t<div class=\"card\">\n");
      out.write("\t\t\t<div class=\"card-header\">\n");
      out.write("\t\t\t\t<h3>Sign In</h3>\n");
      out.write("\t\t\t\t<div class=\"d-flex justify-content-end social_icon\">\n");
      out.write("\t\t\t\t\t<span><i class=\"fab fa-facebook-square\"></i></span>\n");
      out.write("\t\t\t\t\t<span><i class=\"fab fa-google-plus-square\"></i></span>\n");
      out.write("\t\t\t\t\t<span><i class=\"fab fa-twitter-square\"></i></span>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"card-body\">\n");
      out.write("\t\t\t\t<form name=\"f1\" id=\"f1\" action=\"xulylogin\">\n");
      out.write("\t\t\t\t\t<div class=\"input-group form-group\">\n");
      out.write("\t\t\t\t\t\t<div class=\"input-group-prepend\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"input-group-text\"><i class=\"fas fa-user\"></i></span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control\"  name=\"tUser\" id=\"tUser\">\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"input-group form-group\">\n");
      out.write("\t\t\t\t\t\t<div class=\"input-group-prepend\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"input-group-text\"><i class=\"fas fa-key\"></i></span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<input type=\"password\" class=\"form-control\" name=\"tPass\" id=\"tPass\" >\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"row align-items-center remember\">\n");
      out.write("\t\t\t\t\t\t<input type=\"checkbox\">Remember Me\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" value=\"Login\" class=\"btn float-right login_btn\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"card-footer\">\n");
      out.write("\t\t\t\t<div class=\"d-flex justify-content-center links\">\n");
      out.write("\t\t\t\t\tDon't have an account?<a href=\"#\">Sign Up</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"d-flex justify-content-center\">\n");
      out.write("\t\t\t\t\t<a href=\"#\">Forgot your password?</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
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
