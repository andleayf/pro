/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2019-07-04 03:34:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.after;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>示例登陆页</title>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/before/js/jquery-3.1.0.min.js\"></script>\r\n");
      out.write("    <style>\r\n");
      out.write("        #win10-login {\r\n");
      out.write("            background: url(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/before/images/login.jpg\") no-repeat fixed;\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            height: 100%;\r\n");
      out.write("            background-size: 100% 100%;\r\n");
      out.write("            position: fixed;\r\n");
      out.write("            z-index: -1;\r\n");
      out.write("            top: 0;\r\n");
      out.write("            left: 0;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #win10-login-box {\r\n");
      out.write("            width: 300px;\r\n");
      out.write("            overflow: hidden;\r\n");
      out.write("            margin: 0 auto;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .win10-login-box-square {\r\n");
      out.write("            width: 105px;\r\n");
      out.write("            margin: 0 auto;\r\n");
      out.write("            border-radius: 50%;\r\n");
      out.write("            background-color: darkgray;\r\n");
      out.write("            position: relative;\r\n");
      out.write("            overflow: hidden;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .win10-login-box-square::after {\r\n");
      out.write("            content: \"\";\r\n");
      out.write("            display: block;\r\n");
      out.write("            padding-bottom: 100%;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .win10-login-box-square .content {\r\n");
      out.write("            position: absolute;\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            height: 100%;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        input {\r\n");
      out.write("            width: 90%;\r\n");
      out.write("            display: block;\r\n");
      out.write("            border: 0;\r\n");
      out.write("            margin: 0 auto;\r\n");
      out.write("            line-height: 36px;\r\n");
      out.write("            font-size: 20px;\r\n");
      out.write("            padding: 0 1em;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("            margin-bottom: 11px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .login-username, .login-password {\r\n");
      out.write("            width: 91%;\r\n");
      out.write("            font-size: 13px;\r\n");
      out.write("            color: #999;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .login-password {\r\n");
      out.write("            width: calc(91% - 54px);\r\n");
      out.write("            -webkit-border-radius: 2px 0 0 2px;\r\n");
      out.write("            -moz-border-radius: 2px 0 0 2px;\r\n");
      out.write("            border-radius: 5px 0 0 5px;\r\n");
      out.write("            margin: 0px;\r\n");
      out.write("            float: left;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .login-submit {\r\n");
      out.write("            margin: 0px;\r\n");
      out.write("            float: left;\r\n");
      out.write("            -webkit-border-radius: 0 5px 5px 0;\r\n");
      out.write("            -moz-border-radius: 0 5px 5px 0;\r\n");
      out.write("            border-radius: 0 5px 5px 0;\r\n");
      out.write("            background-color: #009688;\r\n");
      out.write("            width: 54px;\r\n");
      out.write("            display: inline-block;\r\n");
      out.write("            height: 36px;\r\n");
      out.write("            line-height: 36px;\r\n");
      out.write("            padding: 0 auto;\r\n");
      out.write("            color: #fff;\r\n");
      out.write("            white-space: nowrap;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            font-size: 14px;\r\n");
      out.write("            border: none;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            opacity: .9;\r\n");
      out.write("            filter: alpha(opacity=90);\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("    <script>\r\n");
      out.write("        function validateLogin(){\r\n");
      out.write("            var data = $(\"form\").serialize();//表单序列化\r\n");
      out.write("            $.post(\r\n");
      out.write("                \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/login/login\",data,function (data) {\r\n");
      out.write("                    if(data =='success'){\r\n");
      out.write("                        alert(\"登录成功\");\r\n");
      out.write("                        location.href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/project/list\";\r\n");
      out.write("                    }else{\r\n");
      out.write("                        alert(\"用户名密码错误\");\r\n");
      out.write("                        $(\"#msg\").text(\"用户名密码错误，请检查后输入\");\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            );\r\n");
      out.write("            return false;\r\n");
      out.write("        };\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"win10-login\">\r\n");
      out.write("    <div style=\"height: 10%;min-height: 120px\"></div>\r\n");
      out.write("    <div id=\"win10-login-box\">\r\n");
      out.write("        <div class=\"win10-login-box-square\">\r\n");
      out.write("            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/before/images/avatar.jpg\" class=\"content\"/>\r\n");
      out.write("        </div>\r\n");
      out.write("        <p style=\"font-size: 24px;color: white;text-align: center\">內部人員</p>\r\n");
      out.write("        <form id=\"form\" target=\"_self\" method=\"post\" action=\"#\">\r\n");
      out.write("            <!--用户名-->\r\n");
      out.write("            <input type=\"text\" placeholder=\"请输入登录名\" class=\"login-username\"name=\"adminName\">\r\n");
      out.write("            <!--密码-->\r\n");
      out.write("            <input type=\"password\" placeholder=\"请输入密码\" class=\"login-password\"name=\"adminPassword\">\r\n");
      out.write("            <!--登陆按钮-->\r\n");
      out.write("            <input type=\"submit\"  value=\"登录\" id=\"loginbtn\" class=\"login-submit\" onclick=\"return validateLogin()\"/>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
