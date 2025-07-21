package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@GetMapping({"/index","/","/home"})
	public String index(Model model) {
		return "index";
	}
	@GetMapping({"/catalogo", "/catalog"})
	public String Catalogo(Model model) {
		return "catalogo";
	}
	@GetMapping({"/about"})
	public String About(Model model) {
		return "about";
	}
	@GetMapping({"/Bot", "/bot"})
	public String Bot(Model model) {
		return "index";
	}

}
