package br.com.pharmsys.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pharmsys.model.Medicamento;

@Repository
@Transactional
public interface MedicamentoRepository extends JpaRepository<Medicamento, Integer>{
	
	Medicamento findByNomeMedicamento(String nomeMedicamento);
}
