package xyz.devyu.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {

	/**
	 * @작성자 : 장민규(devyu)
	 * @메서드설명 : 로그인 form 페이지
	 * @매핑_메서드 : GET
	 * @접속_허용_권한 : isAnonymous();
    */
	@GetMapping("/login")
	public String loginForm() {
		return "login";
	}
	
	/**
	 * @작성자 : 장민규(devyu)
	 * @메서드설명 : 로그인 인증 성공 후 반환 되는 페이지
	 * @매핑_메서드 : GET
	 * @접속_허용_권한 : isAuthenticated();
    */
	@GetMapping("/loginSuccess")
	public String loginSuccess() {
		return "loginSuccess";
	}
	
	/**
	 * @작성자 : 장민규(devyu)
	 * @메서드_설명 : 관리자(admin)만 접속이 가능한 페이지
	 * @매핑_메서드 : GET
	 * @접속_허용_권한 : ROLE_ADMIN
    */
	@GetMapping("/admin")
	public String admin() {
		return "admin/admin";
	}
	
	/**
	 * @작성자 : 장민규(devyu)
	 * @메서드설명 : 유저(user)와 괸리자(admin)이 접속이 가능한 페이지
	 * @매핑_메서드 : GET
	 * @접속_허용_권한 : ROLE_ADMIN, ROLE_USER
    */
	@GetMapping("/user")
	public String user() {
		return "user/user";
	}
	
	/**
	 * @작성자 : 장민규(devyu)
	 * @메서드설명 : 게스트(guest)와 괸리자(admin)이 접속이 가능한 페이지
	 * @매핑_메서드 : GET
	 * @접속_허용_권한 : ROLE_ADMIN, ROLE_GUEST
    */
	@GetMapping("/guest")
	public String guest() {
		return "guest/guest";
	}
}
