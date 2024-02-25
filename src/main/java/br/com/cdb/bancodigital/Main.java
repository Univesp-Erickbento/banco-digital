package br.com.cdb.bancodigital;

public class Main {
    public static void main(String[] args) {
        LivroFisico livroFisico = new LivroFisico("Livro Físico", "Autor Físico", "123456", 29.99, 1.5, 5.0);
        Ebook ebook = new Ebook("Ebook", "Autor Ebook", "789012", 19.99, 2.0);

        LivroFisico livroFisico2 = new LivroFisico("Livro Físico2", "Autor Físico2", "123456", 49.99, 1.5, 10.0);
        Ebook ebook2 = new Ebook("Ebook2", "Autor Ebook2", "889012", 29.99, 4.0);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarLivro(livroFisico);
        carrinho.adicionarLivro(ebook);

        carrinho.adicionarLivro(livroFisico2);
        carrinho.adicionarLivro(ebook2);

        System.out.println("Preço total do livro físico: $" + livroFisico.calcularPrecoTotal());
        System.out.println("Preço total do ebook: $" + ebook.calcularPrecoTotal());
        System.out.println("Preço total do frete: $" + (livroFisico.calcularPrecoTotal() - livroFisico.getPreco()));
        System.out.println("Preço total do carrinho de compras: $" + carrinho.calcularTotal());
    }
    }
