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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>MASKOTKA</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<h2>MASKOTKA</h2>\n");
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
      out.write("\n");
      out.write("\n");
      out.write("<form action=\"dodanie.jsp\">\n");
      out.write("\n");
      out.write("  Imie :<input type=\"text\" name=\"imie\" /><br /><br />\n");
      out.write("  Rodzaj maskotki : <br /><br />\n");
      out.write("  <input type=\"radio\"  name=\"rodzaj\" value=\"Mis\" />Mis<br />\n");
      out.write("  <input type=\"radio\"  name=\"rodzaj\" value=\"Zwierzątko\" />Zwierzątko<br />\n");
      out.write("  <input type=\"radio\"  name=\"rodzaj\" value=\"Postać z bajki\" />Postać z bajki<br />\n");
      out.write("  <input type=\"radio\"  name=\"rodzaj\" value=\"Postać z filmu\" />Postać z filmu<br />\n");
      out.write("   <input type=\"radio\"  name=\"rodzaj\" value=\"Pacynka\" />Pacynka<br /><br />\n");
      out.write("  Materiał wykonania : <br /><br />\n");
      out.write("  <select name=\"material\"  size=\"4\">\n");
      out.write("\t<option value=\"Plusz\">Plusz</option>\n");
      out.write("\t<option value=\"Bawełna\">Bawełna</option>\n");
      out.write("\t<option value=\"Len\">Len</option>\n");
      out.write("\t<option value=\"Dzianina\">Dzianina</option>\n");
      out.write("\t<option value=\"Welur\">Welur</option>\n");
      out.write("\t<option value=\"Polar\">Polar</option>\n");
      out.write("\t</select><br /><br />\n");
      out.write("\tCzy interaktywna ?? <br/><br/>\n");
      out.write("\t<input type=\"radio\"  name=\"interaktywna\" value=\"Tak\" />Tak<br />\n");
      out.write("  \t<input type=\"radio\"  name=\"interaktywna\" value=\"Nie\" />Nie<br /><br />\n");
      out.write("  \tZdjecie :<input type=\"text\" name=\"zdjecie\" /><br /><br />\n");
      out.write("  \t\n");
      out.write("  <input type=\"submit\" value=\" Akceptuj \">\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("\n");
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
