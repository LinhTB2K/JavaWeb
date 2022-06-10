package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.HashMap;
import Tienich.Dungchung;
import java.util.Vector;
import Models.clsNhomSP;
import CSDL.tbNhomSP;
import Tienich.Dungchung;
import CSDL.tbNhomSP;
import java.util.Vector;
import Models.clsNhomSP;
import Models.clsSanpham;
import java.util.Vector;
import Models.clsNhomSP;
import CSDL.tbSanpham;
import Models.clsSanpham;
import CSDL.tbSanpham;
import java.util.Locale;
import Models.clsSanpham;
import CSDL.tbSanpham;
import java.util.HashMap;
import Models.clsSanpham;
import java.util.Vector;
import CSDL.tbSanpham;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(12);
    _jspx_dependants.add("/banner.jsp");
    _jspx_dependants.add("/menu_tren.jsp");
    _jspx_dependants.add("/noidung_trai.jsp");
    _jspx_dependants.add("/noidung_tintuc.jsp");
    _jspx_dependants.add("/noidung_sanpham.jsp");
    _jspx_dependants.add("/DanhSachSP.jsp");
    _jspx_dependants.add("/ChitietSP.jsp");
    _jspx_dependants.add("/noidung_lienhe.jsp");
    _jspx_dependants.add("/noidung_cart.jsp");
    _jspx_dependants.add("/noidung_trangchu.jsp");
    _jspx_dependants.add("/noidung_phai.jsp");
    _jspx_dependants.add("/footer.jsp");
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
      out.write("    ");

        request.setCharacterEncoding("UTF-8");
        //HashMap<Integer,Integer> cart = (HashMap<Integer,Integer>)session.getAttribute("cart");
         String module="";
        if(request.getParameter("module")!=null)
            module=request.getParameter("module");
    
      out.write("\n");
      out.write("<div id=\"khung\">\n");
      out.write("    ");
      out.write("\n");
      out.write("<div id=\"header\">  \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"menu\">\n");
      out.write("      <ul>\n");
      out.write("        <li><a href=\"index.jsp\">Trang chủ</a></li>\n");
      out.write("        <li><a href=\"index.jsp?module=tintuc\">Tin tức</a>\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"#\">Thể thao</a></li>\n");
      out.write("                <li><a href=\"#\">Giáo dục</a></li>\n");
      out.write("                <li><a href=\"#\">Kinh tế</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </li>\n");
      out.write("        <li><a href=\"index.jsp?module=sanpham\">Sản phẩm</a>\n");
      out.write("           ");

               Dungchung.Hienthi_NhomSP_UL(out);
           
      out.write("\n");
      out.write("        </li>\n");
      out.write("        <li><a href=\"index.jsp?module=lienhe\">Liên hệ</a></li>\n");
      out.write("        ");

            HashMap<Integer,Integer> cart1 = (HashMap<Integer,Integer>)session.getAttribute("cart");
            int sosp=0;
            if(cart1!=null)
                sosp = cart1.size();
        
      out.write("\n");
      out.write("        <li><a href=\"index.jsp?module=cart\">Giỏ hàng (");
      out.print(sosp);
      out.write(")</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div id=\"noidung\" class=\"clear_fix\">\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"nd_Trai\">\n");
      out.write("        <H2> TÌM KIẾM</H2>\n");
      out.write("        ");

        String tukhoa="";
        int gia1=0,gia2=0;
        int nhomsp=0;
        if(request.getParameter("timkiem")!=null){
           tukhoa = request.getParameter("tukhoa");
           //out.println("<p>Từ khóa: " + tukhoa + "</p>");
           if(request.getParameter("gia1")!=null&&!request.getParameter("gia1").equals(""))
            gia1 = Integer.parseInt(request.getParameter("gia1"));
           if(request.getParameter("gia2")!=null&&!request.getParameter("gia2").equals(""))
            gia2 = Integer.parseInt(request.getParameter("gia2"));
           
           if(request.getParameter("nhomsp")!=null&&!request.getParameter("nhomsp").equals(""))
            nhomsp = Integer.parseInt(request.getParameter("nhomsp"));
        }
      out.write("\n");
      out.write("        <div style=\"width:180px; margin: 5px auto;\">\n");
      out.write("        <form name=\"f1\" action=\"index.jsp?module=sanpham&timkiem=1\" method=\"post\">\n");
      out.write("            <div style=\"height: 25px\">\n");
      out.write("            <select style=\"width:180px;\" name=\"nhomsp\" id=\"nhomsp\">\n");
      out.write("                <option value=\"0\">Chọn nhóm sản phẩm</option>\n");
      out.write("                ");

               Dungchung.Hienthi_NhomSP_Option(out,nhomsp);
                
      out.write("\n");
      out.write("            </select>\n");
      out.write("            </div>\n");
      out.write("            <div style=\"height: 25px;display: flex;flex-direction: row;align-items: center;\">\n");
      out.write("                <span style=\"width:80px;\">Từ khóa:</span>\n");
      out.write("                 <input style=\"width:100px\" type=\"text\" name=\"tukhoa\" id=\"tukhoa\" size=\"10\" value=\"");
      out.print(tukhoa);
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("            <div style=\"height: 25px;display: flex;flex-direction: row;align-items: center;\">\n");
      out.write("            <span style=\"width:80px;\">Giá từ:</span> \n");
      out.write("            <input  style=\"width:100px\" type=\"text\" name=\"gia1\" id=\"gia1\" size=\"10\"  value=\"");
      out.print(gia1);
      out.write("\">\n");
      out.write("            </div>\n");
      out.write("            <div style=\"height: 25px;display: flex;flex-direction: row;align-items: center;\">\n");
      out.write("            <span style=\"width:80px;\">Giá đến:</span> \n");
      out.write("            <input  style=\"width:100px\" type=\"text\" name=\"gia2\" id=\"gia2\" size=\"10\"  value=\"");
      out.print(gia2);
      out.write("\">\n");
      out.write("             </div>\n");
      out.write("             <div style=\"height: 25px; text-align: center\">\n");
      out.write("                 <input style=\"width:100px\" type=\"submit\" name=\"b1\" id=\"b1\" value=\"Tìm kiếm\">\n");
      out.write("             </div>\n");
      out.write("        </form> \n");
      out.write("        </div>\n");
      out.write("</div>");
      out.write("\n");
      out.write("        <div id=\"nd_Giua\"> \n");
      out.write("            ");
 if(module.equalsIgnoreCase("tintuc")){
      out.write("\n");
      out.write("                 ");
      out.write("\n");
      out.write("<h3 style=\"text-align: center; margin-top: 5px\">TIN TỨC</h3>");
      out.write("\n");
      out.write("            ");
 }else if(module.equalsIgnoreCase("sanpham")){ 
      out.write("\n");
      out.write("                ");
      out.write("\n");
      out.write("<h3 style=\"text-align: center; margin-top: 5px\">SẢN PHẨM</h3>\n");

    String masp="";
    if(request.getParameter("masp")!=null)
        masp=request.getParameter("masp");
    if(masp.equals("")){

      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<h4 style=\"text-align: center; margin-top: 5px\">DANH SÁCH</h4>\n");

    tbSanpham bangSanpham = new tbSanpham();
    Vector<clsSanpham> dsSP=new Vector<clsSanpham>();
    int ketqua =-1;
    //xử lý truy vấn lấy danh sách sản phẩm theo mã nhóm sp
    String sManhom="";
    int manhom =0;
    if(request.getParameter("manhom")!=null)
        sManhom=request.getParameter("manhom");
    if(!sManhom.equals(""))
       manhom = Integer.parseInt(sManhom);
    if(request.getParameter("timkiem")!=null){
           ketqua = bangSanpham.TimDSSanpham(nhomsp,tukhoa, gia1, gia2,dsSP);
    }
    else{
       ketqua = bangSanpham.TimDSSanpham(manhom,dsSP);
    }
    if(ketqua==-1)
        out.println("<h3> LỖI KẾT NỐI CSDL</h3>");
    else if(ketqua==-2)
        out.println("<h3> LỖI TRUY VẤN CSDL SQL</h3>");
    else if(ketqua==0)
        out.println("<h3> CHƯA CÓ SẢN PHẨM</h3>");
    else{
        for(clsSanpham sp:dsSP){

      out.write("\n");
      out.write("<div class=\"sanpham\">\n");
      out.write("    <p><a href=\"index.jsp?module=sanpham&manhom=");
      out.print(manhom);
      out.write("&masp=");
      out.print(sp.getId());
      out.write("\">\n");
      out.write("            ");
      out.print(sp.getTensp());
      out.write("</a></p>\n");
      out.write("    <img src=\"Hinhanh/sanpham/");
      out.print(sp.getHinhanh());
      out.write("\">\n");
      out.write("    <p>giá: ");
      out.print(String.format("%,d", sp.getGiasp()));
      out.write("</p>\n");
      out.write("    <p><a href=\"cart_add?masp=");
      out.print(sp.getId());
      out.write("\">Thêm vào giỏ hàng</a></p>\n");
      out.write("</div>\n");
      out.write(" ");

        }//đóng for
    }//đóng else

      out.write('\n');
      out.write('\n');
      out.write('\n');

    }else{

      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<h4 style=\"text-align: center; margin-top: 5px\">CHI TIẾT SẢN PHẨM</h4>\n");

    String sMasp="";
    if(request.getParameter("masp")!=null)
        sMasp=request.getParameter("masp");
    int id =0;
    if(!sMasp.equals(""))
        id = Integer.parseInt(sMasp);
    tbSanpham bangSanpham = new tbSanpham();
    clsSanpham sp = new clsSanpham();
    int ketqua = bangSanpham.TimSanpham(id,sp);
    if(ketqua==-1)
        out.println("<h3> LỖI KẾT NỐI CSDL</h3>");
    else if(ketqua==-2)
        out.println("<h3> LỖI TRUY VẤN CSDL SQL</h3>");
    else if(ketqua==0)
        out.println("<h3> CHƯA CÓ SẢN PHẨM</h3>");

    else{

      out.write("\n");
      out.write("<div class=\"sanpham\">\n");
      out.write("    <p>");
      out.print(sp.getTensp());
      out.write("</p>\n");
      out.write("    <img src=\"Hinhanh/sanpham/");
      out.print(sp.getHinhanh());
      out.write("\">\n");
      out.write("    <p>giá: ");
      out.print(String.format("%,d", sp.getGiasp()));
      out.write("</p>\n");
      out.write("    <p><a href=\"cart_add?masp=");
      out.print(sp.getId());
      out.write("\">Thêm vào giỏ hàng</a></p>\n");
      out.write(" </div>\n");
      out.write("<div style=\"width:390px; float: right; border: 1px blue dashed;\">\n");
      out.write("    <div style=\"width:390px; border: 1px RED dashed;\">\n");
      out.write("        <h3>TÓM TẮT SẢN PHẨM</h3>\n");
      out.write("        ");
      out.print(sp.getTomtat());
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <div style=\"width:390px; border: 1px GREEN dashed;\">\n");
      out.write("        <h3>NỘI DUNG CHI TIẾT SẢN PHẨM</h3>\n");
      out.write("        ");
      out.print(sp.getNoidung());
      out.write("\n");
      out.write("    </div>\n");
      out.write("</div>\n");

    }

      out.write('\n');

    }

      out.write('\n');
      out.write("\n");
      out.write("            ");
 }else if(module.equalsIgnoreCase("lienhe")){ 
      out.write("\n");
      out.write("                ");
      out.write("\n");
      out.write("<h3 style=\"text-align: center; margin-top: 5px\">LIÊN HỆ</h3>");
      out.write("  \n");
      out.write("            ");
 }else if(module.equalsIgnoreCase("cart")){ 
      out.write("\n");
      out.write("                ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<h1 align=\"center\" style=\"margin-top: 20px; font-size: 24px\">GIỎ HÀNG!</h1>\n");
      out.write("<form name=\"f1\" id=\"f1\" action=\"cart_update\" method=\"post\">\n");
      out.write("    ");

        HashMap<Integer,Integer> cart = (HashMap<Integer,Integer>)session.getAttribute("cart");
        //tạo các input với tên là sanhpam_i (trong đó i là giá trị từ mảng)
        if(cart==null|| cart.size()==0)
            out.println("<h3 align='center'>giỏ hàng chưa có sản phẩm</h3>");
        else{
            int tongtien =0;
            for(int id : cart.keySet())//lặp từng key trong mảng các key của hashmap
            {
                int soluong = cart.get(id);
                tbSanpham bangSanpham = new tbSanpham();
                clsSanpham sp = new clsSanpham();
                int ketqua = bangSanpham.TimSanpham(id,sp);
                int dongia = sp.getGiasp()*soluong;
                tongtien+=dongia;
                String sGiaSP = String.format("%,d", sp.getGiasp());
                String sDongia = String.format(Locale.US,"%,d", dongia);
      
      out.write("\n");
      out.write("            <div style=\"height: 60px;display: flex;flex-direction: row;align-items: center;\">   \n");
      out.write("            <span style=\"width:150px;\">");
      out.print(sp.getTensp());
      out.write("</span>\n");
      out.write("            <span style=\"width:60px\"><img src=\"Hinhanh/sanpham/");
      out.print(sp.getHinhanh());
      out.write("\" width=\"50\"></span>\n");
      out.write("            <span style=\"width:60px\">Số lượng:<input type=\"text\" name=\"sanpham_");
      out.print(id);
      out.write("\" value=\"");
      out.print(soluong);
      out.write("\" size=\"3\"></span>\n");
      out.write("            <span style=\"width:150px\">Giá:<br> ");
      out.print(sGiaSP);
      out.write(" VNĐ</span>\n");
      out.write("            <span style=\"width:150px\">Thành tiền:<br> ");
      out.print(sDongia);
      out.write(" VNĐ</span>\n");
      out.write("            <span style=\"width:60px\"><a href=\"cart_del?masp=");
      out.print(id);
      out.write("\">Xóa</a></span>\n");
      out.write("            </div>\n");
      out.write("    ");

            }
    
      out.write("\n");
      out.write("    <div style=\"margin-left: 350px; margin-bottom: 10px; font-weight: bold; color: red;\">\n");
      out.write("        Tổng Tiền:");
      out.print(String.format("%,d", tongtien));
      out.write(" VNĐ</div>\n");
      out.write("    <input type=\"submit\" name=\"b1\" id=\"b1\" value=\"CẬP NHẬT SỐ LƯỢNG\" \n");
      out.write("           style=\"margin-left: 200px; width: 150px\">\n");
      out.write("</form>\n");
      out.write("<h1 align=\"center\" style=\"margin-top: 20px; font-size: 18px; background-color: burlywood; \n");
      out.write("    padding-top:5px; padding-bottom: 5px \">\n");
      out.write("    NHẬP THÔNG TIN MUA HÀNG!</h1>\n");
      out.write("<form name=\"f2\" id=\"f2\" action=\"cart_checkout\" method=\"post\"> \n");
      out.write("    <div style=\"height: 30px;display: flex;flex-direction: row;align-items: center;\n");
      out.write("         width: 300px; margin: 10px auto;\">   \n");
      out.write("        <span style=\"width:100px;\">Tên người mua:</span>\n");
      out.write("        <span style=\"width:100px\"><input type=\"text\" name=\"tHoten\" id=\"tHoten\"></span>\n");
      out.write("     </div>\n");
      out.write("    <div style=\"height: 30px;display: flex;flex-direction: row;align-items: center;\n");
      out.write("         width: 300px; margin: 10px auto;\">   \n");
      out.write("        <span style=\"width:100px;\">Điện thoại:</span>\n");
      out.write("        <span style=\"width:100px\"><input type=\"text\" name=\"tDienthoai\" id=\"tDienthoai\"></span>\n");
      out.write("     </div>\n");
      out.write("    <div style=\"height: 30px;display: flex;flex-direction: row;align-items: center;\n");
      out.write("          width: 300px; margin: 0px auto;\">   \n");
      out.write("        <span style=\"width:100px;\">Ngày nhận:</span>\n");
      out.write("        <span style=\"width:100px\"><input type=\"text\" name=\"tNgaynhan\" id=\"tNgaynhan\"></span>\n");
      out.write("     </div>\n");
      out.write("    <div style=\"height: 30px;width: 300px; margin: 10px auto; text-align: center\">   \n");
      out.write("       <input type=\"submit\" name=\"button\" id=\"button\" value=\"Đồng ý Đặt hàng\">\n");
      out.write("     </div>\n");
      out.write("</form>\n");

    }//đóng if(cart==null|| cart.size()==0)

      out.write(" \n");
      out.write("            ");
 }else {
      out.write("\n");
      out.write("                ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<h3 style=\"text-align: center; margin-top: 5px\">TRANG CHỦ</h3>\n");

    tbSanpham tc_bangSanpham = new tbSanpham();
    Vector<clsSanpham> tc_dsSP = new Vector<clsSanpham>();
    int tc_ketequa = tc_bangSanpham.DSTopNSanpham(3,tc_dsSP);
    if(tc_ketequa==-1)
        out.println("<h3> LỖI KẾT NỐI CSDL</h3>");
    else if(tc_ketequa==-2)
        out.println("<h3> LỖI TRUY VẤN CSDL SQL</h3>");
    else if(tc_ketequa==0)
        out.println("<h3> CHƯA CÓ SẢN PHẨM</h3>");

    else{
        for(clsSanpham sp:tc_dsSP){

      out.write("\n");
      out.write("<div class=\"sanpham\">\n");
      out.write("    <p><a href=\"index.jsp?module=sanpham&manhom=");
      out.print(sp.getManhom());
      out.write("&masp=");
      out.print(sp.getId());
      out.write("\">\n");
      out.write("            ");
      out.print(sp.getTensp());
      out.write("</a></p>\n");
      out.write("    <img src=\"Hinhanh/sanpham/");
      out.print(sp.getHinhanh());
      out.write("\">\n");
      out.write("    <p>giá: ");
      out.print(String.format("%,d", sp.getGiasp()));
      out.write("</p>\n");
      out.write("    <p><a href=\"cart_add?masp=");
      out.print(sp.getId());
      out.write("\">Thêm vào giỏ hàng</a></p>\n");
      out.write("</div>\n");
      out.write(" ");

        }//đóng for
    }//đóng else

      out.write("\n");
      out.write("            ");
 } 
      out.write("    \n");
      out.write("        </div>\n");
      out.write("        ");
      out.write("\n");
      out.write("<div id=\"nd_Phai\">\n");
      out.write("        <iframe width=\"200\" src=\"https://www.youtube.com/embed/Y29OrOVJUKs?rel=0\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("        ");
      out.write("\n");
      out.write("<div id=\"footer\"> \n");
      out.write("    \t<p>Liên Hệ: Ths. Trần Mạnh Trường</p>\n");
      out.write("        <p>Mobile: 0912356004 | Email/Fb: Truongtm@gmailc.com</p>\n");
      out.write("</div>");
      out.write("\n");
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
