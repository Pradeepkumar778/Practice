

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ProfileServlet
 */
public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProfileServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
	    request.getRequestDispatcher("index.html").include(request,response);
		 
	    HttpSession session=request.getSession(false);
	    
	    if(session!=null) {
	    	String name=(String)session.getAttribute("name");
	    	out.print("Hello,"+name+"Welcome to Profile");
	    }
	    else {
	    	out.print("please login first");
	    	request.getRequestDispatcher("login.html").include(request, response);
	    }
		out.close();
	}

}
