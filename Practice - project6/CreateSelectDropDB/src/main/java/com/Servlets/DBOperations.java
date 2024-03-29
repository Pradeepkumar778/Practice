package com.Servlets;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ecommerce.DBConnection;

/**
 * Servlet implementation class DBOperations
 */
public class DBOperations extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public DBOperations() {
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
             Statement stmt = conn.getConnection().createStatement();
             stmt.executeUpdate("create database db2");
             out.println("Created database: db2 <br>");
             stmt.executeUpdate("use db2");
             out.println("Selected database: db2 <br>");
             stmt.executeUpdate("drop database db2");
             stmt.close();
             out.println("Dropped database: db2 <br>");
             
             
             
             
             
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
