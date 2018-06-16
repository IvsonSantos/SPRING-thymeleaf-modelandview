package com.ivson.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ivson.spring.repository.GuestRepository;

@Controller
public class GuestController {

	@Autowired
	GuestRepository guestRepository;
	
	/**
	 * podemos retornar um objeto do tipo ModelAndView, que nos permite, além de
	 * informar o nome da view, adicionar objetos para serem usados no HTML.
	 * 
	 * @return
	 */
	@GetMapping("/guest")
	public ModelAndView listAll() {
		ModelAndView modelAndView = new ModelAndView("GuestList");
		modelAndView.addObject("guests", guestRepository.findAll());
		return modelAndView;
	}

}
