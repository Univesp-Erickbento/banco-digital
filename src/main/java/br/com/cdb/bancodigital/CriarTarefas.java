package br.com.cdb.bancodigital;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class CriarTarefas {

    List<Tarefa> listaDeTarefas = new ArrayList<>();


    public List<Tarefa> adicionarTarefa(Tarefa tarefa1) {
        if (!listaDeTarefas.contains(tarefa1)) {
            listaDeTarefas.add(tarefa1);
            System.out.println("----------------------------------------------------------------------");
            System.out.println("Tarefa adicionada com Sucesso");
            System.out.println("----------------------------------------------------------------------");

        } else{
            System.out.println("----------------------------------------------------------------------");
            System.out.println("Tarefa Já existente na lista");
            System.out.println("----------------------------------------------------------------------");
    }

        return listaDeTarefas;
    }
    public List<Tarefa> removerTarefas(Tarefa tarefa1){
      //  listartarefas();
        if (listaDeTarefas.contains(tarefa1)) {
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("Tarefa encontrada na Lista deseja realmente remover? digite 1 para Sim ou 2 para Não");
            System.out.println("----------------------------------------------------------------------------------------");
           int confirmar;
            Scanner input = new Scanner(System.in);
            confirmar= input.nextInt();
            if (confirmar==1) {
                listaDeTarefas.remove(listaDeTarefas.remove(tarefa1));
                System.out.println("----------------------------------------------------------------------");
                System.out.println("Tarefa Removida com Sucesso");
                System.out.println("----------------------------------------------------------------------");
            }
        }else {
            System.out.println("----------------------------------------------------------------------");
            System.out.println("Não existe essa tarefa na lista ");
            System.out.println("----------------------------------------------------------------------");
        }
        return listaDeTarefas;
    }

    public List<Tarefa> listartarefas (){
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Essa é a sua lista de tarefas");

        for (int i = 0; i < listaDeTarefas.size(); i++) {
            System.out.println(listaDeTarefas.get(i));
        }
        System.out.println("----------------------------------------------------------------------");

        return listaDeTarefas;
    }
    public List<Tarefa> tarefasEmOrdemAlfabetica() {

        listaDeTarefas.sort(new Comparator<Tarefa>() {
            @Override
            public int compare(Tarefa o1, Tarefa o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Essa é a sua lista de tarefas por Ordem Alfabética");

        for (int i = 0; i < listaDeTarefas.size(); i++) {
            System.out.println(listaDeTarefas.get(i));
        }
        System.out.println("----------------------------------------------------------------------");
        return listaDeTarefas;


    }
    public List<Tarefa> tarefasCronologicas(){

        listaDeTarefas.sort(new Comparator<Tarefa>() {
            @Override
            public int compare(Tarefa o1, Tarefa o2) {
                return o1.getData().compareTo(o2.getData());
            }
        });

        System.out.println("----------------------------------------------------------------------");
        System.out.println("Essa é a sua lista de tarefas por Ordem Cronológica");

        for (int i = 0; i < listaDeTarefas.size(); i++) {
            System.out.println(listaDeTarefas.get(i));
        }
        System.out.println("----------------------------------------------------------------------");
        return listaDeTarefas;
    }


    public List<Tarefa> getListaDeTarefas() {

        return listaDeTarefas;
    }
    }
