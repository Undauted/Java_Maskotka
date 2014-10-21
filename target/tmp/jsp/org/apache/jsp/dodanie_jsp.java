package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dodanie_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      com.example.servletjspdemo.domain.Maskotka pluszak = null;
      synchronized (session) {
        pluszak = (com.example.servletjspdemo.domain.Maskotka) _jspx_page_context.getAttribute("pluszak", PageContext.SESSION_SCOPE);
        if (pluszak == null){
          pluszak = new com.example.servletjspdemo.domain.Maskotka();
          _jspx_page_context.setAttribute("pluszak", pluszak, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("pluszak"), request);
      out.write(" \n");
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
      out.write('\n');
 
  pamiec.dodaj(pluszak);

      out.write("\n");
      out.write("\n");
      out.write("<p>Dane o maskotce zostały dodane poprawnie ;) </p>\n");
      out.write("<p>Imie: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pluszak.getImie()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </p>\n");
      out.write("<p>Rodzaj maskotki: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pluszak.getRodzaj()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("<p>Materiał wykonania: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pluszak.getMaterial()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("<p>Interakywna: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pluszak.getInteraktywna()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("<p> <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pluszak.getZdjecie()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"  height=\"100\" width=\"100\"></p>\n");
      out.write("<p>\n");
      out.write("  <a href=\"wyswie.jsp\">Pokaż wszystkie pluszaki</a>\n");
      out.write("</p>\n");
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
