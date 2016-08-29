package com.schram.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClientController {

	@RequestMapping("/clients/new")
	public String view() {
		return "client/ClientRegister";
	}
}