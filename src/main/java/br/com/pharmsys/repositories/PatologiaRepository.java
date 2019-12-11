package br.com.pharmsys.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pharmsys.model.Patologia;

@Repository
@Transactional
public interface PatologiaRepository extends JpaRepository<Patologia, Integer> {
	
	Patologia findByNomePatologia(String nomePatologia);
	
}
