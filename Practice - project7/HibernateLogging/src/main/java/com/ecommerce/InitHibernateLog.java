package com.ecommerce;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Servlet implementation class InitHibernateLog
 */
public class InitHibernateLog extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InitHibernateLog() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            // TODO Auto-generated method stub
             try {
                     PrintWriter out = response.getWriter();
                     out.println("<html><body>");

                     SessionFactory factory = HibernateUtil.getSessionFactory();
                            
                     Session session = factory.openSession();
                     out.println("Hibernate Session opened.<br>");
                     session.close();
                     out.println("Hibernate Session closed.<br>");
                            
                     out.println("</body></html>");
                        
                         
                     } catch (Exception ex) {
                            
                     }

    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            // TODO Auto-generated method stub
            doGet(request, response);
    }
		
  }

