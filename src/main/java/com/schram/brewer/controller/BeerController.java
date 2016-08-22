package com.schram.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.schram.brewer.model.Beer;

@Controller
public class BeerController {

	@RequestMapping("/beers/new")
	public String view() {
		return "beer/BeerRegister";
	}

	@RequestMapping(value = "/beers/new", method = RequestMethod.POST)
	public String save(Beer beer) {
		System.out.println(">>>>>>>> Saving new beer...");
		System.out.println(">>>>>>>> SKU: " + beer.getSku());
		System.out.println(">>>>>>>> Name: " + beer.getName());
		return "beer/BeerRegister";
	}
}