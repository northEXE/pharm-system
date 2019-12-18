package br.com.pharmsys.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pharmsys.model.SistemaFisiologico;
import br.com.pharmsys.repositories.SistemaFisiologioRepository;

@Service
public class SistemaFisiologicoService {
	
	@Autowired
	SistemaFisiologioRepository sistemaFisiologicoRepo;
	
	public SistemaFisiologico cadastrarSistema(String nomeSistema) {
		
		SistemaFisiologico sisFisiologico = new SistemaFisiologico();
		sisFisiologico.setNomeSistema(nomeSistema);
		sistemaFisiologicoRepo.save(sisFisiologico);
		
		return sisFisiologico;
	}
}
