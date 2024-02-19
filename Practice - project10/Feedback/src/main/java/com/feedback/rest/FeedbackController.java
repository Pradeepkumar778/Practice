package com.feedback.rest;

import java.io.IOException;

import java.io.PrintWriter;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@RestController
public class FeedbackController {
	 private final FeedbackCrud dao;

	    @Autowired
	    public FeedbackController(FeedbackCrud dao) {
	        this.dao = dao;
	    } 
	    
	    @PostMapping
	    @RequestMapping("/")
	    public void home(HttpServletRequest request,HttpServletResponse response) throws IOException {
	    	PrintWriter out=response.getWriter();
	    	out.print("<!DOCTYPE html>\r\n"
	    			+ "<html>\r\n"
	    			+ "<head>\r\n"
	    			+ "<meta charset=\"ISO-8859-1\">\r\n"
	    			+ "<title>Insert title here</title>\r\n"
	    			+ "</head>\r\n"
	    			+ "<body align='center'>\r\n<h1>Enter Your Feedback</h1>"
	    			+ "	<form action=\"addFeedback\" method='post'>\r\n"
	    			+ "		Enter your name : <input type=\"text\" name=\"name\" required><br><br>\r\n"
	    			+ "		Enter feedback : <textarea name=\"feedback\" rows=\"10\" cols=\"50\" required></textarea><br><br>\r\n"
	    			+ "		<input type=\"submit\" name=\"enter\" value=\"submit feedback\">\r\n"
	    			+ "	</form> \r\n"
	    			+ "	\r\n"
	    			+ "</body>\r\n"
	    			+ "</html>");
	    }
	    
	    
	    @PostMapping
	    @RequestMapping("/addFeedback")
	    public void addFeedback(HttpServletRequest request,HttpServletResponse response) throws IOException {
	    	Feedback f=new Feedback(request.getParameter("name"),request.getParameter("feedback"));
	        dao.save(f);
	        PrintWriter out=response.getWriter();
	        out.print("<h1 align=\"center\" style=\"color:blue\">Thank you for your feedback!</h1>");
	    }
}
