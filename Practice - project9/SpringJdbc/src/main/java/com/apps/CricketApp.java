package com.apps;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Cricket;
import com.service.CricketService;

public class CricketApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext fact = new ClassPathXmlApplicationContext("dbconfig.xml");
		CricketService cs = (CricketService)fact.getBean("dbConObj");
		
		Scanner sc = new Scanner(System.in);
		Cricket crk = new Cricket();
		
		System.out.println("Cricketer Name ");
		crk.setCrname(sc.next());
		
		System.out.println("Game Type(Test/Oneday/T20)");
		crk.setGametype(sc.next());
		
		System.out.println("No of Runs ");
		crk.setRuns(sc.nextInt());
		
		String r = cs.AddCricket(crk);
		
		if(r.equals("Success"))
			System.out.println("Cricketer is added...");
		else
			System.out.println("Error");
	}
		
	}


