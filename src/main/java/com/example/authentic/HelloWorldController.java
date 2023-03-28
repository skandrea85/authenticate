package com.example.authentic;

import javax.security.auth.message.callback.SecretKeyCallback.Request;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	

	
	@RequestMapping({ "/hello" })
	public String firstPage(@RequestHeader HttpHeaders headers) {
		
		return "Hello World"+headers.getDate();
	}
	
	

}
