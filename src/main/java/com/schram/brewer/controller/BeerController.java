package com.schram.brewer.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.schram.brewer.model.Beer;
import com.schram.brewer.model.Flavor;
import com.schram.brewer.model.Origin;
import com.schram.brewer.repository.Styles;

@Controller
public class BeerController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(BeerController.class);

	@Autowired private Styles styles;
	
	@RequestMapping("/beers/new")
	public ModelAndView view(Beer beer) {
		ModelAndView mv = new ModelAndView("beer/BeerRegister");
		mv.addObject("flavors", Flavor.values());
		mv.addObject("styles", styles.findAll());
		mv.addObject("origins", Origin.values());
		return mv;
	}

	@RequestMapping(value = "/beers/new", method = RequestMethod.POST)
	public ModelAndView save(@Valid Beer beer, BindingResult result, Model model, RedirectAttributes attributes) {
		LOGGER.info(">>>>>>>> Saving new beer...");
		if (result.hasErrors()) {
			return view(beer);
		}
		
		attributes.addFlashAttribute("message", "Cerveja cadastrada com sucesso!");
		LOGGER.info(">>>>>>>> SKU: " + beer.getSku());
		LOGGER.info(">>>>>>>> Name: " + beer.getName());
		LOGGER.info(">>>>>>>> Description: " + beer.getDescription());
		LOGGER.info(">>>>>>>> Style: " + beer.getStyle());
		return new ModelAndView("redirect:/beers/new");
	}
}