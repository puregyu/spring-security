package xyz.devyu.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {

	// 로그인 form 페이지
	@GetMapping("/login")
	public String loginForm() {
		return "login";
	}
	
	// 로그인 성공 페이지
	@GetMapping("/loginSuccess")
	public String loginSuccess() {
		return "loginSuccess";
	}
	
	// admin 페이지
	@GetMapping("/admin")
	public String admin() {
		return "admin";
	}
	
	// user 페이지
	@GetMapping("/user")
	public String user() {
		return "user";
	}
}
