package br.com.pharmsys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.pharmsys.services.SistemaFisiologicoService;

@Controller
@RequestMapping(path = "/sistemas/")
public class SistemaFisiologicoController {
	
	@Autowired
	SistemaFisiologicoService service;
	
	@RequestMapping(path = "/cadSistemaF")
	public String index() {
		return "cadSistemaF";
	}
	
	@RequestMapping(path = "/cadastrar", method = RequestMethod.POST)
	public String cadastrarSistema(@RequestParam String nomeSistema) {
		service.cadastrarSistema(nomeSistema);
		
		return "redirect:/";
	}
}
