package org.zerock.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sboard")
public class sboardController {
	
	
	
	@GetMapping("/list")
	public void list(){
		
	}
	
	@GetMapping("/register")
	public void register(){
		
	}
}
