package com.agenda.agenda.resources;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.agenda.agenda.repository.CadastroRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import com.agenda.agenda.models.Cadastro;

@RestController
@RequestMapping(value="/api")
@Api(value ="Api Rest Agenda")
@CrossOrigin(origins="*")
public class CadastroResources {
	
	@Autowired
	CadastroRepository cadastroRepository;
	
	@GetMapping("/1retornaTodos")
	@ApiOperation(value="retorna lista de cadastros")
	public List<Cadastro> listaCadastros(){
		return cadastroRepository.findAll();	
	}
	
	
	@PostMapping("/2cadastraPost")
	@ApiOperation(value="salva um cadastro na agenda")
	public Cadastro salvaCadastro(@RequestBody Cadastro cadastro) {
		return cadastroRepository.save(cadastro);
	}
	

	@GetMapping("/3retornaId/{id}")
	@ApiOperation(value="retorna cadastro unico")
	public Cadastro listaCadastroUnico(@PathVariable(value="id") long id){
		return cadastroRepository.findById(id);	
	}
	
	@GetMapping("/4retornaNome/{nome}")
	@ApiOperation(value="retorna cadastro(s) buscando pelo nome")
	public List<Cadastro> listaCadastroNome(@PathVariable(value="nome") String nome){
		return cadastroRepository.findByNome(nome);	
	}
	
	@GetMapping("/5retornaLetra/{letra}")
	@ApiOperation(value="retorna cadastro(s) buscando pela letra inicial do nome")
	public List<Cadastro> listaCadastroLetra(@PathVariable(value="letra") String letra){
		return cadastroRepository.findByNomeStartsWith(letra.toLowerCase());	
	}
	
	@GetMapping("/6retornaMes/{mes}")
	@ApiOperation(value="retorna cadastro(s) buscando pelo mes")
	public List<Cadastro> listaCadastroMes(@PathVariable(value="mes") int mes){
		return cadastroRepository.findByMes(mes);	
	}
	@GetMapping("/7retornaMesDia1/{mes}/{dia}")
	@ApiOperation(value="retorna cadastro(s) buscando pelo data mes/dia")
	public List<Cadastro> listaCadastroData (@PathVariable(value="dia") int dia ,@PathVariable(value="mes") int mes){
		return cadastroRepository.findByDiaAndMes(dia, mes);	
	}	
	
	@PutMapping("/8atualizaCadastro")
	@ApiOperation(value="atualiza um cadastro")
	public Cadastro atualizaCadastro(@RequestBody Cadastro cadastro) {
		return cadastroRepository.save(cadastro);
	}
	
	@PutMapping("/88atualizaCadastro/{id}")
	@ApiOperation(value="deleta cadastro unico")
	public Cadastro atualizaCadastroId(@PathVariable(value="id") long id,Cadastro cadastro) {
		return cadastroRepository.save(cadastro);
	
	}
	
	@DeleteMapping("/9deletaCadastrojson")
	@ApiOperation(value="deleta um cadastro")
	public void deletaCadastro(@RequestBody Cadastro cadastro) {
		cadastroRepository.delete(cadastro);
	}
	
	@DeleteMapping("/9deletaId/{id}")
	@ApiOperation(value="deleta cadastro unico")
	public Cadastro deletaCadastroUnico(@PathVariable(value="id") long id){
	      cadastroRepository.deleteById(id);
		return null;	
	}

	
	
	
}