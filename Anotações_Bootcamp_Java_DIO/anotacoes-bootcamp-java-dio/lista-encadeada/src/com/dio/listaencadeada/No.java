package com.dio.listaencadeada;

public class No<T> {

	private T conteudo;
	private No proximoNo;

	public No() { // constructor
		this.proximoNo = null;
	}

	public No(T conteudo) { // constructor
		this.proximoNo = null;
		this.conteudo = conteudo;
	}

	public No(T conteudo, No proximoNo) { // constructor
		this.conteudo = conteudo;
		this.proximoNo = proximoNo;
	}

	public T getConteudo() { // getter
		return conteudo;
	}

	public void setConteudo(T conteudo) { // setter
		this.conteudo = conteudo;
	}

	public No getProximoNo() { // getter
		return proximoNo;
	}

	public void setProximoNo(No proximoNo) { // setter
		this.proximoNo = proximoNo;
	}

	@Override // method to String
	public String toString() {
		return "No [conteudo=" + conteudo + "]";
	}

	public String toStringEncadeado() { // to String personalized
		String str = "No [conteudo=" + conteudo + "]";

		if (proximoNo != null) {
			str += "-> " + proximoNo.toStringEncadeado();
		} else {
			str += "-> null ";
		}
		return str;
	}
}
