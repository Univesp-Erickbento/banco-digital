package br.com.cdb.bancodigital;

public class Ebook extends Livro{

    private double tamanhoEmMb;

    public double getTamanhoEmMb() {
        return tamanhoEmMb;
    }

    public void setTamanhoEmMb(double tamanhoEmMb) {
        this.tamanhoEmMb = tamanhoEmMb;
    }

    public Ebook() {
    }

    public Ebook(String titulo, String autor, String isbn, double preco, double tamanhoEmMb) {
        super(titulo, autor, isbn, preco);
        this.tamanhoEmMb = tamanhoEmMb;
    }
}
