package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class formularz_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>MASKOTKA</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"a.css\" type=\"text/css\" /> \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"przesuniecie\">\n");
      out.write("<img src=\"http://cdn.bulbagarden.net/upload/thumb/7/72/613Cubchoo.png/180px-613Cubchoo.png\" height='300' width='300'>\n");
      out.write("</div>\n");
      out.write("<div class=\"przesuniecie2\">\n");
      out.write("<img src=\"http://cdn.bulbagarden.net/upload/thumb/7/72/613Cubchoo.png/180px-613Cubchoo.png\" height='300' width='300'>\n");
      out.write("</div>\n");
      out.write("<div class=\"glowna\">\n");
      out.write("<div class=\"linki\">\n");
      out.write("<div class=\"rusz\">\n");
      out.write("<a href=\"http://localhost:8080/servletjspdemo/formularz.jsp\">Strona Główna</a>\n");
      out.write("<a href=\"http://localhost:8080/servletjspdemo/wyswie.jsp\">Lista maskotek</a>\n");
      out.write("</div></div>\n");
      out.write("<div class=\"reszta\">\n");
      out.write("<h2>MASKOTKA</h2>\n");
      out.write("</div>\n");
      out.write("\n");
      com.example.servletjspdemo.service.Pamiec pamiec = null;
      synchronized (application) {
        pamiec = (com.example.servletjspdemo.service.Pamiec) _jspx_page_context.getAttribute("pamiec", PageContext.APPLICATION_SCOPE);
        if (pamiec == null){
          pamiec = new com.example.servletjspdemo.service.Pamiec();
          _jspx_page_context.setAttribute("pamiec", pamiec, PageContext.APPLICATION_SCOPE);
        }
      }
      out.write('\n');
      com.example.servletjspdemo.domain.Maskotka pluszak = null;
      synchronized (session) {
        pluszak = (com.example.servletjspdemo.domain.Maskotka) _jspx_page_context.getAttribute("pluszak", PageContext.SESSION_SCOPE);
        if (pluszak == null){
          pluszak = new com.example.servletjspdemo.domain.Maskotka();
          _jspx_page_context.setAttribute("pluszak", pluszak, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
 
pluszak.setImie("");
pluszak.setRodzaj("");
pluszak.setMaterial("");
pluszak.setInteraktywna("");
pluszak.setZdjecie("");
out.println(pluszak.getImie());
      out.write("\n");
      out.write("\n");
      out.write("<form action=\"dodanie.jsp\">\n");
      out.write("<div class=\"imie\">\n");
      out.write("<div class=\"czcionka\">\n");
      out.write("  Imie :&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("  <input type=\"text\" name=\"imie\" id=\"my-textbox\" required size=\"43\"/><br /><br />\n");
      out.write(" </div> </div>\n");
      out.write("  \t<script>\n");
      out.write("\t\tvar myTextbox = document.getElementById('my-textbox');\n");
      out.write("\t\t \n");
      out.write("\t\tfunction checkName(evt) {\n");
      out.write("\t\t    var charCode = evt.charCode;\n");
      out.write("\t\t \n");
      out.write("\t\t    if (charCode != 0) {\n");
      out.write("\t\t        if (charCode < 65 || charCode > 122) {\n");
      out.write("\t\t            evt.preventDefault();\n");
      out.write("\t\t            alert(\n");
      out.write("\t\t                \"Proszę używać tylko liter\\n\" \n");
      out.write("\t\t            );\n");
      out.write("\t\t        }\n");
      out.write("\t\t    }\n");
      out.write("\t\t}\n");
      out.write("\t\t \n");
      out.write("\t\tmyTextbox.addEventListener( 'keypress', checkName, false );\n");
      out.write(" \n");
      out.write("\t</script>\n");
      out.write("\t<div class=\"k\">\n");
      out.write(" \t<div class=\"czcionka\">\n");
      out.write("  \t\tRodzaj:  \n");
      out.write(" \t</div>\n");
      out.write(" \n");
      out.write("  <div class=\"radio\">\n");
      out.write("  <input type=\"radio\"  name=\"rodzaj\" value=\"Mis\" checked/>Mis<br />\n");
      out.write("  <input type=\"radio\"  name=\"rodzaj\" value=\"Zwierzątko\" />Zwierzątko<br />\n");
      out.write("  <input type=\"radio\"  name=\"rodzaj\" value=\"Postać z bajki\" />Postać z bajki<br />\n");
      out.write("  <input type=\"radio\"  name=\"rodzaj\" value=\"Postać z filmu\" />Postać z filmu<br />\n");
      out.write("  <input type=\"radio\"  name=\"rodzaj\" value=\"Pacynka\" />Pacynka<br /><br /> \n");
      out.write("  </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"material\" >\n");
      out.write("  <div class=\"czcionka\">\n");
      out.write("  Materiał wykonania : </div> <br/>\n");
      out.write("  \n");
      out.write("  <div class=\"lista\">\n");
      out.write("  <select name=\"material\"  required size=\"5\">\n");
      out.write("\t<option value=\"Plusz\">Plusz</option>\n");
      out.write("\t<option value=\"Bawełna\">Bawełna</option>\n");
      out.write("\t<option value=\"Len\">Len</option>\n");
      out.write("\t<option value=\"Dzianina\">Dzianina</option>\n");
      out.write("\t<option value=\"Welur\">Welur</option>\n");
      out.write("\t<option value=\"Polar\">Polar</option>\n");
      out.write("\t</select></div>\n");
      out.write("\t</div>\n");
      out.write("\t<br /><br /><br /><br /><br /><br /><br /><br />\n");
      out.write("\t<div class=\"interakcja\">\n");
      out.write("\t<div class=\"czcionka\">\n");
      out.write("\tCzy interaktywna ??</div> <br/><br/>\n");
      out.write("\t<div class=\"radio\">\n");
      out.write("\t<input type=\"radio\"  name=\"interaktywna\" value=\"Tak\" checked/>Tak<br />\n");
      out.write("  \t<input type=\"radio\"  name=\"interaktywna\" value=\"Nie\" />Nie<br /><br />\n");
      out.write("  \t</div>\n");
      out.write("  \t</div>\n");
      out.write("  \t\n");
      out.write("  \t<div class=\"k\"> \n");
      out.write("  \t<div class=\"czcionka\">\n");
      out.write("  \tZdjecie: <input type=\"text\" name=\"zdjecie\" required size=\"43\"/>\n");
      out.write("  \t</div>\n");
      out.write("  \t</div>\n");
      out.write(" \t<br /><br />\n");
      out.write(" \t\n");
      out.write("  <input type=\"submit\" value=\" Akceptuj\" >\n");
      out.write(" </form>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>");
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
