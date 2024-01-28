package br.com.cdb.bancodigital;

import br.com.cdb.bancodigital.Calculadora;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner input = new Scanner(System.in);
        int valor1, valor2, resultado = 0;
        char operacao;

        System.out.println("===============================================");
        System.out.println("Seja Bem Vindo ao nosso Sistema de Calculadora!");
        System.out.println("===============================================");

        System.out.println("Digite + para Soma");
        System.out.println("Digite - para Subtração");
        System.out.println("Digite * para Multiplicação");
        System.out.println("Digite / para Divisão");
        System.out.println("Digite P para Operção de Potencialização");
        System.out.println("Digite R para Raiz quadrada");

        System.out.println("Qual Operção você quer Realizar?");


        operacao = input.next().charAt(0);

        if (operacao=='R'){

            System.out.println("Digite Só um Numero");
            valor1 = input.nextInt();
            valor2 = 2;
            calculadora.calcular(valor1, valor2, operacao);
        }else {

            System.out.println("Digite um Numero");
            valor1 = input.nextInt();

            System.out.println("Digite outro Numero");
            valor2 = input.nextInt();

            System.out.println("Qual Operção você quer Realizar?");


            calculadora.calcular(valor1, valor2, operacao);

        }

        System.out.println(calculadora.getResultado());

    }

}