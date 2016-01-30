package org.apache.jsp.ksiazki;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dodaj_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
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
      out.write("\t\t\t\t$( \"#datawyd\" ).datepicker\n");
      out.write("\t\t\t\t(\n");
      out.write("\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\tchangeMonth: true,\n");
      out.write("\t\t\t\t\t\tchangeYear: true,\n");
      out.write("\t\t\t\t\t\tdateFormat: \"yy-mm-dd\",\n");
      out.write("\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t$.datepicker.regional[ \"pl\" ]\n");
      out.write("\t\t\t\t);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t);\n");
      out.write("\t</script>\n");
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
      out.write("/rest/ksiazka/dodaj',\n");
      out.write("\t\t\t\t\t\t    type: 'POST',\n");
      out.write("\t\t\t\t\t\t    data:\n");
      out.write("\t\t\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\t\t\tdatawyd: document.getElementById('datawyd').value,\n");
      out.write("\t\t\t\t\t\t\t\tautor: document.getElementById('autor').value,\n");
      out.write("\t\t\t\t\t\t\t\tcena: document.getElementById('cena').value,\n");
      out.write("\t\t\t\t\t\t\t\topis: document.getElementById('opis').value\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\t    success: function() { document.location.replace(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Ksiazki\"); },\n");
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
      out.write("        <h1 class=\"text-center\">Dodaj ksiazke</h1>\n");
      out.write("            \t<form data-toggle=\"validator\" method=\"post\" class=\"form-horizontal\">\n");
      out.write("\n");
      out.write("\t\t        <div class=\"form-group\">\n");
      out.write("\t\t            <label for=\"data\" class=\"col-sm-2 control-label\">Data wydania:</label>\n");
      out.write("\n");
      out.write("\t\t            <div class=\"col-sm-10\">\n");
      out.write("\t\t                <input type=\"date\" name=\"datawyd\" id=\"datawyd\" class=\"form-control\" placeholder=\"rrrr-mm-dd\" required/>\n");
      out.write("\t\t            </div>\n");
      out.write("\t\t        </div>\n");
      out.write("\n");
      out.write("\t\t        <div class=\"form-group\">\n");
      out.write("\t\t         \t<label for=\"autor\" class=\"col-sm-2 control-label\">Autor:</label>\n");
      out.write("\t\t\t\t<div class=\"col-sm-10\">\n");
      out.write("\t\t\t\t         <select type=\"text\" name=\"autor\" id=\"autor\" class=\"form-control\" required>\n");
      out.write("\t\t\t\t     \t\t");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t        </div>\n");
      out.write("\n");
      out.write("\t\t        <div class=\"form-group\">\n");
      out.write("\t\t            \t<label for=\"cena\" class=\"col-sm-2 control-label\" >Cena:</label>\n");
      out.write("\n");
      out.write("\t\t            \t<div class=\"col-sm-10\">\n");
      out.write("\t\t                \t<input type=\"text\" pattern=\"^[0-9]+$|^[0-9]+[.][0-9]+$\" name=\"cena\" id=\"cena\" class=\"form-control\" placeholder=\"0.0\" required>\n");
      out.write("\t\t            \t</div>\n");
      out.write("\t\t        </div>\n");
      out.write("\n");
      out.write("\t\t        <div class=\"form-group\">\n");
      out.write("\t\t           \t<label for=\"opis\" class=\"col-sm-2 control-label\">Opis:</label>\n");
      out.write("\n");
      out.write("\t\t            \t<div class=\"col-sm-10\">\n");
      out.write("\t\t                \t<input type=\"text\" name=\"opis\" min=\"2\" id=\"opis\" class=\"form-control\"/>\n");
      out.write("\t\t            \t</div>\n");
      out.write("\t\t        </div>\n");
      out.write("\t\t        <div class=\"form-group text-center\">\n");
      out.write("\t\t                <button id=\"dodaj\" type=\"submit\" class=\"btn btn-success\">Dodaj</button>\n");
      out.write("\t\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Ksiazki\" class=\"btn btn-default\" role=\"button\">Wróć</a>\n");
      out.write("\t\t        </div>\n");
      out.write("\n");
      out.write("            \t</form>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("autorFK");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${autorzyDostepni}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVarStatus("loopCounter");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t    \t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${autorFK.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${autorFK.getImie()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("\t\t\t\t\t    \t");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
