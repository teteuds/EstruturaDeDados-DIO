package main;

public class Pilha {

    private No refNoEntradaPilha;

    //construtor da classe
    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    //metodo push acrescenta um no na pilha - empilha
    /*
    * 1 - Guarda a referencia de topo
    * 2 - pega a referencia de topo e seta como novo no
    * 2.1 - a referencia vai ser o no que acabou de ser empilhado
    * 3 - o no que acabou de ser empilhado se refere ao no que ta embaixo dele e o antigo no
    * */
    public void push(No novoNo){
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }

    //metodo que exclui o ultimo elemento a ser inserido
    /*
    * 1 - verifica se a pilha está vazia se estiver retorna null
    * */
    public No pop(){
        if(!isEmpty()){
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPoped;
        }
        return null;
    }

    //metodo top para retornar a referencia
    public No top(){
        return refNoEntradaPilha;
    }

    //metodo para verificar se a pilha esta vazia
    public boolean isEmpty() {
        return refNoEntradaPilha == null ? true : false;
    }

    @Override
    public String toString(){
        String stringRetorno = "---------------\n";
        stringRetorno += "     Pilha\n";
        stringRetorno += "---------------\n";

        No noAuxiliar = refNoEntradaPilha;

        while (true){
            if(noAuxiliar != null){
                stringRetorno += "[No{dado = " + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            }else{
                break;
            }
        }
        stringRetorno += "===============\n";
        return stringRetorno;
    }
}
