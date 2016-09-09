package com.schram.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CityController {

	@RequestMapping("/cities/new")
	public String view() {
		return "city/CityRegister";
	}
}