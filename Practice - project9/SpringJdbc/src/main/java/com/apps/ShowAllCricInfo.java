package com.apps;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Cricket;
import com.service.CricketService;

public class ShowAllCricInfo {

	public static void main(String[] args) {
    
		ApplicationContext fact = new ClassPathXmlApplicationContext("dbconfig.xml");
		

		CricketService cs = (CricketService)fact.getBean("dbConObj");
		
		List<Cricket> crklist = cs.ShowAll();
		
		for(Cricket c : crklist)
			System.out.println(c.getCrno() + "\t" + c.getCrname() + "\t" + c.getGametype() + "\t" + c.getRuns());
		
	   }
	}


