package com.Servlet;

import java.io.IOException;

import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductDetails
 */
public class ProductDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ProductDetails() {
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
               
              InputStream in = getServletContext().getResourceAsStream("/WEB-INF/config.properties");
              Properties props = new Properties();
              props.load(in);
              
              
              DBConnection conn = new DBConnection(props.getProperty("url"), props.getProperty("userid"), props.getProperty("password"));
              Statement stmt = conn.getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
              stmt.executeUpdate("insert into eproduct (name, price, date_added) values ('MAC', 17800.00, now())");
              out.println("Executed an insert operation<br>");
              
              stmt.executeUpdate("update eproduct set price=20000 where name = 'MAC'");
              out.println("Executed an update operation<br>");
              
              stmt.executeUpdate("delete from eproduct where name = 'New Product'");
              out.println("Executed a delete operation<br>");
              
              stmt.close();
              conn.closeConnection();
              
              
              out.println("</body></html>");
              conn.closeConnection();
              
      } catch (ClassNotFoundException e) {
              e.printStackTrace();
      } catch (SQLException e) {
          e.printStackTrace();
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
