package com.dio.listadupencadeada;

public class NoDuplo<T> {

	private T conteudo; 				//conteúdo do nó/objeto
	private NoDuplo<T> noProximo;   	//ref do próx. nó/obj
	private NoDuplo<T> noPrevio;    	//ref do nó/obj anterior
	
	
	
	public NoDuplo(T conteudo) {    	//constructor do conteúdo do nó/obj
		this.conteudo = conteudo;
	}

	
	//getters and setters
	
	public T getConteudo() {
		return conteudo;
	}

	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}

	public NoDuplo<T> getNoProximo() {
		return noProximo;
	}

	public void setNoProximo(NoDuplo<T> noProximo) {
		this.noProximo = noProximo;
	}

	public NoDuplo<T> getNoPrevio() {
		return noPrevio;
	}

	public void setNoPrevio(NoDuplo<T> noPrevio) {
		this.noPrevio = noPrevio;
	}


	//method to String do conteúdo do nó/obj
	
	@Override
	public String toString() {
		return "NoDuplo [conteudo=" + conteudo + "]";
	}
	
	
	
	
	
}
