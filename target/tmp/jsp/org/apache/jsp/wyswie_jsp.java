package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jsp.rejestracja.Rejestracja;
import com.example.servletjspdemo.domain.Maskotka;

public final class wyswie_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
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
      out.write("\t");

		if(session.getAttribute("theName") == null)
		{	
			out.println("<br/><br/><div class='glowna'>");
			out.println("<div class='reszta'><h2>MASKOTKA</h2></div>");
			out.println("<div class='napisyProjekt2'>Musisz się zalogować aby przejśc na tą strone.<br/>" 
					+ "Stona automatycznie przejdzie do formularza logowania</div>");
			out.println("</div>");
			out.println("<script  type='text/javascript'>"
					+"setTimeout(function(){location.href='logowanie.jsp';},3000)" 
					+"</script>");
			return;
		}
		
	
      out.write("\n");
      out.write("\t<div class=\"linki\">\n");
      out.write("\t<div class=\"rusz\">\n");
      out.write("\t\t<a href=\"http://localhost:8080/servletjspdemo/formularz.jsp\"  class=\"btn btn-primary active\">Strona Główna</a>\n");
      out.write("\t\t<a href=\"http://localhost:8080/servletjspdemo/wyswie.jsp\" class=\"btn btn-primary active\">Lista maskotek</a>\n");
      out.write("\t\t<a href =\"http://localhost:8080/servletjspdemo/wylogowanie.jsp\" class=\"btn btn-primary active\">Wyloguj</a>\n");
      out.write("\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t");
      com.example.servletjspdemo.service.Pamiec pamiec1 = null;
      synchronized (application) {
        pamiec1 = (com.example.servletjspdemo.service.Pamiec) _jspx_page_context.getAttribute("pamiec1", PageContext.APPLICATION_SCOPE);
        if (pamiec1 == null){
          pamiec1 = new com.example.servletjspdemo.service.Pamiec();
          _jspx_page_context.setAttribute("pamiec1", pamiec1, PageContext.APPLICATION_SCOPE);
        }
      }
      out.write('\n');
      out.write('	');
      jsp.pamiecrejestracji.PamiećRejestracji pamiec = null;
      synchronized (application) {
        pamiec = (jsp.pamiecrejestracji.PamiećRejestracji) _jspx_page_context.getAttribute("pamiec", PageContext.APPLICATION_SCOPE);
        if (pamiec == null){
          pamiec = new jsp.pamiecrejestracji.PamiećRejestracji();
          _jspx_page_context.setAttribute("pamiec", pamiec, PageContext.APPLICATION_SCOPE);
        }
      }
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t<br/>\n");
      out.write("\t<div class=\"glowna\" style=\"overflow: auto; width:600px;  height: 480px\">\n");
      out.write("\t<div class=\"witaj\">\n");
      out.write("\t\t<a href =\"http://localhost:8080/servletjspdemo/profil.jsp\" class=\"btn btn-primary active\">Twój profil</a>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"powitanie\">\n");
      out.write("\t<b>\tWitaj \n");
      out.write("\t\t");
 
		 for(Rejestracja rejestracja : pamiec.getAll())
		   {
			   if(session.getAttribute("theName").equals(rejestracja.getLogin()))
				{
				   out.print(rejestracja.getImie());
				}
			}
		
      out.write("\n");
      out.write("\t</b>\n");
      out.write("\t\n");
      out.write("\t</div>\t\n");
      out.write("\t<div class=\"reszta\">\n");
      out.write("\t\t<h2>MASKOTKA</h2>\n");
      out.write("\t</div>\n");

String przyciskUsun = request.getParameter("usun");

if(przyciskUsun != null)
{
	int numer = Integer.parseInt(przyciskUsun);
	pamiec1.usun(numer);
}
int i=1;
int indeks = 0;
  for (Maskotka pluszak : pamiec1.getAll()) {
	  
	  out.println("<br/><br/><div class='wyswie'><div class='reszta'><h2>MASKOTKA</h2></div><div class='wielkość'>"
	  				+ i++ 
			  		+"&nbsp;Imie: <b>" + pluszak.getImie() + "</b>"
	  				+ "<br/>&nbsp;&nbsp; Rodzaj maskotki: <b>" + pluszak.getRodzaj() + "</b>"
	  				+ "<br/>&nbsp;&nbsp;  Material wykonania: <b>"+ pluszak.getMaterial() +"</b>"
	  				+"<br/>&nbsp;&nbsp; Interakcja: <b>"+ pluszak.getInteraktywna() + "</b>"
	  				+ "<br/>&nbsp;&nbsp; Zdjecie: <b>"
	  				+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
	  				+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
	  				+"<img src='" + pluszak.getZdjecie() + "' height='120' width='120' alt='Brak zdjęcia'>"+"</b>" 
	  				+"<form action='wyswie.jsp' method='get'>"
					+ "<button type='submit' name='usun' id='button' class='btn btn-primary active' value="+ indeks++ + ">Usuń</button>"
	  				+"</form>"
	  				+ "</div></div><br/>");
  }

      out.write("\n");
      out.write("<br/>\n");
      out.write("\t<div class=\"listaWyswie\">\n");
      out.write("\t\t<a href=\"formularz.jsp\" class=\"btn btn-primary active\">Dodaj nowego pluszaka</a>\n");
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
