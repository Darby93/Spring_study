package com.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CookieController {
	
	//필요하다면
	//함수를 만들 때  요청객체가 필요하다면 사용하면된다
	//handleRequest(HttpServletRequest req, HttpServletResponse res)
	
	@RequestMapping("/cookie/make.do")
	public String make(HttpServletRequest req, HttpServletResponse res) {
		res.addCookie(new Cookie("auth","1004"));
		
		
		return "cookie/CookieMake";
	}
	
	@RequestMapping("/cookie/view.do") //request 기존 방식 사용해도되고 
									   // annotation 사용해도됨
	public String view(@CookieValue(value="auth", defaultValue="0") String auth) {
		
		System.out.println("클라이언트에서 read 한 쿠키 값 : " + auth);
		
		
		return "cookie/CookieView";
	}
	
}
