package com.agenda.agenda.models;

import java.util.ArrayList;

public class ListaCadastro{

	private Cadastro cadastro[];
	private ArrayList<Cadastro> lista = new ArrayList<Cadastro>();
	
	public Cadastro[] getCadastro() {
		return cadastro;
	}
	public void setCadastro(Cadastro[] cadastro) {
		this.cadastro = cadastro;
	}
	public ArrayList<Cadastro> getLista() {
		return lista;
	}
	public void setLista(ArrayList<Cadastro> lista) {
		this.lista = lista;
	}
	public void addCadastro(Cadastro cadastro) {
		lista.add(cadastro);
	}
	
	
}
