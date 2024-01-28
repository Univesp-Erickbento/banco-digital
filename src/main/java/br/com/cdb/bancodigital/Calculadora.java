package br.com.cdb.bancodigital;

public class Calculadora {
    private double valor1;
    private double valor2;
    private double resultado;
    private char operacao;


      private double soma(double valor1, double valor2){
        this.valor1 = valor1;
        this.valor2 = valor2;

        this.resultado = valor1 + valor2;

        return resultado;
    }

    private double subtracao(double valor1, double valor2){
        this.valor1 = valor1;
        this.valor2 = valor2;

        this.resultado = valor1 - valor2;

        return resultado;
    }
    private double multiplicacao(double valor1, double valor2){
        this.valor1 = valor1;
        this.valor2 = valor2;

        this.resultado = valor1 * valor2;

        return resultado;
    }
    private double divisao(double valor1, double valor2){
        this.valor1 = valor1;
        this.valor2 = valor2;

        this.resultado = valor1 / valor2;

        return resultado;
    }

    private double potencia(double valor1, double valor2){
        this.valor1 = valor1;
        this.valor2 = valor2;

        this.resultado = Math.pow(valor1 , valor2);

        return resultado;
    }

    private double raiz(double valor1){
        this.valor1 = valor1;

        this.resultado = Math.sqrt(valor1);

        return resultado;
    }

    public double calcular(double valor1, double valor2, char operacao){
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.operacao = operacao;

        if (operacao=='R'){

            resultado= raiz(valor1);
        }else if (operacao=='+'){
            resultado= soma(valor1,valor2);
        }else if (operacao=='-'){
            resultado= subtracao(valor1,valor2);
        }else if (operacao=='*'){
            resultado= multiplicacao(valor1,valor2);
        }else if (operacao=='/'){
            resultado= divisao(valor1,valor2);
        }else if (operacao=='P'){
            resultado= potencia(valor1,valor2);

        }else {
            System.out.println("Entrada Inválida");

        }

        return resultado;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    
}
