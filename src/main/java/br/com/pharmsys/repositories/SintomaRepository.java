package br.com.pharmsys.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pharmsys.model.Sintoma;

@Repository
@Transactional
public interface SintomaRepository extends JpaRepository<Sintoma, Integer>{
	
	Sintoma findByNomeSintoma(String nomeSintoma);
	
}
