package com.park.springboot_web_test.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {

	@GetMapping("/")
	public String main() {
		return "member/table";
	}
	
	@GetMapping("/memberForm")
	public String saveForm() {
		return "member/saveForm";
	}
}
