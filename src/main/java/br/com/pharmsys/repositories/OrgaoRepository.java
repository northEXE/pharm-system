package br.com.pharmsys.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pharmsys.model.Orgao;

@Repository
@Transactional
public interface OrgaoRepository extends JpaRepository<Orgao, Integer> {
	
	Orgao findByNomeOrgao(String nomeOrgao);
}
