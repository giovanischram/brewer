package com.schram.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StyleController {

	@RequestMapping("/styles/new")
	public String view() {
		return "style/StyleRegister";
	}
}