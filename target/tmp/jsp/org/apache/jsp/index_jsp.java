package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<title>MASKOTKA</title>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"a.css\" type=\"text/css\" /> \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div class=\"przesuniecie\">\n");
      out.write("\t\t<img src=\"http://cdn.bulbagarden.net/upload/thumb/7/72/613Cubchoo.png/180px-613Cubchoo.png\" height='300' width='300'>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"przesuniecie2\">\n");
      out.write("\t\t<img src=\"http://cdn.bulbagarden.net/upload/thumb/7/72/613Cubchoo.png/180px-613Cubchoo.png\" height='300' width='300'>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<div class=\"reszta\">\n");
      out.write("\t<div class=\"linki\">\n");
      out.write("\t\t<a href=\"http://localhost:8080/servletjspdemo/logowanie.jsp\" class=\"btn btn-primary active\">Logowanie</a>\n");
      out.write("\t<a href=\"http://localhost:8080/servletjspdemo/rejestracja.jsp\" class=\"btn btn-primary active\">Rejestracja</a>\n");
      out.write("\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<br/><br/>\n");
      out.write("\t<div class=\"glowna\">\n");
      out.write("\t<div class=\"reszta\">\n");
      out.write("\t\t<h2>MASKOTKA</h2>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"wysrodkowanie\">\n");
      out.write("\t\tZabawka występująca pod różnymi postaciami i wykonana z różnych materiałów. \n");
      out.write("\t\tNajczęściej przeznaczona dla dzieci, ale korzystać z niej może każdy. \n");
      out.write("\t\tMaskotki mogą być wykonane przez producentów bądź własnoręcznie. \n");
      out.write("\t\tMateriały z jakich są robione to najczęściej plusz, bawełna, len, dzianina, welur, polar.\n");
      out.write("\t\t<br/><br/>\n");
      out.write("\t\tStrona do skatalogowania swoich ulubionych pluszaków<br/><br/>\n");
      out.write("\t<img src=\"a.jpg\" height='120' width='120' alt='Brak zdjęcia'>\n");
      out.write("\t<img src=\"b.jpg\" height='120' width='120' alt='Brak zdjęcia'>\t\n");
      out.write("\t<img src=\"c.jpg\" height='120' width='120' alt='Brak zdjęcia'>\n");
      out.write("\t</div>\n");
      out.write("\t</div>\n");
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
