/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.63
 * Generated at: 2021-06-14 02:16:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"../css/bootstrap.min.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"../css/font-awesome.min.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"../css/pe-icon-7-stroke.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"../css/owl.carousel.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"../css/magnific-popup.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"../css/meanmenu.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"../style.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"../css/responsive.css\">\r\n");
      out.write("\t<script src=\"../js/vendor/modernizr-2.8.3.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"//code.jquery.com/jquery-1.11.0.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("h1 {\r\n");
      out.write("\tcolor: #e6dc30;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".loginbox {\r\n");
      out.write("\twidth: 400px;\r\n");
      out.write("\theight: 500px;\r\n");
      out.write("\tborder: 1px solid gray;\r\n");
      out.write("\tmargin: 0 auto;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h5 {\r\n");
      out.write("\tdisplay: inline;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#loginbottom {\r\n");
      out.write("\twidth: 400px;\r\n");
      out.write("\theight: 100px;\r\n");
      out.write("\tmargin: 0 auto;\r\n");
      out.write("\ttext-align: right;\r\n");
      out.write("\tcolor: gray;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input {\r\n");
      out.write("\twidth: 200px;\r\n");
      out.write("\theight: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#logo {\r\n");
      out.write("\ttext-decoration: none\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<!-- header start -->\r\n");
      out.write("\t\t<header>\r\n");
      out.write("\t\t\t<div class=\"header-top-area black-bg hidden-xs\">\r\n");
      out.write("\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-6 col-sm-6\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-6 col-sm-6 hidden-xs\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"header-icon floatright\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"https://github.com/dhw1009/JspTeamproject\"><i class=\"fa fa-github\"></i></a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- header end -->\r\n");
      out.write("\t\t\t<!-- main-menu-area-start -->\r\n");
      out.write("\t\t\t<div class=\"main-menu-area\">\r\n");
      out.write("\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-3 col-sm-2\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"logo\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"../index.jsp\"><img src=\"../img/logo/1.png\" alt=\"\" /></a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-9 col-sm-10\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"main-menu floatright\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<nav>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li class=\"active\"><a href=\"../index.jsp\">Home</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"bbs.jsp\">community</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"../team.jsp\">team</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t</nav>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"mobile-menu-area\"></div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- main-menu-area-end -->\r\n");
      out.write("\t\t</header>\r\n");
      out.write("\t\t<!-- header end -->\r\n");
      out.write("\t<div class=loginbox>\r\n");
      out.write("\t\t<a href=\"../index.jsp\" id=\"logo\"><h1>DaeGul</h1></a>\r\n");
      out.write("\t\t<input type=\"text\" placeholder=\"아이디\" id=\"userID\"> <br>\r\n");
      out.write("\t\t<br> <input type=\"password\" placeholder=\"비밀번호\" id=\"userPassword\">\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<button id=\"login\" onclick=\"login()\">로그인</button>\r\n");
      out.write("\t\t<button id=\"signin\" onclick=\"signup()\">회원가입</button>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"loginbottom\">\r\n");
      out.write("\t\t<h5>도움말</h5>\r\n");
      out.write("\t\t<h5>개인정보처리방침</h5>\r\n");
      out.write("\t\t<h5>약관</h5>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("window.onload=function(){\r\n");
      out.write("\tlogin = function(){\r\n");
      out.write("\t\tvar id = document.getElementById('userID');\r\n");
      out.write("\t\tvar pwd=document.getElementById('userPassword');\r\n");
      out.write("\t\tlocation.href='loginAction.jsp?userID='+id.value+'&userPassword='+pwd.value;\r\n");
      out.write("\t}\r\n");
      out.write("\tsignup = function(){\r\n");
      out.write("\t\tlocation.href='signin.jsp';\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}