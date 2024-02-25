package br.com.cdb.bancodigital;

public class Livro {

    private String titulo;
    private String autor;
    private String isbn;
    double preco;
    public double calcularPrecoTotal(){
        return this.preco;
    }

        public String getTitulo() {
        return titulo;
    }

    public void setTituli(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Livro(String titulo, String autor, String isbn, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.preco = preco;
    }

    public Livro() {
    }
}
