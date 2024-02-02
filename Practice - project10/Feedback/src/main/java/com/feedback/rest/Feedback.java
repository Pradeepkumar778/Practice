package com.feedback.rest;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Feedback {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	String name;
	String feed_back;
	
	
	public Feedback(String name, String feed_back) {
		this.name = name;
		this.feed_back = feed_back;
	}
	

	@Override
	public String toString() {
		return "Feedback [id=" + id + ", name=" + name + ", feed_back=" + feed_back + "]";
	}
}
