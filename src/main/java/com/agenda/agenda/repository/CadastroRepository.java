package com.agenda.agenda.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.agenda.agenda.models.Cadastro;

public interface CadastroRepository extends JpaRepository< Cadastro, Long>{
	

	List<Cadastro> findByMes(int mes);
	List<Cadastro> findByNome(String nome);
	Cadastro findById(long id);
	List<Cadastro> findByOrderByMesAsc();
	List<Cadastro> findByOrderByNomeAsc();
	List<Cadastro> findAllByOrderByMesAsc();
	List<Cadastro> findByDiaAndMes(int dia, int mes);
	List<Cadastro> findByNomeStartsWith(String nome);
	List<Cadastro> findByNomeLike(String nome);
	
	
   }
	

