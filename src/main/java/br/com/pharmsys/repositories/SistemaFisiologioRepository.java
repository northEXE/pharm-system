package br.com.pharmsys.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pharmsys.model.SistemaFisiologico;

@Repository
@Transactional
public interface SistemaFisiologioRepository extends JpaRepository<SistemaFisiologico, Integer> {

	SistemaFisiologico findByNomeSistema(String nomeSistema);

}
