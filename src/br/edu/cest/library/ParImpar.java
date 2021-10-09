package br.edu.cest.library;

/**
 *
 * @author Aquilles
 */
public class ParImpar {
    private int valor;

    public ParImpar(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public void resultado() {
        if ((this.valor % 2) == 0) {
            System.out.println("O valor: " + this.valor + " é PAR!");
    } else {
            System.out.println("O valor: " + this.valor + " é ÍMPAR!");

    }
}    
}
