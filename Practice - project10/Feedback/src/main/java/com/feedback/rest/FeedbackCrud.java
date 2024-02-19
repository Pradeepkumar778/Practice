package com.feedback.rest;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackCrud extends JpaRepository<Feedback ,Integer > {

}
