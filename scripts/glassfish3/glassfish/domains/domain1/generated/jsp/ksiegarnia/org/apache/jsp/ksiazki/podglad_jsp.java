package org.apache.jsp.ksiazki;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class podglad_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setHeader("X-Powered-By", "JSP/2.2");
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
      out.write("<html lang=\"pl\">\n");
      out.write("<head>\n");
      out.write("    \t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../elementy/head.jsp", out, false);
      out.write('\n');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../elementy/skrypty.jsp", out, false);
      out.write("\n");
      out.write("\t<script>\n");
      out.write("\t\t$(document).ready(function()\n");
      out.write("\t\t\t{\t\n");
      out.write("\t\t\t$.ajax\n");
      out.write("\t\t\t\t(\n");
      out.write("\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\turl: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/rest/ksiazka/podglad/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ksiazkaId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("',\n");
      out.write("\t\t\t\t\t\ttype: 'GET',\n");
      out.write("\t\t\t\t\t\tsuccess: function(w) { \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdocument.getElementById('pole1').innerHTML = w.datawyd;\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdocument.getElementById('pole2').innerHTML = w.autor.imie;\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdocument.getElementById('pole3').innerHTML = w.cena;\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdocument.getElementById('pole4').innerHTML = w.opis;\n");
      out.write("\t\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t}\t\n");
      out.write("\t\t\t\t);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t);\n");
      out.write("\t</script>\n");
      out.write("\t<script>\n");
      out.write("\t\t$(document).ready(function()\n");
      out.write("\t\t\t{\n");
      out.write("\t\t\t\t$( \"#usun\" ).on('click', function(e)\n");
      out.write("\t\t\t\t\t{\t\n");
      out.write("\t\t\t\t\t\te.preventDefault();\n");
      out.write("\t\t\t\t\t\t$.ajax\n");
      out.write("\t\t\t\t\t\t(\n");
      out.write("\t\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\t    url: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/rest/autor/usun/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ksiazkaId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("',\n");
      out.write("\t\t\t\t\t\t    type: 'DELETE',\n");
      out.write("\t\t\t\t\t\t    success: function() { document.location.replace(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Ksiazki\"); }\n");
      out.write("\t\t\t\t\t\t}\t\n");
      out.write("\t\t\t\t\t\t);\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t);\n");
      out.write("\t</script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../elementy/menu.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <h1 class=\"text-center\">Ksiazka</h1>\n");
      out.write("        <br/>\n");
      out.write("\n");
      out.write("        <label>Data wydania:</label>\n");
      out.write("        <div id = \"pole1\" class=\"well well-sm\"></div>\n");
      out.write("\n");
      out.write("        <label>Autor:</label>\n");
      out.write("        <div id = \"pole2\" class=\"well well-sm\"></div>\n");
      out.write("\n");
      out.write("        <label>Cena:</label>\n");
      out.write("        <div id = \"pole3\" class=\"well well-sm\"></div>\n");
      out.write("\n");
      out.write("        <label>Opis:</label>\n");
      out.write("        <div id = \"pole4\" class=\"well well-lg\"></div>\n");
      out.write("\t<div class=\"form-group text-center\">\n");
      out.write("\t\t                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/EdytujKsiazke/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ksiazkaId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"btn btn-primary\" role=\"button\">Edytuj</a>\n");
      out.write("\t\t                <button id=\"usun\" type=\"submit\" class=\"btn btn-danger\">Usuń</button>\n");
      out.write("\t\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"btn btn-default\" role=\"button\">Wróć</a>\n");
      out.write("    \t</div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../elementy/stopka.jsp", out, false);
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
