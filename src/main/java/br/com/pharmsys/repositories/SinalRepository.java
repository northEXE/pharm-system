package br.com.pharmsys.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pharmsys.model.Sinal;

@Repository
@Transactional
public interface SinalRepository extends JpaRepository<Sinal, Integer>{
	
	Sinal findByNomeSinal(String nomeSinal);
	
}
