package org.apache.jsp.autorzy;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dodaj_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\t\t{\n");
      out.write("\t\t\t\t$( \"#dodaj\" ).on('click', function(e)\n");
      out.write("\t\t\t\t\t{\t\n");
      out.write("\t\t\t\t\t\te.preventDefault();\n");
      out.write("\t\t\t\t\t\t$.ajax\n");
      out.write("\t\t\t\t\t\t(\n");
      out.write("\t\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\t    url: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/rest/autor/dodaj',\n");
      out.write("\t\t\t\t\t\t    type: 'POST',\n");
      out.write("\t\t\t\t\t\t    data:\n");
      out.write("\t\t\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\t\t\timie: document.getElementById('imie').value,\n");
      out.write("\t\t\t\t\t\t\t\twzrost: document.getElementById('wzrost').value,\n");
      out.write("\t\t\t\t\t\t\t\tilosck: document.getElementById('ilosck').value\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\t    success: function() { document.location.replace(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Autorzy\"); },\n");
      out.write(" \t\t\t\t\t\t    error: function() { alert(\"Nieprawidłowo wprowadzono dane!\"); }\n");
      out.write("\t\t\t\t\t\t}\t\t\n");
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
      out.write("        <h1 class=\"text-center\">Dodaj autora</h1>\n");
      out.write("\n");
      out.write("        \t<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/rest/autor/dodaj\" data-toggle=\"validator\" method=\"post\" class=\"form-horizontal\">\n");
      out.write("\t\t        <div class=\"form-group\">\n");
      out.write("\t\t            <label for=\"imie\" class=\"col-sm-2 control-label\">Imie:</label>\n");
      out.write("\n");
      out.write("\t\t            <div class=\"col-sm-10\">\n");
      out.write("\t\t                <input type=\"text\" name=\"imie\" id=\"imie\" class=\"form-control\" data-minlength=\"2\" required>\n");
      out.write("\t\t            </div>\n");
      out.write("\t\t        </div>\n");
      out.write("\n");
      out.write("\t\t        <div class=\"form-group\">\n");
      out.write("\t\t            <label for=\"wzrost\" class=\"col-sm-2 control-label\">Wzrost:</label>\n");
      out.write("\n");
      out.write("\t\t            <div class=\"col-sm-10\">\n");
      out.write("\t\t                <input type=\"text\" name=\"wzrost\" id=\"wzrost\" pattern=\"^[0-9][0-9]$\" class=\"form-control\"  placeholder=\"0.0\" required>\n");
      out.write("\t\t            </div>\n");
      out.write("\t\t        </div>\n");
      out.write("\n");
      out.write("\t\t        <div class=\"form-group\">\n");
      out.write("\t\t            <label for=\"ilosck\" class=\"col-sm-2 control-label\">Ilość książek:</label>\n");
      out.write("\n");
      out.write("\t\t            <div class=\"col-sm-10\">\n");
      out.write("\t\t                <input type=\"text\" name=\"ilosck\" id=\"ilosck\" pattern=\"^[0-9]+$\" class=\"form-control\" placeholder=\"0\" required>\n");
      out.write("\t\t            </div>\n");
      out.write("\t\t        </div>\n");
      out.write("\t\t        <div class=\"form-group text-center\">\n");
      out.write("\t\t                <button id=\"dodaj\" type=\"submit\" class=\"btn btn-success\">Dodaj</button>\n");
      out.write("\t\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Autorzy\" class=\"btn btn-default\" role=\"button\">Wróć</a>\n");
      out.write("\t\t \t    </div>\n");
      out.write("\t\t        </div>\n");
      out.write("            \t</form>\n");
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../elementy/stopka.jsp", out, false);
      out.write("\n");
      out.write("</div>\n");
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
