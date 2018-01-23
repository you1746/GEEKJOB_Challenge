package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public final class test160502_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

          HttpSession hs = request.getSession();
          String nn = (String)hs.getAttribute("myname");
          String ss = (String)hs.getAttribute("mysex");
          String hh = (String)hs.getAttribute("myhobby");
          
          out.print("セッション情報<br>");
          out.print("myname：" + nn + "<br>");
          out.print("mysex：" + ss + "<br>");
          out.print("myhobby：" + hh + "<br>");
          out.print("<br>");
        
      out.write("\n");
      out.write("        \n");
      out.write("        <form action=\"test160502\" method=\"get\">\n");
      out.write("            名前：\n");
      out.write("            ");

            if(nn==null){
            
      out.write("\n");
      out.write("                <input type=\"text\" name=\"myname\">\n");
      out.write("            ");

            }
            else{
            
      out.write("\n");
      out.write("            <input type=\"text\" name=\"myname\" value=\"");
 out.print(nn); 
      out.write("\">\n");
      out.write("            ");

            }
            
      out.write("\n");
      out.write("                \n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            性別<br>\n");
      out.write("            ");

            try{
                if(ss == null){
                
      out.write("\n");
      out.write("                    男\n");
      out.write("                    <input type=\"radio\" name=\"mysex\" value=\"man\">\n");
      out.write("                    女\n");
      out.write("                    <input type=\"radio\" name=\"mysex\" value=\"woman\">\n");
      out.write("                ");

                }
                else if(ss.equals("man")){
                
      out.write("\n");
      out.write("                    男\n");
      out.write("                    <input type=\"radio\" name=\"mysex\" value=\"man\" checked>\n");
      out.write("                    女\n");
      out.write("                    <input type=\"radio\" name=\"mysex\" value=\"woman\">\n");
      out.write("                ");

                }
                else if(ss.equals("woman")){
                
      out.write("\n");
      out.write("                    男\n");
      out.write("                    <input type=\"radio\" name=\"mysex\" value=\"man\">\n");
      out.write("                    女\n");
      out.write("                    <input type=\"radio\" name=\"mysex\" value=\"woman\" checked>\n");
      out.write("                ");

                }
            }
            catch (Exception e){
                out.print(e);
            }
            
      out.write("\n");
      out.write("            \n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            趣味：\n");
      out.write("            ");

            if(hh==null){
            
      out.write("\n");
      out.write("                 <input type=\"text\" name=\"myhobby\">\n");
      out.write("            ");

            }
            else{
            
      out.write("\n");
      out.write("                 <input type=\"text\" name=\"myhobby\" value=\"");
 out.print(hh); 
      out.write("\">\n");
      out.write("            ");

            }
            
      out.write("\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <input type=\"submit\" name=\"btnsubmit\">\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
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
