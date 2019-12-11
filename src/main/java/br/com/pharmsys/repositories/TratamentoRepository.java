package br.com.pharmsys.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pharmsys.model.Tratamento;

@Repository
@Transactional
public interface TratamentoRepository extends JpaRepository<Tratamento, Integer>{
	
	Tratamento findByNomeTratamento(String nomeTratamento);
	
}
