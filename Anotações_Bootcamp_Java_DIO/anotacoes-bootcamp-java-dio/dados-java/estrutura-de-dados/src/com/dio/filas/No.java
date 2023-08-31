package com.dio.filas;

public class No<T> {

	private T object; //esse "object" é o conteúdo do nó. parte útil de info do nó.
	private No<T> refNo;
	
	public No() { //constructor: método para inicializar objetos.
	}
	
	public No(T object) { //constructor: método para inicializar objetos.
		
		this.refNo = null;
		this.object = object;
		
	}

	public Object getObject() { //get method returns the value of the variable name
		return object;
	}

	public void setObject(T object) { //set method takes a parameter ( newName ) and assigns it to the name variable
		this.object = object;
	}

	public No getRefNo() {
		return refNo;
	}

	public void setRefNo(No refNo) {
		this.refNo = refNo;
	}

	@Override //to String: method that returns the value given to it in string format
	public String toString() {
		return "No [object=" + object + "]";
	}
	
	
	
}
