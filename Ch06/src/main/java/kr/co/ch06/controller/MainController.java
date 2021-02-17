package kr.co.ch06.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping(value = {"/", "/index"})
	public String index() {
		return "index";
	}
	
	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}

	@RequestMapping("/greeting")
	public String greeting() {
		return "greeting";
	}
	
	/* spring 4.3.x �������� RequestMapping���� GetMapping���� ���� */
	@RequestMapping("/welcome")
	public String welcome() {
		return "welcome";
	}
}
