package com.moohee.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {
	
	@RequestMapping(value = "/")
	public String index() {
		return "index";
	}
	

}
