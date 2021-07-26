package com.dailycodebuffer.springmailClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import javax.mail.MessagingException;

@SpringBootApplication
public class SpringEmailSenderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEmailSenderApplication.class, args);
	}
	
	@Autowired
	private EmailSenderService service;

	

	@EventListener(ApplicationReadyEvent.class)
	public void triggerMail() throws MessagingException {

		service.sendEmailWithAttachment("saikrishna1731@gmail.com",
				"This is Email Body with Attachment...",
				"This email has attachment",
				"F:\\shabb\\Pictures\\c.pdf");

	}
	
	
	
	
//	@EventListener(ApplicationReadyEvent.class)
//	public void triggerMail() throws MessagingException {
//
//		service.sendSimpleEmail("saikrishna1731@gmail.com",
//				"This is Email Body with Attachment...",
//				"This email has attachment");
//
//	}

}
