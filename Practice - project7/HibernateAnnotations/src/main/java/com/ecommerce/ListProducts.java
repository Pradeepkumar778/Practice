package com.ecommerce;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Servlet implementation class ListProducts
 */
public class ListProducts extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ListProducts() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  try {
              SessionFactory factory = HibernateUtil.getSessionFactory();
              
              Session session = factory.openSession();
              // using HQL
              List<Product> list = session.createQuery("from Product").list();
              
              session.close();
              
               PrintWriter out = response.getWriter();
               out.println("<html><body>");
               out.println("<b>Product Listing</b><br>");
               for(Product p: list) {
                      out.println("ID: "+ Integer.valueOf(p.getId()) + ", Name : "+String.valueOf(p.getName()) +", Product Type: " + String.valueOf(p.getType()) +", Price: " + Double.valueOf(p.getPrice()) + "<br>");
               }
               
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
