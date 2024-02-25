package br.com.cdb.bancodigital;

import java.util.ArrayList;

public class CarrinhoDeCompras {

  private   ArrayList<Livro> livros;

  public CarrinhoDeCompras() {

      this.livros = new ArrayList<Livro>();
  }
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public double calcularTotal() {
        double total = 0;
        for (Livro livro : livros) {
            total += livro.calcularPrecoTotal();
        }
        return total;
    }
    public double calcularTotal ( ArrayList<Livro> livros){
        double precoTotal = 0.0;
        return precoTotal;
    }

}
