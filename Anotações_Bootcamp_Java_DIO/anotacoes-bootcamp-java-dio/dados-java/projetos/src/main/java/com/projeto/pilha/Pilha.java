package com.projeto.pilha;

public class Pilha {

    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public void push(No novoNo){
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNO(refAuxiliar);
    }

    public No pop(){
        if (this.isEmpty()){
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNO();
            return noPoped;
        }
        return null;
    }

    public No top(){
        return refNoEntradaPilha;
    }

    public boolean isEmpty(){
        if (refNoEntradaPilha == null){
           return true;
        }
        return false;

        /*o "if até o último "return" pode ser refatorado em
        uma única linha, assim:
        return refNoEntradaPilha == null ? true : false;
         */
    }

    @Override
    public String toString(){

        String stringRetorno = "-----------\n";
        stringRetorno += " Pilha\n";
        stringRetorno = "-----------\n";

        No noAuxiliar = refNoEntradaPilha;

        while (true){
            if (noAuxiliar != null){
                stringRetorno += "[Nó{dado= " + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNO();
            }else {
                break;
            }
        }
        stringRetorno += "----------\n";
        return stringRetorno;

    }

}
