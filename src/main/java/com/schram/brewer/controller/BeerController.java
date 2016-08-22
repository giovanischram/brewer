package com.schram.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BeerController {

	@RequestMapping("/beers/new")
	public String view() {
		return "beer/BeerRegister";
	}
}