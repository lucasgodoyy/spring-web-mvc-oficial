package br.com.lucasdeveloper.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.lucasdeveloper.springboot.model.Pessoa;


@Repository
@Transactional
public interface PessoaRepository extends CrudRepository<Pessoa, Long>{

	
	
}
