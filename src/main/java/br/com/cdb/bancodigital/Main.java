package br.com.cdb.bancodigital;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String nomeDaTarefa;
        int opcao = 0;

        System.out.println("===============================================");
        System.out.println("Olá Vamos Construir juntos nossa Lista de tarefas!");
        System.out.println("===============================================");

        System.out.println("Escolha uma opção!!!!");
        CriarTarefas criarTarefas = new CriarTarefas();

        while (opcao != 6) {
            System.out.println("Digite 1 para adicionar uma Tarefa nova");
            System.out.println("Digite 2 para Remover uma tarefa existente");
            System.out.println("Digite 3 para verficar as tarefas existentes");
            System.out.println("Digite 4 colocar as tarefas em ordem alfabética");
            System.out.println("Digite 5 colocar as tarefas em ordem cronológica");
            System.out.println("Digite 6 para Sair do Sistema !!!");

            opcao = Integer.parseInt(input.nextLine());

            List<String> listaDeString = new ArrayList<>();
            List<Tarefa> listarefas = new ArrayList<>();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome da tarefa que voçê deseja adicionar na lista de tarefas");
                    nomeDaTarefa = input.nextLine();
                    Tarefa t = new Tarefa(nomeDaTarefa);
                     criarTarefas.adicionarTarefa(t);
                    break;

                case 2:
                    System.out.println("Digite o nome da tarefa que voçê deseja REMOVER na lista de tarefas");
                    nomeDaTarefa = input.nextLine();
                    Tarefa t1 = new Tarefa(nomeDaTarefa);
                    criarTarefas.removerTarefas(t1);
                    break;

                case 3:

                    criarTarefas.listartarefas();
                    break;

                case 4:

                    criarTarefas.tarefasEmOrdemAlfabetica();

                    System.out.println("Tarefas Listada em ordem Alfabética");
                    break;

                case 5:
                    criarTarefas.tarefasCronologicas();
                    System.out.println("Tarefas Listada na ordem cronológica");
                    break;

                default:
                    if (opcao == 6) {
                        continue;

                    }
                    System.out.println("Opção Invalída");
            }
        }
  input.close();
    }


}