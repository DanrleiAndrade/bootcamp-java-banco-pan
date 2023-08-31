package com.dio.listadupencadeada;

public class ListaDuplamenteEncadeada<T> {
	
	//por ser uma lista duplamente encadeada, tem duas referências de entrada	
	private NoDuplo<T> primeiroNo;
	private NoDuplo<T> ultimoNo;
	
	private int tamanhoLista;				//para saber o tamanho da lista
	
	public ListaDuplamenteEncadeada() {  	//constructor
		primeiroNo = null;
		ultimoNo = null;
		this.tamanhoLista = 0;
	}
	
		
	
	//methods
	
	public T get(int index) {				//get
		return this.getNo(index).getConteudo();
	}
	
	
	public void add(T elemento) {			//add - pega um conteúdo/elemento e add ao fim da lista
		NoDuplo<T> novoNo = new NoDuplo<>(elemento);    //conteúdo novoNo
		novoNo.setNoProximo(null);						//como ele add o último conteúdo, esse conteúdo não aponta para ninguém
		novoNo.setNoPrevio(ultimoNo);					//o conteúdo add aponta para o nó anteior, que era o último nó
		if (primeiroNo == null) { 						//teste para saber se o primeiro nó era nulo. Se for, diz que o primeiroNo = novoNo
			primeiroNo = novoNo;
		}
		if (ultimoNo != null) {							//se ´ultimo nó for diferente de nulo, diz que o próximo nó = novoNo;
			ultimoNo.setNoProximo(novoNo);
		}
		ultimoNo = novoNo;
		tamanhoLista++;									//aumenta em +1 o tamanho da lista, por conta do novo conteúdo/elemento/nó
	}
	
	public void add(int index, T elemento) { 			//add(index)
		NoDuplo<T> noAuxiliar = getNo(index);
		NoDuplo<T> novoNo = new NoDuplo<>(elemento);
		novoNo.setNoProximo(noAuxiliar);
		
		if(novoNo.getNoProximo() != null) {
			novoNo.setNoPrevio(noAuxiliar.getNoPrevio());
			novoNo.getNoProximo().setNoPrevio(novoNo);
		}else {
			novoNo.setNoPrevio(ultimoNo);
			ultimoNo = novoNo;
		}
		if (index == 0) {
			primeiroNo = novoNo;
		}else {
			novoNo.getNoPrevio().setNoProximo(novoNo);
		}
		tamanhoLista++;
	}
	
	public void remove(int index) {								//remove
		if (index == 0) {										//para remover o primeiro nó/conteúdo/elemento da lista
			primeiroNo = primeiroNo.getNoProximo();
			if (primeiroNo != null) {
				primeiroNo.setNoPrevio(null);
			}
		}else {													//para remover de outro lugar da lista
			NoDuplo<T> noAuxiliar = getNo(index);
			noAuxiliar.getNoPrevio().setNoProximo(noAuxiliar.getNoProximo()); //ex:tira um nó do meio e linka as referencias dos dois nós adjacentes
			if (noAuxiliar != ultimoNo) {
				noAuxiliar.getNoProximo().setNoPrevio(noAuxiliar.getNoPrevio());
			}else {
				ultimoNo = noAuxiliar;
			}
		}
		
		this.tamanhoLista--;
	}
	
	private NoDuplo<T> getNo(int index){	//getNo - para percorrer a lista
		NoDuplo<T> noAuxiliar = primeiroNo;	//significa que vamos começar a percorrer pelo primeiro nó	
		for(int i = 0; (i < index) && (noAuxiliar != null); i++) {
			noAuxiliar = noAuxiliar.getNoProximo();
		}
		
		return noAuxiliar;
		
	}
	
	
	public int size() { 					//size - retorna o tamanho da lista
		return this.tamanhoLista;
	}



	@Override
	public String toString() {
		String strRetorno = "";
		
		NoDuplo<T> noAuxiliar = primeiroNo;
		for(int i = 0; i < size(); i++) {
			strRetorno += "[No{conteúdo=" + noAuxiliar.getConteudo() + "}]===>";
			noAuxiliar = noAuxiliar.getNoProximo();
		}
		strRetorno += "null";
		return strRetorno;
	}
	
	

}
