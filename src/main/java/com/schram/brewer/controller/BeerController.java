package com.schram.brewer.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.schram.brewer.model.Beer;

@Controller
public class BeerController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(BeerController.class);

	@RequestMapping("/beers/new")
	public String view(Beer beer) {
		return "beer/BeerRegister";
	}

	@RequestMapping(value = "/beers/new", method = RequestMethod.POST)
	public String save(@Valid Beer beer, BindingResult result, Model model, RedirectAttributes attributes) {
		LOGGER.info(">>>>>>>> Saving new beer...");
		if (result.hasErrors()) {
			return view(beer);
		}
		
		attributes.addFlashAttribute("message", "Cerveja cadastrada com sucesso!");
		LOGGER.info(">>>>>>>> SKU: " + beer.getSku());
		LOGGER.info(">>>>>>>> Name: " + beer.getName());
		LOGGER.info(">>>>>>>> Description: " + beer.getDescription());
		return "redirect:/beers/new";
	}
}