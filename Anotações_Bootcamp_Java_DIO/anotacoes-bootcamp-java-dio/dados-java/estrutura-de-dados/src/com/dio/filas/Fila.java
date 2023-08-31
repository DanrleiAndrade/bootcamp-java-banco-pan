package com.dio.filas;

public class Fila<T> {

	private No<T> refNoEntradaFila;

	public Fila() {
		this.refNoEntradaFila = null;
	}
	
	public void enqueue(T object) { //método enfileirar
		No novoNo = new No(object);
		novoNo.setRefNo(refNoEntradaFila);
		refNoEntradaFila = novoNo;
	}
	
	public T first() { //método first
		if(!this.isEmpty()) {
			No primeiroNo = refNoEntradaFila;
			while (true) {
				if (primeiroNo.getRefNo() !=null) {
					primeiroNo = primeiroNo.getRefNo();
				}else {
					break;
				}
			}
			return (T) primeiroNo.getObject();
		}
		return null;
	}
	
	public T dequeue() { //método dequeue: 
		if(!this.isEmpty()) {
			No primeiroNo = refNoEntradaFila;
			No noAuxiliar = refNoEntradaFila;
			while (true) {
				if (primeiroNo.getRefNo() !=null) {
					noAuxiliar = primeiroNo;
					primeiroNo = primeiroNo.getRefNo();
				}else {
					noAuxiliar.setRefNo(null);
					break;
				}
			}
			return (T) primeiroNo.getObject();
		}
		return null;
	}
	
	public boolean isEmpty(){
		return refNoEntradaFila == null ? true : false; //if refNoEntradaFila is null=true. else=false
	}

	@Override
	public String toString() {
		String stringRetorno = "";
		No noAuxiliar = refNoEntradaFila;
		
		if (refNoEntradaFila != null) {
			while (true) {
				stringRetorno += "[No{objeto=" + noAuxiliar.getObject() + "}]===>";
								
				if (noAuxiliar.getRefNo() != null) {
					noAuxiliar = noAuxiliar.getRefNo();
				}else {
					stringRetorno += "null";
					break;
				}
			}
		}else {
			stringRetorno = "null";
		}
		
		return stringRetorno;
	}
	
	
	
}
