package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Project.ConnectionProvider;
import java.sql.*;

public final class addNewStudent_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');

String course = request.getParameter("course");
String branch = request.getParameter("branch");
String rollNo = request.getParameter("rollNo");
String name = request.getParameter("name");
String fatherName = request.getParameter("fatherName");
String gender = request.getParameter("gender");

try{
           Class.forName("oracle.jdbc.driver.OracleDriver");
            //registering type4 driver of oracle
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","password");
            Statement stmt=con.createStatement();
            String q1 = "insert into studentResult values('"+course+"','"+branch+"','"+rollNo+"','"+name+"','"+fatherName+"','"+gender+"')";
            int x=stmt.executeUpdate(q1);
            if(x>0){
                System.out.println("Insert Success");
            }
            else{
                System.out.println("Insert unsuccess");   
                con.close();
            }
            
}
catch(Exception e){
    System.out.println(e);
}


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
