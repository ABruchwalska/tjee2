package org.apache.jsp.dane;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class autorzy_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\t\t\t{\t\t\n");
      out.write("\t\t\t\t$.ajax\n");
      out.write("\t\t\t\t\t(\n");
      out.write("\t\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\t\turl: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/rest/autor/dajWszystkie',\n");
      out.write("\t\t\t\t\t\t\ttype: 'GET',\n");
      out.write("\t\t\t\t\t\t\tsuccess: function(dane)\n");
      out.write("\t\t\t\t\t\t\t{ \n");
      out.write("\t\t\t\t\t\t\t\tvar d = dane.length;\n");
      out.write("\t\t\t\t\t\t\t\tvar table = document.getElementById(\"tabela\");\n");
      out.write("\t\t\t\t\t\t\t\tfor (var i = 0; i < d; i++)\n");
      out.write("\t\t\t\t\t\t\t\t{\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t    tr = $('<tr/>');\n");
      out.write("\t\t\t\t\t\t\t\t\t    tr.append(\"<td>\"+dane[i].imie+\"</td>\");\n");
      out.write("\t\t\t\t\t\t\t\t\t    tr.append(\"<td>\"+dane[i].wzrost+\"</td>\");\n");
      out.write("\t\t\t\t\t\t\t\t\t    tr.append(\"<td>\"+dane[i].ilosck+\"</td>\");\n");
      out.write("\t\t\t\t\t\t\t\t\t    td = $('<td/>');\n");
      out.write("\t\t\t\t\t\t\t\t\t    td.append(\n");
      out.write("\"<a href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/PodgladAutor/\"+dane[i].id+\"' class='btn btn-xs btn-warning' role='button'> Podgląd </a> \"+\n");
      out.write("\"<a href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/EdytujAutora/\"+dane[i].id+\"' class='btn btn-xs btn-primary' role='button'>Edytuj</a> \"+\n");
      out.write("\"<button id=\"+dane[i].id+\" onClick='usun(\"+dane[i].id+\")' type='submit' class='btn btn-xs btn-danger'>Usuń</button>\");\n");
      out.write("\t\t\t\t\t\t\t\t\t    tr.append(td);\n");
      out.write("\t\t\t\t\t\t\t\t\t    $(table).append(tr);\n");
      out.write("\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t}\t\n");
      out.write("\t\t\t\t\t);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t);\n");
      out.write("\t</script>\n");
      out.write("\t<script>\n");
      out.write("\t\tfunction usun(id)\n");
      out.write("\t\t\t\t{\t\n");
      out.write("\t\t\t\t\t$.ajax\n");
      out.write("\t\t\t\t\t(\n");
      out.write("\t\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\t\turl: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/rest/autor/usun/'+id,\n");
      out.write("\t\t\t\t\t\t\ttype: 'DELETE',\n");
      out.write("\t\t\t\t\t\t\tsuccess: function() { document.location.reload(true);}\n");
      out.write("\t\t\t\t\t\t}\t\n");
      out.write("\t\t\t\t\t);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t</script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../elementy/menu.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <h1 class=\"text-center\">Autorzy</h1>\n");
      out.write("        <div>\n");
      out.write("        \t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/DodajAutora\" class=\"btn btn-success\" role=\"button\">Dodaj</a>\n");
      out.write("         </div>\n");
      out.write("        <br/>\n");
      out.write("\n");
      out.write("        <table id=\"tabela\" class=\"table table-striped\">\n");
      out.write("               <tr>\n");
      out.write("                     <th>Imie</th>\n");
      out.write("                     <th>Wzrost</th>\n");
      out.write("                     <th>Ilość Książek</th>\n");
      out.write("                     <th></th>\n");
      out.write("              </tr>\n");
      out.write("\t</table>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../elementy/stopka.jsp", out, false);
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../elementy/skrypty.jsp", out, false);
      out.write("\n");
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
