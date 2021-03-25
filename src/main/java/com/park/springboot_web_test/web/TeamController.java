package com.park.springboot_web_test.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TeamController {

	@GetMapping("/teamForm")
	public String teamForm() {
		return "team/saveForm";
	}
}
