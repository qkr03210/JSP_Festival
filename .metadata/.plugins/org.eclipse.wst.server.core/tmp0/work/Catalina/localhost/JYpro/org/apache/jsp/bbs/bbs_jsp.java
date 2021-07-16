/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.63
 * Generated at: 2021-06-13 17:41:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.bbs;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.PrintWriter;
import bbs.BbsDAO;
import bbs.Bbs;
import java.util.ArrayList;

public final class bbs_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.io.PrintWriter");
    _jspx_imports_classes.add("bbs.Bbs");
    _jspx_imports_classes.add("bbs.BbsDAO");
    _jspx_imports_classes.add("java.util.ArrayList");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\t");

		int pageNumber = 1; //기본은 1 페이지를 할당
		// 만약 파라미터로 넘어온 오브젝트 타입 'pageNumber'가 존재한다면
		// 'int'타입으로 캐스팅을 해주고 그 값을 'pageNumber'변수에 저장한다
		if(request.getParameter("pageNumber") != null){
			pageNumber = Integer.parseInt(request.getParameter("pageNumber"));
		}
	
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<!-- 화면 최적화 -->\r\n");
      out.write("<meta name=\"viewport\" content=\"width-device-width\", initial-scale=\"1\">\r\n");
      out.write("<!-- 루트 폴더에 부트스트랩을 참조하는 링크 -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/bootstrap.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/bootstrap.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/font-awesome.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/pe-icon-7-stroke.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/owl.carousel.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/magnific-popup.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/meanmenu.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../style.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/responsive.css\">\r\n");
      out.write("<script src=\"../js/vendor/modernizr-2.8.3.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<title>JSP 게시판 웹 사이트</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\ta, a:hover{\r\n");
      out.write("\t\tcolor: #000000;\r\n");
      out.write("\t\ttext-decoration: none;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- header start -->\r\n");
      out.write("\t\t<header>\r\n");
      out.write("\t\t\t<div class=\"header-top-area black-bg hidden-xs\">\r\n");
      out.write("\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-6 col-sm-6\">\r\n");
      out.write("<!-- \t\t\t\t\t\t\t<ul class=\"top-right\"> -->\r\n");
      out.write("<!-- \t\t\t\t\t\t\t\t<li> -->\r\n");
      out.write("<!-- \t\t\t\t\t\t\t\t\t<i class=\"fa fa-envelope\"></i> -->\r\n");
      out.write("<!-- \t\t\t\t\t\t\t\t\t<span id=\"userId\">qkr03210@gmail.com</span> -->\r\n");
      out.write("<!-- \t\t\t\t\t\t\t\t</li> -->\r\n");
      out.write("<!-- \t\t\t\t\t\t\t\t<li> -->\r\n");
      out.write("<!-- \t\t\t\t\t\t\t\t\t<i class=\"fa fa-phone\"></i> -->\r\n");
      out.write("<!-- \t\t\t\t\t\t\t\t\t<span>+82 10 9774 5263</span> -->\r\n");
      out.write("<!-- \t\t\t\t\t\t\t\t</li> -->\r\n");
      out.write("<!-- \t\t\t\t\t\t\t</ul> -->\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-6 col-sm-6 hidden-xs\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"header-icon floatright\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"https://github.com/dhw1009/JspTeamproject\"><i class=\"fa fa-github\"></i></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t");

									Object id = (String) session.getAttribute("userID");
									if (id != null) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a style=\"color:white;\">");
      out.print(id);
      out.write("님, 환영합니다!</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a class=\"nav-link\" href=\"../login/logoutAction.jsp\">Log Out</a>\r\n");
      out.write("                        \t\t");
}else{ 
      out.write("\r\n");
      out.write("                                    <a href=\"../login/signin.jsp\">Sign Up</a>\r\n");
      out.write("                        \t\t\t<a href=\"../login/login.jsp\">Log In</a>\r\n");
      out.write("                          \t\t");
} 
      out.write("\r\n");
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
      out.write("\t<!-- 게시판 메인 페이지 영역 시작 -->\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<table class=\"table table-striped\" style=\"text-align: center; border: 1px solid #dddddd\">\r\n");
      out.write("\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th style=\"background-color: #eeeeee; text-align: center;\">번호</th>\r\n");
      out.write("\t\t\t\t\t\t<th style=\"background-color: #eeeeee; text-align: center;\">제목</th>\r\n");
      out.write("\t\t\t\t\t\t<th style=\"background-color: #eeeeee; text-align: center;\">작성자</th>\r\n");
      out.write("\t\t\t\t\t\t<th style=\"background-color: #eeeeee; text-align: center;\">작성일</th>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t");

						BbsDAO bbsDAO = new BbsDAO(); // 인스턴스 생성
						ArrayList<Bbs> list = bbsDAO.getList(pageNumber);
						for(int i = 0; i < list.size(); i++){
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print( list.get(i).getBbsID() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t<!-- 게시글 제목을 누르면 해당 글을 볼 수 있도록 링크를 걸어둔다 -->\r\n");
      out.write("\t\t\t\t\t\t<td><a href=\"view.jsp?bbsID=");
      out.print( list.get(i).getBbsID() );
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.print( list.get(i).getBbsTitle() );
      out.write("</a></td>\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print( list.get(i).getUserID() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print( list.get(i).getBbsDate().substring(0, 11) + list.get(i).getBbsDate().substring(11, 13) + "시"
							+ list.get(i).getBbsDate().substring(14, 16) + "분" );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");

						}
					
      out.write("\r\n");
      out.write("\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<!-- 페이징 처리 영역 -->\r\n");
      out.write("\t\t\t");

				if(pageNumber != 1){
			
      out.write("\r\n");
      out.write("\t\t\t\t<a href=\"bbs.jsp?pageNumber=");
      out.print(pageNumber - 1 );
      out.write("\"\r\n");
      out.write("\t\t\t\t\tclass=\"btn btn-success btn-arraw-left\">이전</a>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t<a href=\"bbs.jsp?pageNumber=");
      out.print(pageNumber + 1 );
      out.write("\"\r\n");
      out.write("\t\t\t\t\tclass=\"btn btn-success btn-arraw-left\">다음</a>\r\n");
      out.write("\t\t\t");

				}
			
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<!-- 글쓰기 버튼 생성 -->\r\n");
      out.write("\t\t\t<a href=\"write.jsp\" class=\"btn btn-primary pull-right\">글쓰기</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- 게시판 메인 페이지 영역 끝 -->\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 부트스트랩 참조 영역 -->\r\n");
      out.write("\t<script src=\"https://code.jquery.com/jquery-3.1.1.min.js\"></script>\r\n");
      out.write("\t<script src=\"../js/bootstrap.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
