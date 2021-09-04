package main;
// criando a classe No
public class No {
    //declarando o no como inteiro
    private int dado;
    //declarando a referencia de no, neste caso o proximo no
    private No refNo = null;

    public No() {
    }

    //construtor
    public No(int dado) {
        this.dado = dado;
    }

    //getters e setters

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public No getRefNo() {
        return refNo;
    }

    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "dado=" + dado +
                '}';
    }
}
