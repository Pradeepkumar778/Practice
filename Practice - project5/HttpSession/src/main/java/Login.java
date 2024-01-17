

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Login() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String users[][] = {{"pradeep", "123456"},{"kalyan", "123456"}, {"sai", "123456"}}; 
		
		String uname = request.getParameter("txtUser");
		String pwd = request.getParameter("txtPass");
		boolean b = false;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				if(uname.equals(users[i][0])  &&  pwd.equals(users[i][1]))
				{
					HttpSession  session = request.getSession();
					session.setAttribute("user", uname);
					session.setMaxInactiveInterval(60000);
					response.sendRedirect("Welcome");
					
					b=true;
					break;
					
				}
			}
		}
		
		if(b==false)
			response.sendRedirect("ErrorPage.html");
				
	}


}