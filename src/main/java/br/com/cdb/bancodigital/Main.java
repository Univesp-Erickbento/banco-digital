package br.com.cdb.bancodigital;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String nomeDaTarefa;
        int opcao = 0;
        String flag = "Continue";
        int contador;

        System.out.println("===============================================");
        System.out.println("Olá Vamos Construir juntos nossa Lista de tarefas!");
        System.out.println("===============================================");

        System.out.println("Escolha uma opção!!!!");
        CriarTarefas criarTarefas = new CriarTarefas();
       // Tarefa t = new Tarefa();
        while (opcao != 6) {
            System.out.println("Digite 1 para adicionar uma Tarefa nova");
            System.out.println("Digite 2 para Remover uma tarefa existente");
            System.out.println("Digite 3 para verficar as tarefas existentes");
            System.out.println("Digite 4 colocar as tarefas em ordem alfabética");
            System.out.println("Digite 5 colocar as tarefas em ordem cronológica");
            System.out.println("Digite 6 para Sair do Sistema !!!");

            opcao = input.nextInt();

            List<String> listaDeString = new ArrayList<>();
            List<Tarefa> listarefas = new ArrayList<>();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome da tarefa que voçê deseja adicionar na lista de tarefas");
                    nomeDaTarefa = input.next();
                    Tarefa t = new Tarefa(nomeDaTarefa);
                     criarTarefas.adicionarTarefa(t);
                    break;

                case 2:
                    System.out.println("Digite o nome da tarefa que voçê deseja REMOVER na lista de tarefas");
                    nomeDaTarefa = input.next();
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
        //    List<String> nomeTarefas =new ArrayList<>(List.of("Erick", "Bento", "Dias","Ferreira"));
//        List<Tarefa> listarefas = new ArrayList<>();
//        for(int i=1; i<=nomeTarefas.size(); i++) {
//            Tarefa tarefa =new Tarefa(i,nomeTarefas.get(i-1));
//            listarefas.add(tarefa);
//            criarTarefas.adicionarTarefa(tarefa);
        //  operacao = input.next().charAt(0);


        //     }

//        Tarefa tarefa2 = new Tarefa();
//        tarefa2.setNome("Bento");
//        tarefa2.setId(2);
//      //  list.add(tarefa2);
//
//        Tarefa tarefa3 = new Tarefa();
//        tarefa3.setNome("Dias");
//        tarefa3.setId(3);
//       // list.add(tarefa3);
//
//        Tarefa tarefa4 = new Tarefa();
//        tarefa4.setNome("Ferreira");
//        tarefa4.setId(4);
//       // list.add(tarefa4);

        //       Tarefa tarefa1 = new Tarefa(1, "Erick");


//        criarTarefas.adicionarTarefa(tarefa1);
//        criarTarefas.adicionarTarefa(tarefa2);
//        criarTarefas.adicionarTarefa(tarefa3);
//        criarTarefas.adicionarTarefa(tarefa4);
        //criarTarefas.listartarefas();
        // criarTarefas.tarefasCronologicas(listarefas);
        //      System.out.println(criarTarefas.listartarefas());
        //System.out.println(criarTarefas.tarefasEmOrdemAlfabetica(criarTarefas.getListaDeTarefas()));
input.close();
    }


}