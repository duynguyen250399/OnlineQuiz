package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import quiz.Quiz;
import quiz.Quiz;
import quiz.QuizDAO;

public final class listOfTakingQuiz_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Make Quiz</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navbar.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <a href=\"newQuiz.jsp\" class=\"btn btn-success mt-5 mb-3\">Create new Quiz</a>\n");
      out.write("            ");

                QuizDAO dao = new QuizDAO();
                List<Quiz> listOfQuiz = dao.getAllQuiz();
                if (listOfQuiz != null && !listOfQuiz.isEmpty()) {
            
      out.write("\n");
      out.write("            <table class=\"table table-striped\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>                        \n");
      out.write("                        <th scope=\"col\">Title</th>\n");
      out.write("                        <th scope=\"col\">Questions</th>                       \n");
      out.write("                        <th scope=\"col\">Taken Time</th>                                                         \n");
      out.write("                        <th scope=\"col\">Actions</th>                 \n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");

                        for (Quiz quiz : listOfQuiz) {
                            int numOfQuestions = dao.getNumOfQuestions(quiz.getId());
                    
      out.write("\n");
      out.write("                    <tr>                \n");
      out.write("                        <td>");
      out.print( quiz.getTitle());
      out.write("</td>                       \n");
      out.write("                        <td>");
      out.print( numOfQuestions );
      out.write("</td>\n");
      out.write("                        <td class=\"font-weight-bold text-warning\">");
      out.print( quiz.getTaken_time() );
      out.write("</td>                       \n");
      out.write("                        <td>\n");
      out.write("                            <a href=\"addQuestion?id=");
      out.print( quiz.getId() );
      out.write("\" class=\"mr-3 btn btn-success\">Start Quiz</a>                                             \n");
      out.write("                        </td>\n");
      out.write("                    </tr> \n");
      out.write("                    ");

                        }
                    
      out.write("             \n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("            ");

            } else {
            
      out.write("\n");
      out.write("            <p class=\"text-danger\">There's no any available Quiz!</p>\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
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
