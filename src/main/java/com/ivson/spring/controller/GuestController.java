package com.ivson.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GuestController {

	@GetMapping("/guest")
	public String getAll() {
		return "ListaConvidados";
	}

}
