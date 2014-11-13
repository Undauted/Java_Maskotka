package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jsp.rejestracja.Rejestracja;

public final class dodanie_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_formatDate_value_type_dateStyle_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_formatDate_value_type_dateStyle_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_fmt_formatDate_value_type_dateStyle_nobody.release();
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
      out.write("\n");
      out.write("\n");
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
      out.write("\t");

		if(session.getAttribute("theName") == null)
		{	out.println("<br/><br/><div class='glowna'><div class='reszta'><h2>MASKOTKA</h2></div>");
			out.println("<div class='napisyProjekt2'>Musisz się zalogować aby przejśc na tą strone.<br/>" 
					+ "Stona automatycznie przejdzie do formularza logowania</div></div>");
			
			out.println("<script  type='text/javascript'>"
					+"setTimeout(function(){location.href='logowanie.jsp';},3000)" 
					+"</script>");
			return;
		}
		
	
      out.write("\n");
      out.write("\t<div class=\"glowna\">\n");
      out.write("\t<div class=\"linki\">\n");
      out.write("\t\n");
      out.write("\t\t<a href=\"http://localhost:8080/servletjspdemo/formularz.jsp\"  class=\"btn btn-primary active\">Strona Główna</a>\n");
      out.write("\t\t<a href=\"http://localhost:8080/servletjspdemo/wyswie.jsp\" class=\"btn btn-primary active\">Lista maskotek</a>\n");
      out.write("\t\t<a href =\"http://localhost:8080/servletjspdemo/wylogowanie.jsp\" class=\"btn btn-primary active\">Wyloguj</a>\n");
      out.write("\t\n");
      out.write("\t</div> <br/>\n");
      out.write("\n");
      out.write("\t\t");
      com.example.servletjspdemo.domain.Maskotka pluszak = null;
      synchronized (session) {
        pluszak = (com.example.servletjspdemo.domain.Maskotka) _jspx_page_context.getAttribute("pluszak", PageContext.SESSION_SCOPE);
        if (pluszak == null){
          pluszak = new com.example.servletjspdemo.domain.Maskotka();
          _jspx_page_context.setAttribute("pluszak", pluszak, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("pluszak"), request);
      out.write(" \n");
      out.write("\t\t\n");
      out.write("\t\t");
      com.example.servletjspdemo.service.Pamiec pamiec1 = null;
      synchronized (application) {
        pamiec1 = (com.example.servletjspdemo.service.Pamiec) _jspx_page_context.getAttribute("pamiec1", PageContext.APPLICATION_SCOPE);
        if (pamiec1 == null){
          pamiec1 = new com.example.servletjspdemo.service.Pamiec();
          _jspx_page_context.setAttribute("pamiec1", pamiec1, PageContext.APPLICATION_SCOPE);
        }
      }
      out.write("\n");
      out.write("\t\t");
      jsp.pamiecrejestracji.PamiećRejestracji pamiec = null;
      synchronized (application) {
        pamiec = (jsp.pamiecrejestracji.PamiećRejestracji) _jspx_page_context.getAttribute("pamiec", PageContext.APPLICATION_SCOPE);
        if (pamiec == null){
          pamiec = new jsp.pamiecrejestracji.PamiećRejestracji();
          _jspx_page_context.setAttribute("pamiec", pamiec, PageContext.APPLICATION_SCOPE);
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"witaj\">\n");
      out.write("\t<a href =\"http://localhost:8080/servletjspdemo/profil.jsp\" class=\"btn btn-primary active\">Twój profil</a>\n");
      out.write("</div>\n");
      out.write("<div class=\"data\">\n");
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_set_0.setPageContext(_jspx_page_context);
      _jspx_th_c_set_0.setParent(null);
      _jspx_th_c_set_0.setVar("now");
      _jspx_th_c_set_0.setValue(new java.util.Date());
      int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
      if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
        return;
      }
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      out.write("\n");
      out.write("<b>");
      if (_jspx_meth_fmt_formatDate_0(_jspx_page_context))
        return;
      out.write("</b>\n");
      out.write("</div>\n");
      out.write("<div class=\"powitanie\">\n");
      out.write("\t<b>Witaj \n");
      out.write("\t");
 
	 for(Rejestracja rejestracja : pamiec.getAll())
	   {
		   if(session.getAttribute("theName").equals(rejestracja.getLogin()))
			{
			   out.print(rejestracja.getImie());
			}
		}
	
      out.write("\n");
      out.write("</b>\n");
      out.write("</div>\t\n");
      out.write("<div class=\"reszta\">\n");
      out.write("\t<h2>MASKOTKA</h2>\n");
      out.write("</div>\t\n");
      out.write("\t");
 
	
	  pamiec1.dodaj(pluszak);
	
	  
	
      out.write("\n");
      out.write("\t<div class=\"czcionka\">\n");
      out.write("\t\t<p>Dane o maskotce zostały dodane poprawnie ;) </p>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<div class=\"imie\">\n");
      out.write("\t<div class=\"czcionka\">\n");
      out.write("\t  Imie :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("\t  \t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("\t  <input type=\"text\" name=\"imie\" id=\"my-textbox\" required size=\"30\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pluszak.getImie()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly /><br /><br />\n");
      out.write("\t</div> \n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"czcionka\">\n");
      out.write("\t\tRodzaj maskotki: \n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"dodanierodzaj\">\n");
      out.write("\t\t<input type=\"radio\"  name=\"rodzaj\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pluszak.getRodzaj()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" checked/> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pluszak.getRodzaj()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<div class=\"czcionka\">\n");
      out.write("\t\tMateriał wykonania:\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<div class=\"dodaniematerial\">\n");
      out.write("\t\t<select name=\"material\"  required size=\"1\" >\n");
      out.write("\t\t\t<option value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pluszak.getMaterial()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pluszak.getMaterial()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</option>\n");
      out.write("\t\t</select>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"czcionka\">\n");
      out.write("\t\t<p>Interakywna: </p>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"dodaniematerial\">\n");
      out.write("\t\t<input type=\"radio\"  name=\"interaktywna\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pluszak.getInteraktywna()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" checked/> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pluszak.getInteraktywna()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"czcionka\">\n");
      out.write("\t\tZdjęcie:\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"zdjecie\">\n");
      out.write("\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pluszak.getZdjecie()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"  height=\"55\" width=\"55\" alt=\"Brak zdjęcia\">\n");
      out.write("\t</div> <br/>\n");
      out.write("\t<div class=\"listaDodanie\">\n");
      out.write("\t  <a href=\"wyswie.jsp\" class=\"btn btn-primary btn-large active\">Lista maskotek</a>\n");
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

  private boolean _jspx_meth_fmt_formatDate_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_type_dateStyle_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_0.setParent(null);
    _jspx_th_fmt_formatDate_0.setType("date");
    _jspx_th_fmt_formatDate_0.setDateStyle("medium");
    _jspx_th_fmt_formatDate_0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${now}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_formatDate_0 = _jspx_th_fmt_formatDate_0.doStartTag();
    if (_jspx_th_fmt_formatDate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_type_dateStyle_nobody.reuse(_jspx_th_fmt_formatDate_0);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_type_dateStyle_nobody.reuse(_jspx_th_fmt_formatDate_0);
    return false;
  }
}
