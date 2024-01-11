

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  response.setContentType("text/html");
	  PrintWriter out = response.getWriter();
	  request.getRequestDispatcher("index.html").include(request,response);
	  
	  String name=request.getParameter("name");
	  String password=request.getParameter("password");
	  
	  if(password.equals("admin123")) {
		  out.print("welcome,"+name);
		  HttpSession session=request.getSession();
		  session.setAttribute("name",name);
	  }
	  else {
		  out.print("check username/password");
		  request.getRequestDispatcher("Login.html").include(request, response);
		  
	  }
	  out.close();
	}

}
