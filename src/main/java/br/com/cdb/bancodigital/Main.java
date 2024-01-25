package br.com.cdb.bancodigital;

import br.com.cdb.bancodigital.Calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor1, valor2, resultado = 0;
        char operacao;

        System.out.println("===============================================");
        System.out.println("Seja Bem Vindo ao nosso Sistema de Calculadora!");
        System.out.println("===============================================");

        System.out.println("Digite um Numero");
        valor1 = input.nextInt();

        System.out.println("Digite outro Numero");
        valor2 = input.nextInt();

        System.out.println("Qual Operção você quer Realizar?");

        System.out.println("Digite + para Soma");
        System.out.println("Digite - para Subtração");
        System.out.println("Digite * para Multiplicação");
        System.out.println("Digite / para Divisão");

        operacao = input.next().charAt(0);


        Calculadora calculadora = new Calculadora();
        calculadora.calcular(valor1,valor2,operacao);



        System.out.println(calculadora.getResultado());

    }

}