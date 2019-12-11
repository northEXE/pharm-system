package br.com.pharmsys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping(path = "/")
	public String index() {
		return "index";
	}
}
